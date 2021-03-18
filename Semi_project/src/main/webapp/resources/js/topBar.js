$(document).ready(function(){
	$("#about").click(function(){
		$("#list").hide();
		$(".mainContent").html("<h1>별거 없소</h1>");
	});
	
	$("#contact").click(function(){
		$("#list").hide();
        
	});
});

$(document).on("click", "#cart", function(event) { // 장바구니
	$(".mainContent").load("/prod/cart.camp");
});