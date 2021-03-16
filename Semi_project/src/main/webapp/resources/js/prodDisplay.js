$(document).ready(function(){
	$("#category0").click(function(){
		$(".tent").show();
		$(".bed").show();
		$(".table").show();
		$(".cook").show();
		$(".heater").show();
		$(".acc").show();
	});
		
	$("#category1").click(function(){
		$(".tent").show();
		$(".bed").hide();
		$(".table").hide();
		$(".cook").hide();
		$(".heater").hide();
		$(".acc").hide();
	});
	
	$("#category2").click(function(){
		$(".tent").hide();
		$(".bed").show();
		$(".table").hide();
		$(".cook").hide();
		$(".heater").hide();
		$(".acc").hide();
	});
	
	$("#category3").click(function(){
		$(".tent").hide();
		$(".bed").hide();
		$(".table").show();
		$(".cook").hide();
		$(".heater").hide();
		$(".acc").hide();
	});
	
	$("#category4").click(function(){
		$(".tent").hide();
		$(".bed").hide();
		$(".table").hide();
		$(".cook").show();
		$(".heater").hide();
		$(".acc").hide();
	});
	
	$("#category5").click(function(){
		$(".tent").hide();
		$(".bed").hide();
		$(".table").hide();
		$(".cook").hide();
		$(".heater").show();
		$(".acc").hide();
	});
	
	$("#category6").click(function(){
		$(".tent").hide();
		$(".bed").hide();
		$(".table").hide();
		$(".cook").hide();
		$(".heater").hide();
		$(".acc").show();
	});
});