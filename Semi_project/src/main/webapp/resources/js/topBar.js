$(document).ready(function(){
	$("#about").click(function(){
		$("#list").hide();
		$(".mainContent").html("<h1>쇼핑몰 소개 공간 준비 중 입니다.</h1>");
	});
	
	$("#comm").click(function(){
		$("#list").hide();
		$(".mainContent").html("<h1>커뮤니티 공간 개설 준비 중 입니다.</h1>");
        
	});
});

$(document).on("click", "#cart", function(event) { // 장바구니
	$(".mainContent").load("/prod/cart.camp");
});