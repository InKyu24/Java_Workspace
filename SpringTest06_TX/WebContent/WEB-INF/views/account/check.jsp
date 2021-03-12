<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>현재 잔액</h1>
	<table border="1"  align="center"  width="80%">
   		<tr align="center"   bgcolor="lightgreen">
  			<td><b>번호</b></td>
      		<td><b>이름</b></td>
      		<td><b>잔액</b></td>
      		<td><b>계좌번호</b></td>      		
   </tr>
	<c:forEach var="acc" items="${accList }" varStatus="i">
		<tr align="center">
			<td>${i.count}</td>
			<td>${acc.name }</td>
			<td>${acc.balance }</td>
			<td>${acc.no }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>