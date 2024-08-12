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

	table {
		border: 1px solid black;
		border-collapse: collapse;
		margin: auto;
		text-align: initial;
	}
	
	td, th {
		border: 1px solid black;
	}
	
	th {
		width: 150px;
	}
	
	td {
		width: 400px;
	}
	
	td[colspan="2"] {
		text-align: center;
	}
</style>
<script type="text/javascript">
	function insert() {
		if (product.in_out_number.value == "") {
			alert("입출고번호가 입력되지 않았습니다!");
			product.in_out_number.focus();
			return;
		}
		if (product.product_code.value == "") {
			alert("제품코드가 입력되지 않았습니다!");
			product.product_code.focus();
			return;
		}
		if (!product.in_out_check[0].checked && !product.in_out_check[1].checked) {
			alert("입출고구분이 선택되지 않았습니다.");
			return;
		}
		if (product.count.value == "") {
			alert("수량이 입력되지 않았습니다!");
			product.count.focus();
			return;
		}
		if (product.date.value == "") {
			alert("거래일자가 입력되지 않았습니다!");
			product.date.focus();
			return;
		}
		if (product.account.value == "account") {
			alert("거래처를 선택하세요");
			return;
		}
		
		product.submit();
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>입출고등록</h1>
	<form name="product" action="product_insert_ok.jsp" method="post">
		<table>
			<tr>
				<th>입출고번호</th>
				<td>
					<input name="in_out_number">
					<span>예)20200006</span>
				</td>
			</tr>
			<tr>
				<th>제품코드</th>
				<td>
					<input name="product_code">
				</td>
			</tr>
			<tr>
				<th>입출고구분</th>
				<td>
					<input type="radio" name="in_out_check" value="1"> 입고
					<input type="radio" name="in_out_check" value="0"> 출고
				</td>
			</tr>
			<tr>
				<th>수량</th>
				<td>
					<input name="count">
				</td>
			</tr>
			<tr>
				<th>거래일자</th>
				<td>
					<input name="date">
				</td>
			</tr>
			<tr>
				<th>거래처</th>
				<td>
					<select name="account">
						<option value="account">거래처명</option>
						<option value="10">서울공장</option>
						<option value="20">울산공장</option>
						<option value="30">부산상사</option>
						<option value="40">광주상사</option>
						<option value="50">대전상사</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="입출고등록" onclick="insert()">
					<input type="reset" value="다시쓰기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>