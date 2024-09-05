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
		alert("로그인 완료");
		location.href = "/index";
	</script>
	<%
		} else if (row == 0) {
	%>
		<script type="text/javascript">
			alert("비밀번호가 맞지 않습니다");
			history.back();
		</script>
	<%
		} else {
	%>
		<script type="text/javascript">
			alert("아이디가 존재하지 않습니다");
			history.back();
		</script>		
	<%		
		}
	%>
</body>
</html>