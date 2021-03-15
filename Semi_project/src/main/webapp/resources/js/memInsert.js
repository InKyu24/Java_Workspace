$(document).ready(function(){
	$("#memInsert").click(function(){ //회원 가입 처리
		var _name=$("#name").val();
		var _id=$("#id").val();
		var _pw=$("#pw").val();
		var _pw2=$("#pw2").val();
		
		$.get("../memberInsert.Camp",
			  {
			    name:name,
			    id:id,
			    pw:pw
			  },
			  function(data, status){
			    alert(data);
				alert(status);
			  });
	});

});
