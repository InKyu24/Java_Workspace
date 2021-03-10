<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="30%">
		<tr align="center" bgcolor="lightgreen">
			<th colspan = "4" > ${m.pw }로 검색한 회원 정보</th>
		</tr>
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>이름</td>
			<td>가입일</td>
		</tr>	
		<c:forEach var="m" items="${list }" varStatus="i">
			<tr>
				<td>${i.count }</td>
				<td>${m.id }</td>
				<td>${m.name }</td>
				<td>${m.date }</td>
			</tr>
		</c:forEach>
	</table>	
</body>
</html>