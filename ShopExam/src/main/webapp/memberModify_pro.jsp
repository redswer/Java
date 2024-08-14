<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.*" %>
<%
	request.setCharacterEncoding("utf-8");

	Connection con = null;
	PreparedStatement pstmt = null;
	int row = 0;
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	String sql="update tbl_member set custname = ?, phone = ?, gender = ?, joindate = ?, grade = ?, city = ? where custno = ?";
	
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("custname"));
	pstmt.setString(2, (request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3")));
	pstmt.setString(3, request.getParameter("gender"));
	pstmt.setString(4, request.getParameter("joindate"));
	pstmt.setString(5, request.getParameter("grade"));
	pstmt.setString(6, request.getParameter("city"));
	pstmt.setInt(7, Integer.parseInt(request.getParameter("custno")));
	
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
		<h1>수정 완료</h1>
		<a href="index.jsp">홈으로</a>
	<% 
		}
	%>
</body>
</html>