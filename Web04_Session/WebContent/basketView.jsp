<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${id }님의 장바구니
<hr>

<%
ArrayList<String> list = (ArrayList <String>)session.getAttribute("basket");

for (String product : list) {
	out.write(product + "<br>");
}
%>

<hr>
<a href='index.jsp'> 홈으로 </a> <br>
<a href='login_ok.jsp'> 계속 쇼핑하기 </a> <br>
<form action="main">
	<input type="hidden" name="sign" value="logout">
	<input type="submit" value="로그아웃">
</form>

</body>
</html>