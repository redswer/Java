<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	body {
		background-color: #E0E0E0
	}
	
	h1 {
		text-align: center;
	}
	
	table {
		margin: auto;
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	td, th {
		border: 1px solid black;
		padding: 5px;
	}
	
	th {
		width: 100px;
	}
	
	td {
		width: 500px;
	}
	
	td[colspan="2"] {
		text-align: center;
	}
</style>
<script type="text/javascript">
	function send() {
		if(info.hakbun.value == "") {
			alert("학번이 입력되지 않았습니다!");
			return;
		}
		if (info.name.value == "") {
			alert("이름이 입력되지 않았습니다!");
			return;
		}
		if (info.phone1.value == "" || info.phone2. value == "" || info.phone3.value == "") {
			alert("전화번호가 입력되지 않았습니다!");
			return;
		}
		if (!info.gender[0].checked && !info.gender[1].checked) {
			alert("성별을 선택하세요!");
			return;
		}
		if (info.birth.value == "") {
			alert("생년월일이 입력되지 않았습니다!");
			return;
		}
		
		alert("학생등록이 정상적으로 등록되었습니다.");
		info.submit();
	}
	
	function re() {
		alert("정보를 지우고 처음부터 다시 입력합니다!");
		info.reset();
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>학생 정보 등록</h1>
	
	<form name="info" action="studentInsert_pro.jsp" method="post">
		<table>
			<tr>
				<th>학번</th>
				<td>
					<input name="hakbun">
					<span>예)1101</span>
				</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>
					<input name="name">
				</td>
			</tr>
			<tr>
				<th>전화</th>
				<td>
					<input name="phone1" size=3>-
					<input name="phone2" size=4>-
					<input name="phone3" size=4>
				</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<input type="radio" name="gender" value="M">
					<span>남자</span>
					<input type="radio" name="gender" value="F">
					<span>여자</span>
				</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td>
					<input name="birth">
					<span>예)19971107</span>
				</td>
			</tr>
			<tr>
				<th>등록일자</th>
				<td>
					 <input name="regdate">
					 <span>예)20200207</span>
				</td>
			</tr>
			<tr>
				<td colspan=2>
					<input type="button" value="등록하기" onClick="send()">
					<input type="button" value="다시쓰기" onClick="re()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>