$(document).ready(function(){
	$('.navbar-brand').click(function(login) {
		window.open('login.html', '로그인', 'width=450, height=300, menuber=no, status=no, toolbar=no');
		login.preventDefault();
		
	});
	
	$('.join').click(function(join){
		window.open('join.html', '회원가입', 'width=400, height=700, menuber=no, status=no, toolbar=no');
		join.preventDefalut();
	});
});