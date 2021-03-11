<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
	<table border="1"  align="center"  width="80%">
   		<tr align="center"   bgcolor="lightgreen">
  			<td><b>번호</b></td>
      		<td><b>아이디</b></td>
      		<td><b>비밀번호</b></td>
      		<td><b>이름</b></td>      		
      		<td><b>가입일</b></td>
      		<td><b>삭제</b></td>
   </tr>
	<c:forEach var="member" items="${memberList }" varStatus="i">
		<tr align="center">
			<td>${i.count}</td>
			<td>${member.id }</td>
			<td>${member.pw }</td>
			<td>${member.name }</td>
			<td>${member.date }</td>
			<td><a href="removeMember.do?id=${member.id}">삭제하기<a></td>
		</tr>
	</c:forEach>
	</table>
	<a href="memberForm.do"><h1 style="text-align:center">회원가입</h1></a>
			
</body>
</html>