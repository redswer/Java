<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.jslhrd.shop.util.*, com.jslhrd.shop.model.*" %>
<%
	DecimalFormat df = new DecimalFormat("#,###");
	int total = 0;
	
	MemberDTO dto = new MemberDTO();
	MemberDAO dao = new MemberDAO();
	List<MemberDTO> list = dao.moneyList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	body {
		background-color: #E6E6E6;
	}
	
	h1 {
		text-align: center;
	}

	table {
		border: 1px solid black;
		border-collapse: collapse;
		margin: auto;
		width: 700px;
	}
	
	th, td {
		border: 1px solid black;
	}
	
	td {
		text-align: center;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>회원매출조회</h1>
	<table>
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>고객등급</th>
			<th>매출</th>
		</tr>
		<%
			for(int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%= list.get(i).getCustno() %></td>
			<td><%= list.get(i).getCustname() %></td>
			<td><%= list.get(i).getPhone() %></td>
			<% 
				String grade = "VIP";
				switch(list.get(i).getGrade()) {
				case "B":
					grade = "일반";
					break;
				case "C":
					grade = "직원";
					break;
				}
			%>
			<td><%= grade %></td>
			<td><%= df.format(list.get(i).getSum()) %></td>
		</tr>
		<%
			total += list.get(i).getSum();
			}
		%>
		<tr>
			<td colspan="4">총매출액</td>
			<td><%= df.format(total) %></td>
		</tr>
	</table>
</body>
</html>