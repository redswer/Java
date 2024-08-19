<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jslhrd.shop.model.*" %>
<%
	request.setCharacterEncoding("utf-8");

	MemberDTO dto = new MemberDTO();
	MemberDAO dao = new MemberDAO();
	
	int custno = Integer.parseInt(request.getParameter("custno"));
	dto = dao.memberSelect(custno);
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
	}
	
	th {
		width: 250px;
	}
	
	td {
		width: 400px;
	}
	
	th, td {
		border: 1px solid black;
		padding: 5px;
	}
	
	td[colspan="2"] {
		text-align: center;
	}
</style>
<script type="text/javascript">
	function send() {
		if (insert.custno.value == "") {
			alert("회원번호가 입력되지 않았습니다!");
			insert.custno.focus();
			return;
		}
		if (insert.custname.value == "") {
			alert("회원성명이 입력되지 않았습니다!");
			insert.custname.focus();
			return;
		}
		if (insert.phone1.value == "") {
			alert("회원전화번호가 입력되지 않았습니다!");
			insert.phone1.focus();
			return;
		}
		if (insert.phone2.value == "") {
			alert("회원전화번호가 입력되지 않았습니다!");
			insert.phone2.focus();
			return;
		}
		if (insert.phone3.value == "") {
			alert("회원전화번호가 입력되지 않았습니다!");
			insert.phone3.focus();
			return;
		}
		if (!insert.gender[0].checked && !insert.gender[1].checked) {
			alert("성별이 선택되지 않았습니다!");
			return;
		}
		if (insert.joindate.value == "") {
			alert("가입일자가 입력되지 않았습니다!");
			insert.joindate.focus();
			return;
		}
		if (insert.grade.value == "") {
			alert("고객등급이 선택되지 않았습니다!");
			return;
		}
		if (insert.city.value == "") {
			alert("도시코드가 선택되지 않았습니다!");
			return;
		}
		
		alert("회원정보가 정상적으로 등록되었습니다.");
		insert.submit();
	}
	
	function re() {
		alert("입력된 모든 정보를 지우고 디시 입력합니다.");
		insert.reset();
		insert.custname.focus();
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보 수정</h1>
	<form name="insert" action="memberModify_pro.jsp" method="post">
		<table>
			<tr>
				<th>회원번호</th>
				<td>
					<input name="custno" value=<%= custno %> readOnly>
				</td>
			</tr>
			<tr>
				<th>회원성명</th>
				<td>
					<input name="custname" value="<%= dto.getCustname()%>">
				</td>
			</tr>
			<tr>
				<th>회원전화</th>
				<td>
					<input name="phone1" size=4 value="<%= dto.getPhone().substring(0, 3)%>">-
					<input name="phone2" size=4 value="<%= dto.getPhone().substring(4, 8)%>">-
					<input name="phone3" size=4 value="<%= dto.getPhone().substring(9, 13)%>">
				</td>
			</tr>
			<tr>
				<th>회원성별</th>
				<td>
					<input type="radio" name="gender" value="M" <%if (dto.getGender().equals("M")) {%>checked<%} %>>
					<span>남자</span>
					<input type="radio" name="gender" value="F" <%if (dto.getGender().equals("F")) {%>checked<%} %>>
					<span>여자</span>
				</td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td>
					<input name="joindate" value="<%= dto.getJoindate() %>">
				</td>
			</tr>
			<tr>
				<th>고객등급</th>
				<td>
					<select name="grade">
						<option value="">고객등급</option>
						<option value="A" <%if (dto.getGrade().equals("A")) {%>selected<%} %>>VIP</option>
						<option value="B" <%if (dto.getGrade().equals("B")) {%>selected<%} %>>일반</option>
						<option value="C" <%if (dto.getGrade().equals("C")) {%>selected<%} %>>직원</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>도시코드</th>
				<td>
					<select name="city">
						<option value="">도시코드</option>
						<option value="01" <%if (dto.getCity().equals("01")) {%>selected<%} %>>서울</option>
						<option value="02" <%if (dto.getCity().equals("02")) {%>selected<%} %>>경기</option>
						<option value="03" <%if (dto.getCity().equals("03")) {%>selected<%} %>>인천</option>
						<option value="04" <%if (dto.getCity().equals("04")) {%>selected<%} %>>강원</option>
						<option value="05" <%if (dto.getCity().equals("05")) {%>selected<%} %>>충북</option>
						<option value="06" <%if (dto.getCity().equals("06")) {%>selected<%} %>>충남</option>
						<option value="07" <%if (dto.getCity().equals("07")) {%>selected<%} %>>전북</option>
						<option value="08" <%if (dto.getCity().equals("08")) {%>selected<%} %>>전남</option>
						<option value="09" <%if (dto.getCity().equals("09")) {%>selected<%} %>>경북</option>
						<option value="10" <%if (dto.getCity().equals("10")) {%>selected<%} %>>경남</option>
						<option value="11" <%if (dto.getCity().equals("11")) {%>selected<%} %>>제주</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="등록하기" onclick="send()">
					<input type="button" value="다시쓰기" onclick="re()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>