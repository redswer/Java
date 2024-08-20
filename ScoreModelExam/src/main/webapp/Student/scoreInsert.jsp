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
		if(score.hakbun.value == "") {
			alert("학번정보가 입력되지 않았습니다!");
			return;
		}
		if(score.kor.value == "") {
			alert("국어성적이 입력되지 않았습니다!");
			return;
		}
		if(score.eng.value == "") {
			alert("영어성적이 입력되지 않았습니다!");
			return;
		}
		if(score.mat.value == "") {
			alert("수학성적이 입력되지 않았습니다!");
			return;
		}
		
		alert("학생성적이 정상적으로 등록되었습니다.");
		score.submit();
	}
	
	function re() {
		alert("정보를 지우고 처음부터 다시 입력됩니다.");
		score.reset();
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>학생 성적 등록</h1>
	
	<form name="score" action="scoreInsert_pro.jsp" method="post">
		<table>
			<tr>
				<th>학번</th>
				<td>
					<input name="hakbun">
					<span>예)1101</span>
				</td>
			</tr>
			<tr>
				<th>국어점수</th>
				<td>
					<input name="kor">
				</td>
			</tr>
			<tr>
				<th>영어점수</th>
				<td>
					<input name="eng">
				</td>
			</tr>
			<tr>
				<th>수학점수</th>
				<td>
					<input name="mat">
				</td>
			</tr>
			<tr>
				<td colspan=2>
					<input type="button" value="성적저장" onClick="send()">
					<input type="button" value="다시쓰기" onClick="re()">
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>