<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>    

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	String sql="select * from dept";
	
	pstmt = conn.prepareStatement(sql);
	rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table {
		margin: auto;
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	th, td {
		border: 1px solid black;
		padding: 5px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th colspan="3">부서목록</th>
		</tr>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>도시</th>
		</tr>
		<%
			while(rs.next()) {
		%>
		<tr>
			<td><%= rs.getInt("dno") %></td>
			<td><%= rs.getString("dname") %></td>
			<td><%= rs.getString("loc") %></td>
		</tr>
		<% 
			}
		%>
	</table>
</body>
</html>