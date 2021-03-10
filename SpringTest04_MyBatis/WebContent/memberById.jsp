<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="30%">
		<tr align="center" bgcolor="lightgreen">
			<th colspan = "3" > ${memberVO.id }로 검색한 회원 정보</th>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>이름</td>
			<td>가입일</td>
		</tr>	
		<tr>
			<td>${memberVO.pw }</td>
			<td>${memberVO.name }</td>
			<td>${memberVO.date }</td>
		</tr>	
	</table>	
</body>
</html>