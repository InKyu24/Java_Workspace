	$(document).ready(function() {
		$("#memInsertForm").click(function () {
			var v="id <input id='id'> <br> pw <input type='password' id='pw'> <br> name <input id='name'> <br> <input type='button' value='회원가입' id='memberInsertBtn'>"
			$("#mainDiv").html(v);
		});
		
		$("#loginBtn").click(function () {
			$.post("main",
			JSON.stringify({
					sign: "login",
					id:$("#id").val(),
					pw:$("#pw").val()
			}),function(msg,status){
					var obj = JSON.parse (msg);
					if (obj.msg != null) {
						alert(obj.msg);
					} else {
						if (obj.name != null) {
							$("#loginDiv").html(obj.name+"님 환영합니다");
							$("#mainDiv").html("<h1>즐거운 쇼핑 되세요</h1>");
						} else {
							alert("재로그인이 필요하다")
						}
					}
			});
		});
	});