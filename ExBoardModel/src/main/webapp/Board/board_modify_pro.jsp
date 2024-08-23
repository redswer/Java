<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.board.model.*" %>
<%
	request.setCharacterEncoding("utf-8");
	
	BoardDAO dao = BoardDAO.getInstance();
	BoardDTO dto = new BoardDTO();
	
	dto.setIdx(Integer.parseInt(request.getParameter("idx")));
	dto.setEmail(request.getParameter("email"));
	dto.setSubject(request.getParameter("subject"));
	dto.setContents(request.getParameter("contents"));
	dto.setPass(request.getParameter("pass"));
	
	int row = dao.boardModify(dto);
	if (row == 1) {
		response.sendRedirect("board_list.jsp");
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