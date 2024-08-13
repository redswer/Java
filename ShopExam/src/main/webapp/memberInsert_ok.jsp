<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>
<%
	request.setCharacterEncoding("utf-8");

	int custno = Integer.parseInt(request.getParameter("custno"));
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3");
	String gender = request.getParameter("gender");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	Connection con = null;
	PreparedStatement pstmt = null;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	int row = 0;
	String sql="insert into tbl_member values(?, ?, ?, ?, ?, ?, ?)";
	
	pstmt = con.prepareStatement(sql);
	pstmt.setInt(1, custno);
	pstmt.setString(2, custname);
	pstmt.setString(3, phone);
	pstmt.setString(4, gender);
	pstmt.setString(5, joindate);
	pstmt.setString(6, grade);
	pstmt.setString(7, city);
	
	row = pstmt.executeUpdate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (row == 1) {
	%>
		<h1>등록성공</h1>
	<% 			
		}
	%>
</body>
</html>