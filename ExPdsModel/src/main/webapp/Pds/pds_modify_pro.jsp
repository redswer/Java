<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.pds.model.*, com.oreilly.servlet.*, com.oreilly.servlet.multipart.*, java.io.*" %>
<%
	request.setCharacterEncoding("utf-8");

	PdsDAO dao = PdsDAO.getInstance();
	PdsDTO dto = new PdsDTO();
	
	ServletContext context = getServletContext();
	String path = context.getRealPath("Pds/upload");
	String encType = "UTF-8";
	int maxSize = 2 * 1024 * 1024;
	
	int row = 0;
	try {
		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
		// DefaultFileRenamePolicy() : 파일 이름 중복 시 자동으로 바꿔줌 (a.bmp -> a1.bmp)
		
		dto.setIdx(Integer.parseInt(multi.getParameter("idx")));
		dto.setName(multi.getParameter("name"));
		dto.setEmail(multi.getParameter("email"));
		dto.setSubject(multi.getParameter("subject"));
		dto.setContents(multi.getParameter("contents"));
		dto.setPass(multi.getParameter("pass"));
		
		String file_name = multi.getFilesystemName("filename");
		String old_file = request.getParameter("old_file");
		
		if (file_name == null) {
			dto.setFilename(old_file);
		} else {
			dto.setFilename(file_name);
			
			File file = new File(path + old_file);
			if (file.exists()) {
				file.delete();
			}
		}
		
		row = dao.pdsModify(dto);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	if (row == 1) {
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