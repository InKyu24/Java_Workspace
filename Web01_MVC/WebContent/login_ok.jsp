<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="header.html" %>
<body>


${name } 님 로그인 성공! <br>


<a href='shop.jsp'>쇼핑몰로 이동</a> <br> 
	<jsp:include page='img.html'></jsp:include>
	<br>
	<%!
	int i=1;
	public void printI() {
		System.out.println(i);
	}
	%>
	
 	방문횟수 : <%= i++ %>
 	<%
 		printI();
 	%>
</body>
</html>

