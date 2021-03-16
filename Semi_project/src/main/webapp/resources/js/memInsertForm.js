$(document).ready(function(){
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
		
		$.ajax({
			type: "post",
			url: "http://localhost:8383/member/memInsert.camp",
			data: { name:_name, id:_id, pw:_pw, phone:_phone, birth:_birth },
			success: function(data){
				alert(data);
			},
			complete: function() {
				self.close();
			}
		});
	});
});