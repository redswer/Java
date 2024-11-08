<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
		margin: auto;
		margin-top: 100px;
	}
	
	table td {
		text-align: center;
	}
</style>
</head>
<body>
	<form action="guest_delete" method="post" name="guest">
		<table>
			<tr>
				<td>
					<input type="hidden" value="${idx}" name="idx">
					<input type="password" placeholder="비밀번호를 입력하세요" name="pass">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="삭제">
					<input type="button" onClick="javascript:self.close()" value="취소">
				</td>
			</tr>
		</table>
			
	</form>
</body>
</html>