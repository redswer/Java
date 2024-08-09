<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	body {
		text-align: center;
	}

	div {
		width: 500px;
		height: 350px;
		display: inline-block;
		background-color: #DCDCDC;
		margin-top: 20px;
	}
	
	h1 {
		text-align: center;
	}

	table {
		text-align: initial;
		width: 450px;
		margin: auto;
	}
	
	th, td {
		border: .5px solid gray;
	}
	
	tr:last-child td {
		text-align: center;
		line-height: 30px
	}
</style>
<script type="text/javascript">
	function send() {
		if(insertForm.grade.value == "") {
			alert("학년정보가 입력되지 않았습니다!");
			insertForm.grade.focus();
			return;
		}
		
		if(insertForm.class.value == "") {
			alert("반정보가 입력되지 않았습니다!");
			insertForm.class.focus();
			return;
		}
		
		if(insertForm.number.value == "") {
			alert("번호정보가 입력되지 않았습니다!");
			insertForm.number.focus();
			return;
		}
		
		if(insertForm.name.value == "") {
			alert("이름이 입력되지 않았습니다!");
			insertForm.name.focus();
			return;
		}
		
		if(insertForm.birth.value == "") {
			alert("생년월일이 입력되지 않았습니다!");
			insertForm.birth.focus();
			return;
		}
		
		if(!insertForm.gender[0].checked && !insertForm.gender[1].checked) {
			alert("성별을 선택하세요");
			return;
		}
		
		if(insertForm.phone1.value == "") {
			alert("전화번호가 입력되지 않았습니다!");
			insertForm.phone1.focus();
			return;
		}
		if(insertForm.phone2.value == "") {
			alert("전화번호가 입력되지 않았습니다!");
			insertForm.phone2.focus();
			return;
		}
		if(insertForm.phone3.value == "") {
			alert("전화번호가 입력되지 않았습니다!");
			insertForm.phone3.focus();
			return;
		}
		
		insertForm.submit();
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>학생등록</h1>
		<form name="insertForm" action="student_insert_ok.jsp" method="post">
			<table>
				<tr>
					<th>학년</th>
					<td>
						<input name="grade" size="10">
						<span>(예)1</span>
					</td>
				</tr>
				<tr>
					<th>반</th>
					<td>
						<input name="class" size="10">
						<span>(예)01</span>
					</td>
				</tr>
				<tr>
					<th>번호</th>
					<td>
						<input name="number" size="10">
						<span>(예)01</span>
					</td>
				</tr>
				<tr>
					<th>이름</th>
					<td>
						<input name="name" size="26">
					</td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td>
						<input name="birth" size="26">
						<span>(예)20190301</span>
					</td>
				</tr>
				<tr>
					<th>성별</th>
					<td>
						<input type="radio" name="gender" value="남성">남성
						<input type="radio" name="gender" value="여성">여성
					</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>
						<input name="phone1" size="4">-
						<input name="phone2" size="4">-
						<input name="phone3" size="4">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="button" value="학생등록" onclick="send()">
						<input type="reset" value="다시쓰기">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>