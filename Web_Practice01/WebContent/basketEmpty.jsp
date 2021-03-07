<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>장바구니가 비었습니다</h1>
	<a href="shop.jsp">쇼핑하기</a> <br>
 
	<a href='login_index.jsp'>홈으로 이동</a> <br> 
 
	<form action="main" method="get">
	<input type="hidden" name="signal" value="logout">
	<input type="submit" value="로그아웃">
</body>
</html>