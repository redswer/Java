<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int a = 10;
	int b = 20;
	int c = a + b;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%= %> : 출력 --%>
	<h1>a = <%= a %></h1>
	<h1>b = <%= b %></h1>
	<h1>c = <%= c %></h1>
</body>
</html>