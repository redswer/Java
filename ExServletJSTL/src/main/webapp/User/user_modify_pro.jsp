<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${row == 1}">
	<script type="text/javascript">
		alert("회원정보가 수정되었습니다\n다시 로그인 해 주세요");
		location.href = "/user_login.do";
	</script>
</c:if>
<c:if test="${row != 1}">
	<script type="text/javascript">
		alert("회원정보 수정 실패");
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