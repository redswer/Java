<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.board.model.*" %>
<%
	request.setCharacterEncoding("utf-8");
	int idx = Integer.parseInt(request.getParameter("idx"));

	BoardDAO dao = BoardDAO.getInstance();
	BoardDTO dto = new BoardDTO();
	
	dto.setIdx(idx);
	dto.setPass(request.getParameter("pass"));
	
	int row = dao.boardDelete(dto);
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	if (row == 1) {
%>
	<script>
		alert("삭제되었습니다.");
		opener.location.replace("board_list.jsp");
		self.close();
	</script>
<%
	} else {
%>
	<script>
		alert("비밀번호 오류");
		history.back();
	</script>
<%
	}
%>
<title>Insert title here</title>
</head>
<body>
</body>
</html>