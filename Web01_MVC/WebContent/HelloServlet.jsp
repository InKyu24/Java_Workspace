<%@ page contentType="text/html; charset=UTF-8" %>
<%!
	int i = 10;
	
	public void printI () {		
		System.out.println(i);
	}
%>
	<h1> 여기가 JSP 입니다</h1>
	<br>
<%= i++ %>	

<%	
printI();
%>
