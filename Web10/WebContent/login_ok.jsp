<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${id }님 반갑습니다</title>

<style type="text/css">
 body {
 	text-align: center;
 	margin-top: 100px;
 	width: 400px;
 	background: #F0F8FF;
 }
 button {
 	border: 3px solid gray; 
 	border-radius: 30px;
 	box-shadow: 5px;
 }
 	
</style>
</head>
<body>
	<p>${id }님 로그인 성공!</p>
	<br>
	<button onClick="window.close()">닫기</button>

</body>
</html>