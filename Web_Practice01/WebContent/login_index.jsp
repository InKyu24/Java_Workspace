<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("id");
	System.out.println(id+"의 세션: \t"+session.getId());
%>
<%= id %>님 환영합니다. <br>

	<form action="main" method="get">
	<input type="hidden" name="signal" value="logout">
	<input type="submit" value="로그아웃">
	</form>
	<a href="shop.jsp">쇼핑하러 가기</a>
	<a href='memberInsert.html'>회원가입</a> <br>
	<a href='main?signal=memberList'>회원 조회</a>
	
</body>
</html>