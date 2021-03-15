$(document).ready(function(){
	$('#memInsert').click(function(){ //회원 가입 처리
		var _name = $('#name').val();
		var _id = $('#id').val();
		var _pw = $('#pw').val();
		var _pw2 = $('#pw2').val();
		
		alert(_name+":"+_id+":"+_pw+":"+_pw2);
	});
});