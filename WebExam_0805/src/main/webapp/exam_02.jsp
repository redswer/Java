<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1 ~ 10</title>
</head>
<body>
	<% int tot = 0;
		for(int i = 1; i <= 10; i++) {
			tot += i;
	%>
		<h3>i = <%= i %></h3>
	<%
		}
	%>
	
	<h3>합계 : <%= tot %></h3>
</body>
</html>