<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${row == 1}">
	<script type="text/javascript">
		alert("삭제되었습니다");
		opener.location.href="/guest_list.do?page=${page}";
		self.close();
	</script>
</c:if>
<c:if test="${row != 1}">
	<script type="text/javascript">
		alert("비밀번호가 다릅니다");
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