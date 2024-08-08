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
	String etc = request.getParameter("etc");
	
	
	out.print("이름 : " + name + "<br>");
	out.print("아이디 : " + userId + "<br>");
	out.print("비밀번호 : " + userPw + "<br>");
	out.print("비밀번호 확인 : " + userPwCheck + "<br>");
	out.print("성별 : " + gender + "<br>");
	out.print("전화번호 : " + phone + "<br>");
	out.print("이메일 : " + email + "<br>");
	out.print("직업 : " + job + "<br>");
	
	out.print("취미 : ");
	int i;
	for(i = 0; i < hobby.length - 1; i++) {
		out.print(hobby[i] + ", ");
	}
	out.print(hobby[i] + "<br>");
	
	out.print("기타 : " + etc + "<br>");
%>