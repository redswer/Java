<%@page import="java.lang.reflect.Parameter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.guest.model.*, java.util.*" %>
<%
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String contents = request.getParameter("contents");
	
	GuestDAO dao = GuestDAO.getInstance();
	GuestDTO dto = new GuestDTO();
	
	dto.setName(name);
	dto.setSubject(subject);
	dto.setContents(contents);
	
	int row = dao.guestInsert(dto);
	
	if (row ==1) {
		response.sendRedirect("guest_list.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>