<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>
<%
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	DecimalFormat df = new DecimalFormat("#,###");
	int total = 0;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	String sql="select a.custno, a.custname, a.phone, a.grade, sum(b.pcost * b.amount) as sum"
			+" from tbl_member a, tbl_money b"
			+" where a.custno = b.custno"
			+" group by a.custno, a.custname, a.phone, a.grade"
			+" order by sum desc";
	
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
		width: 700px;
	}
	
	th, td {
		border: 1px solid black;
	}
	
	td {
		text-align: center;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>회원매출조회</h1>
	<table>
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>고객등급</th>
			<th>매출</th>
		</tr>
		<%
			while(rs.next()) {
		%>
		<tr>
			<td><%= rs.getInt("custno") %></td>
			<td><%= rs.getString("custname") %></td>
			<td><%= rs.getString("phone") %></td>
			<% 
				String grade = "VIP";
				switch(rs.getString("grade")) {
				case "B":
					grade = "일반";
					break;
				case "C":
					grade = "직원";
					break;
				}
			%>
			<td><%= grade %></td>
			<td><%= df.format(rs.getInt("sum")) %></td>
		</tr>
		<%
			total += rs.getInt("sum");
			}
		%>
		<tr>
			<td colspan="4">총매출액</td>
			<td><%= df.format(total) %></td>
		</tr>
	</table>
</body>
</html>