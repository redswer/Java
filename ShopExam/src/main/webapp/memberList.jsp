<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>
<%
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	String sql="select * from tbl_member";
	
	pstmt = con.prepareStatement(sql);
	rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	body {
		background-color: #E6E6E6;
	}

	h1 {
		text-align: center;
	}
	
	table {
		border: 1px solid black;
		border-collapse: collapse;
		margin: auto;
		width: 800px;
	}
	
	th, td {
		border: 1px solid black;
		padding: 5px
	}
	
	td {
		text-align: center;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>회원목록조회/수정</h1>
	<table>
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>성별</th>
			<th>가입일자</th>
			<th>고객등급</th>
			<th>거주지역</th>
		</tr>
		<%
			while (rs.next()) {
		 %>
		<tr>
			<td><a href="memberModify.jsp?custno=<%= rs.getInt("custno") %>"><%= rs.getInt("custno") %></a></td>
			<td><%= rs.getString("custname")%></td>
			<td><%= rs.getString("phone") %></td>
			<td><%= rs.getString("gender") %></td>
			<%
				String date = rs.getString("joindate");
				String year = date.substring(0, 4) + "년";
				String month = date.substring(4, 6) + "월";
				String day = date.substring(6, 8) + "일";
			%>
			<td><%= year + month + day %></td>
			<%
				String grade = rs.getString("grade");
				String grade_output = "";
				switch(grade) {
				case "A":
					grade_output = "VIP";
					break;
				case "B":
					grade_output = "일반";
					break;
				case "C":
					grade_output = "직원";
					break;
				}
			%>
			<td><%= grade_output %></td>
			<%
				String city_code = rs.getString("city");
				String city = "";
				switch(city_code) {
				case "01":
					city = "서울";
					break;
				case "02":
					city = "경기";
					break;
				case "03":
					city = "인천";
					break;
				case "04":
					city = "강원";
					break;
				case "05":
					city = "충북";
					break;
				case "06":
					city = "충남";
					break;
				case "07":
					city = "전북";
					break;
				case "08":
					city = "전남";
					break;
				case "09":
					city = "경북";
					break;
				case "10":
					city = "경남";
					break;
				case "11":
					city = "제주";
					break;
				}
			%>
			<td><%= city %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>