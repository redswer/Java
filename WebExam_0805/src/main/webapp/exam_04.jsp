<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = "김사원";
	String gender = "M";
	String birth = "900715";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = 1>
		<tr>
			<td>이름</td>
			<td><%= name %></td>
		</tr>
		<tr>
			<td>성별</td>
			<%
				if(gender.equals("M")) {			
			%>
			<td>남자</td>
			<%
				} else {
			%>
			<td>여자</td>
			<%
				}
			%>
		</tr>
		<tr>
			<td>생년월일</td>
			<%
				String year = birth.substring(0, 2) + "년";
				String month = birth.substring(2, 4) + "월";
				String day = birth.substring(4, 6) + "일";
			%>
			<td><%= year + month + day %></td>
		</tr>
	</table>
</body>
</html>