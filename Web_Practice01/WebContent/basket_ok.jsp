<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>성공적으로 장바구니에 담겼습니다</h1>
		
	<a href="shop.jsp">계속 쇼핑하기</a> <br>
	
	<a href='login_index.jsp'>홈으로 이동</a> <br>
	 
	<form action="main">
	<input type="hidden" name="signal" value="basketView">
	<input type="submit" value="장바구니 보기"> <br>
	
	<form action="main" method="get">
	<input type="hidden" name="signal" value="logout">
	<input type="submit" value="로그아웃">
	
</body>
</html>