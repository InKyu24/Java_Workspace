<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="memberInfo.do">
		<h1>회원 가입</h1>
		<table border="1">
			<tr align="center">
				<td>아이디</td>
				<td><input name="id" size="20"></td>
			</tr>
			
			<tr align="center">
				<td>비밀번호</td>
				<td><input name="pw" type="password" size="20"></td>
			</tr>
			<tr align="center">
				<td>이름</td>
				<td><input name="name" size="20"></td>
			</tr>			
			<tr align="center">
				<td>이메일</td>
				<td><input name="email" size="20"></td>
			</tr>				
		</table>
			<input type="submit" value="회원가입">
	</form>
</body>
</html>