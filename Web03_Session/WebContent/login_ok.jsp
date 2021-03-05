<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- <%
		String id=(String) session.getAttribute("id");
		out.write(id);		
	%> --%>
	${id } 로그인 성공!
	
	<form action="main"> 
	<input type="hidden" name= "sign" value="logout">
	<input type="submit" value="logout">
	</form>
	
	<hr>
	<form action="main">
	<input type="hidden" name="sign" value="basketInsert">
	<input type="radio" name="product" value="apple">
	<input type="radio" name="product" value="banana">
	<input type="submit" value="cart">
</body>
</html>