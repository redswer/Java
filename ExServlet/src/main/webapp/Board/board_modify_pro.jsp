<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int row = (int) request.getAttribute("row");
%>
	<%
		if (row == 1) {
			
	%>
	<script type="text/javascript">
		alert("등록되었습니다");
		location.href = "/board_list?page=${page}";
	</script>
	<%
		} else {
	%>
		<script type="text/javascript">
			alert("비밀번호가 다릅니다");
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