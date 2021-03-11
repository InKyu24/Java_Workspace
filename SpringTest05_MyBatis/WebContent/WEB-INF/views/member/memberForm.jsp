<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
        
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입창</title>
<style>
   .text_center{text-align:center;}
</style>
</head>
<body>
 	<form method = "post" action = "addMember.do">
	<h1 class="text-center">회원 가입창</h1>
	<table align="center">
		<tr>
			<td width="200"><p align="right">사용자 아이디</p></td>
			<td width="400"><input type="text" name="id"></td>
		</tr>
		<tr>
			<td width="200"><p align="right">비밀번호</p></td>
			<td width="400"><input type="password" name="pw"></td>
		</tr>
		<tr>
			<td width="200"><p align="right">이름</p></td>
			<td width="400"><input type="text" name="name"></td>
		</tr>
		<tr>
			<td width="200"><p>&nbsp;</p></td>
			<td width="400"><input type="submit" value="가입하기"><input type="reset" value="다시 입력"></td>
		</tr>
	</table>
	</form>
</body>
</html>