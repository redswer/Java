<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.guest.model.*" %>
<%
	request.setCharacterEncoding("utf-8");
	
	GuestDAO dao = GuestDAO.getInstance();
	GuestDTO dto = new GuestDTO();
	
	dto.setIdx(Integer.parseInt(request.getParameter("idx")));
	dto.setSubject(request.getParameter("subject"));
	dto.setContents(request.getParameter("contents"));
	
	int row = dao.guestModify(dto);
	
	if (row == 1) {
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