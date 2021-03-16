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
			url: "/member/memInsert.camp",
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
	
$(document).ready(function(){
	$('#memFindId').click(function(){ // 아이디 찾기 처리
		var _name = $('#nameForId').val();
		var _birth = $('#birthForId').val();
		var _phone = $('#phoneForId').val();
		
		if (_name == '') {
		alert("이름을 입력해주세요.");
		return;
		}		
		if (_birth == '') {
		alert("생년월일을 입력해주세요.");
		return;
		}
		if (_phone == '') {
		alert("전화번호를 입력해주세요.");
		return;
		}
		$.ajax({
			type: "post",
			url: "/member/memFindId.camp",
			data: { name:_name, birth:_birth, phone:_phone },
			success: function(data){
				alert(data);			
			},
			complete: function() {
				self.close();
			}
		})
	});
});
	
$(document).ready(function(){
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
		
		$.ajax({
			type: "post",
			url: "/member/memFindPw.camp",
			data: { name:_name, id:_id, phone:_phone, birth:_birth },
			success: function(data){
				alert(data);
			},
			complete: function() {
				self.close();
			}
		})
	});
});