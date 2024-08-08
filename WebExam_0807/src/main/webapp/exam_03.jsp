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
	
	function send() {
		if(joinForm.userName.value == "") {
			alert("이름 입력");
			joinForm.userName.focus();
			return;
		}
		
		if(joinForm.userId.value == "") {
			alert("아이디 입력");
			joinForm.userId.focus();
			return;
		}
		
		if(joinForm.userPw.value == "") {
			alert("비밀번호 입력");
			joinForm.userPw.focus();
			return;
		}
		
		if(joinForm.userPw.value != joinForm.userPwCheck.value) {
			alert("비멀번호 다름");
			joinForm.userPwCheck.focus();
			return;
		}
		
		if(!joinForm.gender[0].checked && !joinForm.gender[1].checked) {
			alert("성별 체크");
			return;
		}
		
		if(joinForm.job.selectedIndex == 0) {
			alert("직업 선택");
			return;
		}
		
		flag = false;
		for(i=0; i < joinForm.hobby.length; i++) {
			if(joinForm.hobby[i].checked) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			alert("관심분야 선택");
			return;
		}
		
		joinForm.submit();
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입 페이지</h1>
	<form name="joinForm" action="exam_03_ok.jsp" method="post">
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
				<td><input id="userPw" name="userPw" type="password"></td>
			</tr>
			<tr>
				<td>비밀번호확인</td>
				<td><input id="userPwCheck" name="userPwCheck" type="password"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<input name="gender" type="radio" value="M"> 남자
					<input name="gender" type="radio" value="F"> 여자
				</td>
			</tr>
			<tr>
				<td>연락처</td>
				<td>
					<select name="phone1">
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
					<input name="phone2" size="4">
					<span>-</span>
					<input name="phone3" size="4">
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>
					<input name="emailAddress" size="8">
					<span>@</span>
					<input id="emailDomainInput" name="emailDomain" size="8" type="text">
                    <select id="emailDomainSelect" name="emailDomain" onchange="updateEmailDomain()">
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
						<option value="영업">영업</option>
						<option value="공무원">공무원</option>
						<option value="회사원">회사원</option>
						<option value="교.강사">교.강사</option>
						<option value="학생">학생</option>
						<option value="기타">기타</option>
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
					<input type="button" value="가입하기" onClick="send()">
					&nbsp;&nbsp;
					<input type="reset" value="다시쓰기">
					&nbsp;&nbsp;
					<input type="button" value="돌아가기" onclick="">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>