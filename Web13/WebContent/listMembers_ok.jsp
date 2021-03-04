<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List,web.util.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action='main'>
<input type='hidden' name='sign' value='memberDelete'>
<input name='id'><input type='submit' value='회원 삭제'></form>
<table border='1'>
<tr><th>id</th><th>pw</th><th>name</th>

<%
List<MemberVO> list = (List <MemberVO>)request.getAttribute("list");
for (MemberVO m:list) {
	out.append("<tr><td>"+m.getId() + "</td><td>" + m.getPw() + "</td><td>" + m.getName() + "</td></tr>");
};
%>
				
</table>
<a href='index.html'>홈으로 가기</a>
</body>
</html>