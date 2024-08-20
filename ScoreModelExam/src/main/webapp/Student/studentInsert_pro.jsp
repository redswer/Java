<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*" %>
<%
	request.setCharacterEncoding("utf-8");

	ScoreDAO dao = ScoreDAO.getInstance();
	StudentDTO dto = new StudentDTO();
	CommDTO cdto = new CommDTO();
	
	cdto.setHakbun(request.getParameter("hakbun"));
	
	dto.setName(request.getParameter("name"));
	dto.setPhone1(request.getParameter("phone1"));
	dto.setPhone2(request.getParameter("phone2"));
	dto.setPhone3(request.getParameter("phone3"));
	dto.setBirth(request.getParameter("birth"));
	dto.setGender(request.getParameter("gender"));
	dto.setRegdate(request.getParameter("regdate"));
	
	int row = dao.studentInsert(cdto, dto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	h1 {
		text-align: center;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<%
		if (row == 1) {
	%>
		<h1>등록완료</h1>
	<% 
		} else {
	%>
		<h1>등록실패</h1>
	<% 
		}
	%>
</body>
</html>