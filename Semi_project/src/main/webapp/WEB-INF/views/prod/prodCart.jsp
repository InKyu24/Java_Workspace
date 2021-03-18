<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<body>
	<article class="container">
	            <div class="col-lg-9 my-4">
	                <form role="form">
	                    
	             		<div id="basketDiv"  class="form-group"><h3>장바구니가 비어있습니다.</h3></div>
	
	                    <div class="form-group text-center">
	                    	<input type="button" id="orderBtn" class="btn btn-warning" value="주문하기">
	                    	                        
	                        <input type="button" id="anotherBtn" class="btn btn-info" value="다른 상품 추가 주문" onclick="location.href='main.camp'"> 
	                        
	                      	<input type="button" id="cancelBtn" class="btn btn-primary" value="장바구니 비우기"> 
	                    </div>
	                </form>
				</div>
        </article>
       <script src="${contextPath}/resources/js/prodForm.js"></script>
</body>
	<script>
		var basket=$.cookie("basket");	// 쿠키에 저장된 basket을 가져와
		var obj=null;
		if(basket){ 													//쿠키에 저장된 basket이 있다면
			obj=JSON.parse(basket); // json을 javascript 객체로 바꿔서
			let basket_html="";
			var items="";
			obj.product.forEach(function(item){ // 하나씩의 아이템(품목)을 꺼내서				
				
				basket_html += '<table align="center"><h3>장바구니를 확인해주세요</h3>'					
				basket_html += '<tr><th><label for="prodName"> 품목 </label></th>'
				basket_html += '<th><label for="prodQuan"> 수량 </label></th></tr>'
						
				basket_html += '<tr><td><input size="35" type="text"  id="prodName" value="'+item.name+'" disabled="disabled" align="center"></td>'
				basket_html += '<td><input type="number" min="1"  max="100" step="1" value="'+item.quantity+'" id="prodQuan"/></td></tr></table>'
						
				/* basket_html += '<label for="prodName"> 품목 </label>';
				basket_html += '<input size="35" type="text"  id="prodName" value="'+item.name+'" disabled="disabled" align="center">';				
				basket_html += '<label for="prodQuan"> 수량 </label>';
				basket_html += '<input type="number" min="1"  max="100" step="1" value="'+item.quantity+'" id="prodQuan"/>';
				basket_html += '<br>'; */
				
				items += item.name +" : "+ item.quantity +"개\n";
			});
			alert(items);
			$("#basketDiv").html(basket_html);
		}
		
		
	</script>
