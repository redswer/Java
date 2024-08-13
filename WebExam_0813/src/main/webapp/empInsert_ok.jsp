<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>
<%
	request.setCharacterEncoding("utf-8");

	String eno = request.getParameter("eno");
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	String manager = request.getParameter("manager");
	String hiredate = request.getParameter("hiredate");
	String salary = request.getParameter("salary");
	String commission = request.getParameter("commission");
	String dno = request.getParameter("dno");

	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	int row = 0;
	String sql="insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
	
	pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1, Integer.parseInt(eno));
	pstmt.setString(2, ename);
	pstmt.setString(3, job);
	pstmt.setInt(4, Integer.parseInt(manager));
	pstmt.setString(5, hiredate);
	pstmt.setInt(6, Integer.parseInt(salary));
	pstmt.setInt(7, Integer.parseInt(commission));
	pstmt.setInt(8, Integer.parseInt(dno));
	
	row = pstmt.executeUpdate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	h1 {
		text-align: center;
	}
	table {
		border: 1px solid black;
		border-collapse: collapse;
		margin: auto;
	}
	
	th, td {
		border: 1px solid black;
		padding: 5px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<%
		if (row == 0) {
	%>
		<h1>사원등록 실패</h1>
	<%
		} else {
	%>	
		<h1>사원등록 성공</h1>
		<table>
			<tr>
				<th>사원번호</th>
				<th>사원이름</th>
				<th>업무</th>
				<th>상사번호</th>
				<th>입사일자</th>
				<th>급여</th>
				<th>커미션</th>
				<th>부서번호</th>
			</tr>
			<tr>
				<td><%= eno %></td>
				<td><%= ename %></td>
				<td><%= job %></td>
				<td><%= manager %></td>
				<td><%= hiredate %></td>
				<td><%= salary %></td>
				<td><%= commission %></td>
				<td><%= dno %></td>
			</tr>
		</table>	
	<%
		}
	%>
</body>
</html>