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
		var id = $('#id').val();
		var pw = $('#pw').val();
		alert(id+':'+pw);
		$('#loginForm').html("<input id='login' type='submit' value='LOGOUT'>");
		$('#member').html("MY ID : "+id);
	});	
});