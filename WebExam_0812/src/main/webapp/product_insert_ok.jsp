<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	h1 {
		text-align: center;
	}

	table {
		border: 1px solid black;
		border-collapse: collapse;
		margin: auto;
		text-align: initial;
		width: 300px;
	}
	
	td, th {
		border: 1px solid black;
		padding: 5px;
	}
	
	th {
		border-right: 2px solid black;
	}
	
	td[colspan="2"] {
		text-align: center;
	}
	
	a {
		color: black;
		display: inline-block;
		width: 80px;
		border: 1px solid black;
		text-decoration: none;
		text-align: center;
		background-color: #D8D8D8;
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
		String year = date.substring(0, 4) + "년";
		String month = date.substring(4, 6) + "월";
		String day = date.substring(6, 8) + "일";
		
		String account = request.getParameter("account");
	%>
	
	<h1>등록완료</h1>
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
				<%= year + month + day %>
			</td>
		</tr>
		<tr>
			<th>거래처</th>
			<td>
				<%
					if (account.equals("10")) {
				%>
					<%= "서울공장" %>
				<%
					} else if (account.equals("20")) {
				%>
					<%= "울산공장" %>
				<%
					} else if (account.equals("30")) {
				%>
					<%= "부산상사" %>
				<%
					} else if (account.equals("40")) {
				%>
					<%= "광주상사" %>
				<%
					} else if (account.equals("50")) {
				%>
					<%= "대전상사" %>
				<%
				}
				%>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="product_insert.jsp">돌아가기</a>
				<a href="index.jsp">홈으로</a>
			</td>
		</tr>
	</table>
</body>
</html>