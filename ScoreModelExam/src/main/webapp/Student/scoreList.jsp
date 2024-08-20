<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*, java.util.*" %>
<%
	ScoreDAO dao = ScoreDAO.getInstance();
	List<StudentDTO> list = dao.scoreList();
	int kor_tot = 0;
	int eng_tot = 0;
	int mat_tot = 0;
	int i;
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
	<h1>과정평가형 자격(학생성적조회)</h1>
	
	<table>
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>성별</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총점</th>
			<th>평균</th>
		</tr>
		<%
			for(i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%= list.get(i).getHakbun().substring(0, 1) + "-" + list.get(i).getHakbun().substring(1, 2) + "-" + list.get(i).getHakbun().substring(2, 4) %></td>
			<td><%= list.get(i).getName() %></td>
			<td><%= list.get(i).getGender().equals("M") ? "남" : "여" %></td>
			<td><%= list.get(i).getKor() %></td>
			<td><%= list.get(i).getEng() %></td>
			<td><%= list.get(i).getMat() %></td>
			<td><%= list.get(i).getSum() %></td>
			<td><%= list.get(i).getAvg() %></td>
		</tr>
		<%
			kor_tot += list.get(i).getKor();
			eng_tot += list.get(i).getEng();
			mat_tot += list.get(i).getMat();
			}
		%>
		<tr>
			<td></td>
			<td></td>
			<td>전체총점</td>
			<td><%= kor_tot %></td>
			<td><%= eng_tot %></td>
			<td><%= mat_tot %></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>전체평균</td>
			<td><%= (kor_tot / (i * 1.0)) %></td>
			<td><%= (eng_tot / (i * 1.0)) %></td>
			<td><%= (mat_tot / (i * 1.0)) %></td>
			<td></td>
			<td></td>
		</tr>
	</table>
</body>
</html>