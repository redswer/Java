<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.jslhrd.score.model.*" %>
<%
	ScoreDAO dao = ScoreDAO.getInstance();
	List<ScoreDTO> list = dao.gradeScoreList();
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
	th, td {
		border: 1px solid black;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>과정평가형 자격(학년별 통계)</h1>
	
	<table>
		<tr>
			<th>학년</th>
			<th>국어총점</th>
			<th>영어총점</th>
			<th>수학총점</th>
			<th>국어평균</th>
			<th>영어평균</th>
			<th>수학평균</th>
		</tr>
		<%
			for(int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%= list.get(i).getGrade() %></td>
			<td><%= list.get(i).getKor() %></td>
			<td><%= list.get(i).getEng() %></td>
			<td><%= list.get(i).getMat() %></td>
			<td><%= list.get(i).getKor_avg() %></td>
			<td><%= list.get(i).getEng_avg() %></td>
			<td><%= list.get(i).getMat_avg() %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>