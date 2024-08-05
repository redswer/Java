<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>table</title>
</head>
<body>
	<table border = 1>
		<tr align="center">
			<td>번호</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>점수</td>
		</tr>
<%
	for(int i = 1; i <= 10; i++) {
%>
		<tr align="center">
			<td><%= i %></td>
			<td>홍길동</td>
			<td>010-1111-1111</td>
			<td>90</td>
		</tr>
<% 
	}
%>
	</table>
</body>
</html>