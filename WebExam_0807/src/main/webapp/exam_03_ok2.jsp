<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	// => 한글 깨짐 해결하기 위한 인코딩

	// 전 페이지에서 넘어온 값 받기
	String name = request.getParameter("userName");
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userPwCheck = request.getParameter("userPwCheck");
	String gender = request.getParameter("gender");
	String phone = request.getParameter("phone1") + request.getParameter("phone2") + request.getParameter("phone3");
	String email = request.getParameter("emailAddress") + "@" + request.getParameter("emailDomain");
	String job = request.getParameter("job");
	String[] hobby = request.getParameterValues("hobby");
	String fa = "";
	int i;
	for(i = 0; i < hobby.length - 1; i++) {
		fa = hobby[i] + ", ";
	}
	fa += hobby[i] + "<br>";
	
	String etc = request.getParameter("etc");
%>

<body>
	<table border = 1 style="width: 400px; margin: auto">
		<tr>
			<th>이름</th>
			<td><%= name %></td>
		</tr>
		<tr>
			<th>아이디</th>
			<td><%= userId %></td>
		</tr>
		<tr>
			<th>성별</th>
			<td><%= gender %></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><%= phone %></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><%= email %></td>
		</tr>
		<tr>
			<th>직업</th>
			<td><%= job %></td>
		</tr>
		<tr>
			<th>취미</th>
			<td><%= fa %></td>
		</tr>
		<tr>
			<th>기타</th>
			<td><%= etc %></td>
		</tr>
	</table>
</body>