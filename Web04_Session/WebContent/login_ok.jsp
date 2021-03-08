<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${id }~ Welcome
<form action="main">
	<input type="hidden" name="sign" value="logout">
	<input type="submit" value="로그아웃">
</form>

<hr>

<form action="main">
	<input type="hidden" name="sign" value="basketInsert">
	냉장고<input type="radio" name="product" value="냉장고"> <br>
	TV<input type="radio" name="product" value="TV"> <br>
	세탁기<input type="radio" name="product" value="세탁기"> <br>
	<input type="submit" value="장바구니 담기"> <br>
</form>



<%--
지시어 	: <%@ page, include, taglib %>
선언 		: <%! 멤버변수, 메서드 %>
스크립트릿 : <% 서비스메서드 %>
EL 		: <%= 출력 %>
--%>

</body>
</html>