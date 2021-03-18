$(document).on("click", "#logout", function(event) { //로그아웃 처리	
	$.post("/member/logout.camp",
		{ },
		function(data, status){
		$.removeCookie("name");		  	
		$.removeCookie("logined");
		$.removeCookie("cart");
		$.removeCookie("basket", { path: '/' });				// 장바구니 비우기 (계정마다 다른 장바구니로 구현 가능할 때 변경?)
		location.reload();						   
	  	}
	);//end post() 
});//end 로그아웃 처리

$(document).ready(function(){
	$("#login").click(function(){//로그인 처리	
		
		var _id=$("#id").val();
		var _pw=$("#pw").val();
		
		if (_id == '' || _pw == '') {
			alert("아이디 또는 비밀번호가 입력되지 않았습니다.")
		}
		
		$.post("/member/login.camp",
			{id:_id, pw:_pw},
			function(data, status){
				var obj = JSON.parse(data);
				if (obj.msg) {
					alert(obj.msg);
			  		location.reload();
			  	} else {
			  	
			  		data = obj.logoutBtn
			  		$.cookie("logined",data);
			  		$("#loginDiv").html(data);
			  		
			  		data = obj.memCart	
			  		$.cookie("cart",data);
			  		$("#cartLi").html(data);
		  		}
			}
		);
			
	});
		
	
	$('#memInsert').click(function(){ //회원 가입 처리
		var _name = $('#name').val();
		var _id = $('#id').val();
		var _pw = $('#pw').val();
		var _pw2 = $('#pw2').val();
		var _phone = $('#phone').val();
		var _birth = $('#birth').val();
		
		if (_id == '') {
		alert("아이디를 입력해주세요.");
		return;
		}
		
		if (_name == '') {
		alert("이름을 입력해주세요.");
		return;
		}
		
		if (_pw == '') {
		alert("비밀번호를 입력해주세요.");
		return;
		}
		
		if (_pw != _pw2) {
		alert("비밀번호 확인과 일치하지 않습니다.");
		return;
		}
		
		if (_phone == '') {
		alert("전화번호를 입력해주세요.");
		return;
		}
		
		if (_birth == '') {
		alert("생년월일을 입력해주세요.");
		return;
		}
		
		$.post("/member/memInsert.camp",
			{ name:_name, id:_id, pw:_pw, phone:_phone, birth:_birth },
			function(data, status){
				alert(data)
				self.close();
			}
		);
	});


	$('#memFindId').click(function(){ // 아이디 찾기 처리
		var _name = $('#nameForId').val();
		var _birth = $('#birthForId').val();
		var _phone = $('#phoneForId').val();
		
		if (_name == '') {
		alert("이름을 입력해주세요.");
		return;
		}
		if (_phone == '') {
		alert("전화번호를 입력해주세요.");
		return;
		}
		
		if (_birth == '') {
		alert("생년월일을 입력해주세요.");
		return;
		}
		
		$.post("/member/memFindId.camp",
			{ name:_name, birth:_birth, phone:_phone },
			function(data, status){
				alert(data);			
				self.close();
			}
		);
	});


	$('#memFindPw').click(function(){ // 비밀번호 찾기 처리
		var _id = $('#id').val();
		var _name = $('#name').val();
		var _phone = $('#phone').val();
		var _birth = $('#birth').val();
		
		if (_id == '') {
		alert("아이디를 입력해주세요.");
		return;
		}		
		if (_name == '') {
		alert("이름을 입력해주세요.");
		return;
		}
		if (_phone == '') {
		alert("전화번호를 입력해주세요.");
		return;
		}
		
		if (_birth == '') {
		alert("생년월일을 입력해주세요.");
		return;
		}
		
		$.post("/member/memFindPw.camp",
			{ name:_name, id:_id, phone:_phone, birth:_birth },
			function(data, status){
				alert(data);		
				self.close();
			}
		);
	});	
});