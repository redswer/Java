<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.jslhrd.score.model.*, java.util.*"%>
<%
	ScoreDAO dao = ScoreDAO.getInstance();
	List<StudentDTO> list = dao.studentList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	body {
		background-color: #E0E0E0;
	}

	h1 {
		text-align: center;
	}
	
	table {
		margin: auto;
		border: 1px solid black;
		border-collapse: collapse;
		text-align: center;
		width: 900px;
	}
	
	a {
		text-decoration: none;
	}
	
	th, td {
		border: 1px solid black;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>학생 정보 조회</h1>
	
	<table>
		<tr>
			<th>학생번호</th>
			<th>학생이름</th>
			<th>전화번호</th>
			<th>성별</th>
			<th>생년월일</th>
			<th>가입일자</th>
		</tr>
		<%
			for(int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><a href="./scoreInsert.jsp?hakbun=<%= list.get(i).getHakbun() %>"><%= list.get(i).getHakbun() %></a></td>
			<td><%= list.get(i).getName() %></td>
			<td><%= list.get(i).getPhone1() + "-"  + list.get(i).getPhone2() + "-" + list.get(i).getPhone3() %></td>
			<td><%= list.get(i).getGender().equals("M") ? "남자" : "여자" %></td>
			<td><%= list.get(i).getBirth().substring(0, 4) + "-" + list.get(i).getBirth().substring(4, 6) + "-" + list.get(i).getBirth().substring(6, 8) %></td>
			<td><%= list.get(i).getRegdate().substring(0, 4) + "년" + list.get(i).getRegdate().substring(5, 7) + "월" + list.get(i).getRegdate().substring(8, 10) + "일" %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>