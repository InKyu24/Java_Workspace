<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List,web.util.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>모든 회원 조회를 완료하였습니다.</h1>
<table border="1">
<tr>
<b><th>번호</th><th>아이디</th><th>비밀번호</th><th>이름</th></b>
</tr>
<%
int i=0;
List <MemberVO> memberList = (List <MemberVO>)request.getAttribute("list");
for (MemberVO m: memberList) {
	i +=1;
	out.append("<tr><td>"+ i + "</td><td>"+m.getId() + "</td><td>" + m.getPw() + "</td><td>" + m.getName() + "</td></tr>");
};
%>
</table>
<hr>

<form>
<h2> 회원 삭제 </h2>
<input type="hidden" name="signal" value="memberDelete">
ID <input name="id"> <br>
<input type="submit" value="Delete">
</form>

</body>
</html>