<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.shop.util.*, com.jslhrd.shop.model.*" %>
<%
	request.setCharacterEncoding("utf-8");

	int custno = Integer.parseInt(request.getParameter("custno"));
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3");
	String gender = request.getParameter("gender");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");

	MemberDTO dto = new MemberDTO();
	MemberDAO dao = new MemberDAO();
	
	dto.setCustno(custno);
	dto.setCustname(custname);
	dto.setPhone(phone);
	dto.setGender(gender);
	dto.setJoindate(joindate);
	dto.setGrade(grade);
	dto.setCity(city);
	
	int row = dao.memberModify(dto);
	
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
		<a href="../index.jsp">홈으로</a>
	<% 
		}
	%>
</body>
</html>