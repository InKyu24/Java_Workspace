<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<h1>아래의 내용으로 회원 가입되었습니다.</h1>
		<table border="1">
			<tr align="center">
				<td>아이디</td>
				<td>${id }</td>
			</tr>
			
			<tr align="center">
				<td>비밀번호</td>
				<td>${pw }</td>
			</tr>
			<tr align="center">
				<td>이름</td>
				<td>${name }</td>
			</tr>			
			<tr align="center">
				<td>이메일</td>
				<td>${email }</td>
			</tr>				
		</table>
	
</body>
</html>