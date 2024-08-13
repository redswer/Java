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
		if (insert.eno.value == "") {
			alert("사원번호를 입력하세요");
			insert.eno.focus();
			return;
		}
		if (insert.ename.value == "") {
			alert("사원이름을 입력하세요");
			insert.ename.focus();
			return;
		}
		if (insert.job.value == "") {
			alert("업무명을 입력하세요");
			insert.job.focus();
			return;
		}
		if (insert.manager.value == "") {
			alert("상사번호를 입력하세요");
			insert.manager.focus();
			return;
		}
		if (insert.hiredate.value == "") {
			alert("입사일자를 입력하세요");
			insert.hiredate.focus();
			return;
		}
		if (insert.salary.value == "") {
			alert("급여를 입력하세요");
			insert.salary.focus();
			return;
		}
		if (insert.commission.value == "") {
			alert("커미션를 입력하세요");
			insert.commission.focus();
			return;
		}
		
		insert.submit();
	}
	
	function cancel() {
		history.back();
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<form name="insert" action="empInsert_ok.jsp" method="post">
		<table>
			<tr>
				<th colspan="2">사원등록</th>
			</tr>
			<tr>
				<th>사원번호</th>
				<td>
					<input name="eno">
				</td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td>
					<input name="ename">
				</td>
			</tr>
			<tr>
				<th>업무명</th>
				<td>
					<input name="job">
				</td>
			</tr>
			<tr>
				<th>상사번호</th>
				<td>
					<input name="manager">
				</td>
			</tr>
			<tr>
				<th>입사일자</th>
				<td>
					<input name="hiredate">
				</td>
			</tr>
			<tr>
				<th>급여</th>
				<td>
					<input name="salary">
				</td>
			</tr>
			<tr>
				<th>커미션</th>
				<td>
					<input name="commission">
				</td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td>
					<select name="dno">
						<option value="10">10</option>
						<option value="20">20</option>
						<option value="30">30</option>
						<option value="40">40</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="등록" onclick="send()">
					<input type="reset" value="취소" onclick="cancel()">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>