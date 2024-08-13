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
	
	String sql="select * from emp";
	
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
			<th colspan="8">전체 사원 리스트</th>
		</tr>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>업무명</th>
			<th>상사번호</th>
			<th>입사일자</th>
			<th>급여</th>
			<th>커미션</th>
			<th>부서번호</th>
		</tr>
		<%
			while (rs.next()) {
		%>
			<tr>
				<td><%= rs.getInt("eno") %></td>
				<td><%= rs.getString("ename") %></td>
				<td><%= rs.getString("job") %></td>
				<td><%= rs.getInt("manager") %></td>
				<td><%= rs.getString("hiredate").substring(0, 10) %></td>
				<td><%= rs.getInt("salary") %></td>
				<td><%= rs.getInt("commission") %></td>
				<td><%= rs.getInt("dno") %></td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>