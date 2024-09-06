<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int row = (int) request.getAttribute("row");
%>
	<%
		if (row == 1) {
			
	%>
	<script type="text/javascript">
		alert("수정이 완료되었습니다\n다시 로그인해 주세요");
		location.href = "/user_login";
	</script>
	<%
		} else {
	%>
		<script type="text/javascript">
			alert("수정 실패");
			history.back();
		</script>
	<%
		}
	%>
</body>
</html>