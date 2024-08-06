<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table {
		width: 300px;
		margin: 0 auto;
		border: solid black 0.5px;
		border-collapse: collapse;
	}

	td, th {
		border: solid black 0.5px;
	}
	
	.second td {
		width: 150px
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>주소</th>
		</tr>
		<tr>
			<td>1</td>
			<td>김사원</td>
			<td>대전 중구 계룡로 825</td>
		</tr>
	</table>
	<hr>
	<table class="second">
		<tr>
			<th colspan="2">성적</th>
		</tr>
		<tr>
			<td rowspan="2">국어</td>
			<td>70</td>
		</tr>
		<tr>
			<td>80</td>
		</tr>
		<tr>
			<td rowspan="2">영어</td>
			<td>80</td>
		</tr>
		<tr>
			<td>90</td>
		</tr>
	</table>
</body>
</html>