<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table {
		border: 1px solid black;
		border-collapse: collapse;
		width: 300px;
		margin: auto;
	}
	
	th, td {
		border: 1px solid black;
	}
	
	th {
		border-right: 1px solid black;
		background-color: honeydew;
	}
	
	td {
		padding: 5px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	
		String grade = request.getParameter("grade");
		String s_class = request.getParameter("class");
		String number = request.getParameter("number");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String year_month_day = birth.substring(0, 4) + "년" + birth.substring(4, 6) + "월" + birth.substring(6, 8) + "일";
		String gender = request.getParameter("gender");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
	%>
	
	<table>
		<tr>
			<th>학년</th>
			<td><%= grade %></td>
		</tr>
		<tr>
			<th>반</th>
			<td><%= s_class %></td>
		</tr>
		<tr>
			<th>번호</th>
			<td><%= number %></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><%= name %></td>
		</tr>
		<tr>
			<th>생년월일</th>
			<td><%= year_month_day %></td>
		</tr>
		<tr>
			<th>성별</th>
			<td><%= gender %></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><%= phone1 + "-" + phone2 + "-" + phone3 %></td>
		</tr>
	</table>
</body>
</html>