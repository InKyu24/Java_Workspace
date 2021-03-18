$(document).ready(function(){
	$("#orderBtn").click(function(){ // 주문하기
//		로컬변수 confirm_data
		let confirm_order=confirm("다음과 같이 주문하시겠습니까?\n"+items);		
		if(confirm_order){
			alert("주문완료");
		}
		
	});

	$("#cancelBtn").click(function(){ // 장바구니 비우기
		alert("장바구니를 모두 비웁니다");		
		$.removeCookie("basket", { path: '/' });
		$(".mainContent").load("/prod/cart.camp");
		
	});

	$(".orderForm").click(function(choice){                       // 상품을 클릭했을 때
		var logined=$.cookie("logined");
		if (logined){	
			let choiced_product=choice.target.name;
			let confirm_choice= confirm(choiced_product+"를 장바구니에 담을까요?");
			if (confirm_choice) {
				
				let basket=$.cookie("basket");
				let obj=null;
				if(basket){                                                                  // 쿠키에 기존 상품이 들어가 있다면
					obj=JSON.parse(basket);// json 객체의 basket을 javascript 객체로 바꿔
					let flag=true;   // flag가 T
					obj.product.forEach(function(item){  // 하나씩의 아이템(품목)을 꺼내서
						
						if(item.name==choiced_product){                                                                 // 그리고 품목 이름이 클릭한 상품의 이름과 같으면
							item.quantity +=1;                                                                            //상품의 수량을 1증가
							alert("장바구니에 "+item.name+"제품이 "+item.quantity+"개가 되었습니다.");
							flag=false;
						}
					});
					if(flag){                                                                                         // 하지만 품목 이름이 클릭한 상품의 이름과 다르면
						obj.product.push({name:choiced_product ,quantity:1});                                        //새 품목 추가
						//alert("else:"+obj.product[obj.product.length-1].name+":"+obj.product[obj.product.length-1].quantity);
					}
		      
		      
				}else{                                                                              //쿠키에 장바구니가 없으면 
					obj={
						product:[{name:choiced_product,quantity:1}]                                   //첫 품목 추가
					};
				}
					basket=JSON.stringify(obj); // 자바스크립트 객체를 json 형식으로 바꿔서
					$.cookie("basket",basket, { path: '/' });// 장바구니 쿠키 저장
					$(".mainContent").load("/prod/cart.camp");
			}	
		} else {
			alert ("회원만 상품구매가 가능합니다.\n회원가입 후 이용해주세요.")
		}
			
	});

	$("#category0").click(function(){
		$(".tent").show();
		$(".bed").show();
		$(".table").show();
		$(".cook").show();
		$(".heater").show();
		$(".acc").show();
	});
		
	$("#category1").click(function(){
		$(".tent").show();
		$(".bed").hide();
		$(".table").hide();
		$(".cook").hide();
		$(".heater").hide();
		$(".acc").hide();
	});
	
	$("#category2").click(function(){
		$(".tent").hide();
		$(".bed").show();
		$(".table").hide();
		$(".cook").hide();
		$(".heater").hide();
		$(".acc").hide();
	});
	
	$("#category3").click(function(){
		$(".tent").hide();
		$(".bed").hide();
		$(".table").show();
		$(".cook").hide();
		$(".heater").hide();
		$(".acc").hide();
	});
	
	$("#category4").click(function(){
		$(".tent").hide();
		$(".bed").hide();
		$(".table").hide();
		$(".cook").show();
		$(".heater").hide();
		$(".acc").hide();
	});
	
	$("#category5").click(function(){
		$(".tent").hide();
		$(".bed").hide();
		$(".table").hide();
		$(".cook").hide();
		$(".heater").show();
		$(".acc").hide();
	});
	
	$("#category6").click(function(){
		$(".tent").hide();
		$(".bed").hide();
		$(".table").hide();
		$(".cook").hide();
		$(".heater").hide();
		$(".acc").show();
	});
});