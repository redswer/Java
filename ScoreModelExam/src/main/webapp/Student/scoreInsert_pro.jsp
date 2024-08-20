<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.score.model.*" %>
<%
	request.setCharacterEncoding("utf-8");

	ScoreDAO dao = ScoreDAO.getInstance();
	ScoreDTO dto = new ScoreDTO();
	CommDTO cdto = new CommDTO();
	
	cdto.setHakbun(request.getParameter("hakbun"));
	dto.setKor(Integer.parseInt(request.getParameter("kor")));
	dto.setEng(Integer.parseInt(request.getParameter("eng")));
	dto.setMat(Integer.parseInt(request.getParameter("mat")));
	
	int row = dao.scoreInsert(cdto, dto);
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
		<h1>등록 성공</h1>
	<%
		} else {
	%>
		<h1>등록 실패</h1>
	<%
		}
	%>
</body>
</html>