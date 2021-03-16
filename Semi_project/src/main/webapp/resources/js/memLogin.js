$(document).ready(function(){
	$("#memLogin").click(function(){//로그인 처리	
		
		var _id=$("#id").val();
		var _pw=$("#pw").val();
		
		if (_id == '' || _pw == '') {
			alert("아이디 또는 비밀번호가 입력되지 않았습니다.")
		}
		
		$.post("/member/memLogin.camp",
			{id:_id, pw:_pw},
			function(data){
			alert(data);
			$("#memInfo").html(data);
			$("#memProfile").html("<a class='nav-link' href='#' id='myProfile'>my Profile</a>");
		})
	});
});