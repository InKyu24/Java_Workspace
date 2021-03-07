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
	String name = (String) session.getAttribute("name");
	if (name == null) {
		name="guest";
	}
%>

<h1><%= name %>님 행복한 쇼핑되세요</h1>
	<form action="main">
	<input type="hidden" name="signal" value="basketInsert">
	<table border="1">
	<tr>	<th>검은색</th>
			<th>회색</th>
			<th>흰색</th>
	<tr>	<td bgcolor="black" width="200px" height="200px"></td>
			<td bgcolor="gray" width="200px" height="200px"></td>
			<td bgcolor="white" width="200px" height="200px"></td>
	<tr>	<td><input type="radio" name="product" value="검은색"></td>
			<td><input type="radio" name="product" value="회색"></td>
			<td><input type="radio" name="product" value="흰색"></td>
	
	</table>	
	<br>
	<input type="submit" value="장바구니에 담기">
	</form>
	
	<form action="main">
	<input type="hidden" name="signal" value="basketView">
	<input type="submit" value="장바구니 보기">
	</form>
	
	<form action="main" method="get">
	<input type="hidden" name="signal" value="logout">
	<input type="submit" value="로그아웃">
	
</body>
</html>