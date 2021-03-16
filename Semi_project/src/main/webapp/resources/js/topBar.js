$(document).ready(function(){
	$("#about").click(function(){
		$("#list").hide();
		$(".mainContent").html("<h1>별거 없소</h1>");
	});
	
	$("#contact").click(function(){
		$("#list").hide();
		$(".mainContent").load("/contact.camp");
	});
});