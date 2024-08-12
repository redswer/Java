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
		margin: auto;
		text-align: initial;
		width: 200px;
	}
	
	td, th {
		border: 1px solid black;
	}
	
	th {
		border-right: 2px solid black;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	
		String in_out_number = request.getParameter("in_out_number");
		String product_code = request.getParameter("product_code");
		String in_out_check = request.getParameter("in_out_check");
		int count = Integer.parseInt(request.getParameter("count"));
		String date = request.getParameter("date");
		String account = request.getParameter("account");
	%>
	
	<table>
		<tr>
			<th>입출고번호</th>
			<td>
				<%= in_out_number %>
			</td>
		</tr>
		<tr>
			<th>제품코드</th>
			<td>
				<%= product_code %>
			</td>
		</tr>
		<tr>
			<th>입출고구분</th>
			<td>
				<%
					if (in_out_check.equals("1")) {
				%>
				<%= "입고" %>
				<%
					} else {
				%>
				<%= "출고" %>
				<%
					}
				%>
			</td>
		</tr>
		<tr>
			<th>수량</th>
			<td>
				<%= count %>
			</td>
		</tr>
		<tr>
			<th>거래일자</th>
			<td>
				<%= date %>
			</td>
		</tr>
		<tr>
			<th>거래처</th>
			<td>
				<%= account %>
			</td>
		</tr>
	</table>
</body>
</html>