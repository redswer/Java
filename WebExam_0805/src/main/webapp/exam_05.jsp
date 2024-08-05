<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*"%>
<%
	List<String> list = new ArrayList<>();
	list.add("1000,김사원,M,901010,300");
	list.add("1002,이사원,F,931111,500");
	list.add("1003,박사원,F,890110,400");
	list.add("1004,공사원,M,920513,350");
	list.add("1005,윤사원,F,910321,290");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = 1>
		<tr align = "center">
			<td>번호</td>
			<td>이름</td>
			<td>성별</td>
			<td>생년월일</td>
			<td>급여</td>
		</tr>
		<%
		for(int i = 0; i < list.size(); i++) {
			String[] s = list.get(i).split(",");
		%>
		<tr align = "center">
			<td><%= s[0] %></td>
			<td><%= s[1] %></td>
			<%
			if(s[2].equals("M")) {
			%>
				<td>남자</td>
			<%
			} else {
			%>
				<td>여자</td>
			<% 
			}
			%>
			<td><%= s[3].substring(0, 2) + "년" + s[3].substring(2, 4) + "월" + s[3].substring(4, 6) + "일" %></td>
			<td><%= s[4] %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>