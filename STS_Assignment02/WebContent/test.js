$(document).ready(function () {
	$('#banner1').click(function () {
		alert('비즈니스 사이트로 이동하시겠습니까?');
		$('#main').html('<h1>비즈니스 사이트</h1>');
	});
	$('#banner2').click(function () {
		alert('AI 기술 사이트로 이동하시겠습니까?');
		$('#main').html('<h1>AI 기술 사이트</h1>');
	});
	$('#login').click(function (){
		var _id = $('#id').val();
		if (_id == '') {
			alert ("ID를 입력하세요");
			return;
		}
		var _pw = $('#pw').val();
		if (_pw == '') {
			alert ("PW를 입력하세요");
			return;
		}
		alert(_id+':'+_pw);
		
		$.ajax({
			type : "post",
			url: "http://localhost:8383/STS_Assignment02/login",
			data : {id: _id, pw: _pw},
			success : function (data, status) {
				alert(data+status);
			},
			error: function () {
				alert("에러 발생");
			}
		});
		$('#loginForm').html("<input id='login' type='submit' value='LOGOUT'>");
		$('#member').html("MY ID : "+_id);
	});
});