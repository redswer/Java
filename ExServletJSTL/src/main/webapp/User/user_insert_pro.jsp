<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${row == 1}">
	<script type="text/javascript">
		alert("가입되었습니다");
		location.href = "/user_login.do";
	</script>
</c:if>
<c:if test="${row != 1}">
	<script type="text/javascript">
		alert("회원가입 실패");
		history.back();
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>