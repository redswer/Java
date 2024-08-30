<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.pds.model.*, com.oreilly.servlet.*, com.oreilly.servlet.multipart.*, java.io.*" %>
<%
	request.setCharacterEncoding("utf-8");

	PdsDAO dao = PdsDAO.getInstance();
	int row = 0;
	
	int idx = Integer.parseInt(request.getParameter("idx"));
	String pass = request.getParameter("pass");
	String filename = dao.pdsSelect(idx).getFilename();
	
	try {		
		row = dao.pdsDelete(idx, pass);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	if(row==1){
		if(filename != null){
			ServletContext context = getServletContext();
			String path = context.getRealPath("Pds/upload/");// 파일 저장 경로
			//String path = request.getServletContext().getRealPath("/Pds/upload");			
			File file = new File(path+filename);
			if(file.exists()) {
				file.delete();
			}
		}
		response.sendRedirect("pds_list.jsp");
	} else {	
%>
<script>
	alert("실패");
	history.back();
</script>
<%
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