$(document).ready(function () {
	$('#banner1').click(function () {
		alert('비즈니스 사이트로 이동하시겠습니까?');
		$('#main').html('<h1>비즈니스 사이트</h1>');
	});
	$('#banner2').click(function () {
		alert('AI 기술 사이트로 이동하시겠습니까?');
		$('#main').html('<h1>AI 기술 사이트</h1>');
	});
	
/*	$('#login').click(function (){
		$.post(
			"/",
			
			JSON.stringify({
					sign:"login",
					id:$("#id").val(),
					pw:$("#pw").val()
		    }),
		    
		    function(msg,status){
					var obj=JSON.parse(msg);
					$("#msgDiv").html(obj.id+"님 환영합니다");
					$('#loginForm').html("<input id='login' type='submit' value='LOGOUT'>");
					$('#member').html("MY ID : "+id);
			});
	});*/
			
/*	$('#login').click(function (){	
		var id = $('#id').val();
		var pw = $('#pw').val();
		alert(id+':'+pw);{
		$.ajax({
				type: 'post',
				success:function(){
					alert("Data: "+id+"님 login ok\nStatus: success");
				}
			});		
		}
		$('#loginForm').html("<input id='login' type='submit' value='LOGOUT'>");
		$('#member').html("MY ID : "+id);
	});*/
	
	$('#login').click(function (){
		var id = $('#id').val();
		var pw = $('#pw').val();
		$.ajax({			
				type: 'post',
				success:function(){
					alert(id+':'+pw);
				},
				complete:function(){
					alert("Data: "+id+"님 login ok\nStatus: success");
					$('#loginForm').html("<input id='login' type='submit' value='LOGOUT'>");
					$('#member').html("MY ID : "+id);
				}
			});		
	});

	
});