<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	table {
		margin: auto;
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	h1 {
		text-align: center;
	}
	
	th, td {
		border: 1px solid black;
		padding: 10px;
	}
	
	th {
		background-color: #98FB98;
	}
	
	tr td:first-child {
		background-color: #F0FFF0;
	}
	
	#button {
		background-color: initial;
		text-align: center;
	}
</style>
<script type="text/javascript">
	function updateEmailDomain() {
	    var domainSelect = document.getElementById("emailDomainSelect");
	    var emailDomainInput = document.getElementById("emailDomainInput");
	    var selectedDomain = domainSelect.value;
	    
	    if (selectedDomain !== "직접입력") {
	        emailDomainInput.value = selectedDomain;
	        emailDomainInput.readOnly = true;
	    } else {
	        emailDomainInput.value = "";
	        emailDomainInput.readOnly = false;
	    }
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입 페이지</h1>
	<form action="form" method="post">
		<table>
			<tr>
				<th colspan="2">회원 기본 정보</th>
			</tr>
			<tr>
				<td>사용자이름</td>
				<td><input name="userName"></td>
			</tr>
			<tr>
				<td>사용자아이디</td>
				<td><input name="userId"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input name="userPw" type="password"></td>
			</tr>
			<tr>
				<td>비밀번호확인</td>
				<td><input name="userPwCheck" type="password"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<input name="gender" type="radio" value="male"> 남자
					<input name="gender" type="radio" value="female"> 여자
				</td>
			</tr>
			<tr>
				<td>연락처</td>
				<td>
					<select name="phone">
						<option value="010">010</option>
						<option value="02">02</option>
						<option value="031">031</option>
						<option value="032">032</option>
						<option value="033">033</option>
						<option value="041">041</option>
						<option value="042">042</option>
						<option value="043">043</option>
						<option value="044">044</option>
						<option value="051">051</option>
						<option value="052">052</option>
						<option value="053">053</option>
						<option value="054">054</option>
						<option value="055">055</option>
						<option value="061">061</option>
						<option value="062">062</option>
						<option value="063">063</option>
						<option value="064">064</option>
					</select>
					<span>-</span>
					<input name="phone2" size="5">
					<span>-</span>
					<input name="phone3" size="5">
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>
					<input name="email_adress" size="8">
					<span>@</span>
					<input id="emailDomainInput" name="email_domain" size="8" type="text">
                    <select id="emailDomainSelect" name="email_domain_select" onchange="updateEmailDomain()">
						<option>직접입력</option>
						<option value="naver.com">naver.com</option>
						<option value="nate.com">nate.com</option>
						<option value="google.com">google.com</option>
						<option value="daum.net">daum.net</option>
						<option value="yahoo.kr">yahoo.kr</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>직업</td>
				<td>
					<select name="job">
						<option>직업을 선택하세요</option>
						<option value="">무직</option>
						<option value="">회사원</option>
						<option value="">자영업자</option>
						<option value="">기타</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>관심분야</td>
				<td>
					<input name="hobby" type="checkbox" value="golf">골프
					<input name="hobby" type="checkbox" value="soccer">축구
					<input name="hobby" type="checkbox" value="baseball">야구
					<input name="hobby" type="checkbox" value="basketball">농구
					<input name="hobby" type="checkbox" value="valleyball">배구
				</td>
			</tr>
			<tr>
				<td>기타(한마디)</td>
				<td>
					<textarea rows="5" cols="50" name="etc"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" id="button">
					<input type="button" value="가입하기">
					<input type="reset" value="돌아가기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>