<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	div {
		text-align: center;
	}
	table {
		width: 600px;
		height: 200px;
		margin: auto;
		border: 3px solid black;
		border-collapse: collapse;
	}
	
	table th, table td {
		width: 150px;
		padding: 5px;
		border: 1px solid black;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<div>요안도라 객실</div>
	<table>
		<tr>
			<th>방 이름</th>
			<th>대상</th>
			<th>크기</th>
			<th>가격</th>
		</tr>
		<tr>
			<th>유채방</th>
			<td>여성 도미토리</td>
			<td rowspan="3">4인실</td>
			<td rowspan="4">1인 20,000원</td>
		</tr>
		<tr>
			<th rowspan="2">동백방</th>
			<td>동성 도미토리</td>
		</tr>
		<tr>
			<td>가족 1팀</td>
		</tr>
		<tr>
			<th>천혜향방</th>
			<td>-</td>
			<td>2인실</td>
		</tr>
	</table>
</body>
</html>