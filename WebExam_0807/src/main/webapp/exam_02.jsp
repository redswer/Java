<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table {
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	th, td {
		border: 1px solid black;
		padding: 10px;
		text-align: center;
	}
</style>
<script type="text/javascript">
	function test() {
		if(frm.name.value == "") {
			alert("이름을 입력하세요");
			frm.name.focus();
			return;
		} else if(frm.id.value == "") {
			alert("아이디를 입력하세요");
			frm.id.focus();
			return;
		} else if(frm.pw.value == "") {
			alert("비밀번호를 입력하세요");
			frm.pw.focus();
			return;
		} else {
			alert("전송완료");
		}
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<form name="frm" action="#" method="post">
		<table>
			<tr>
				<th>이름</th>
				<td><input name="name"></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input name="id"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input name="pw" type="password"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" onclick="test()" value="보내기">
					<input type="reset" value="취소하기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>