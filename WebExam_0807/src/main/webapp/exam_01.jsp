<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	label, input, select, textarea {
		margin: 5px auto;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<label for="id">아이디 : </label>
		<input name="id">
		<br>
		
		<label for="pw">패스워드 : </label>
		<input type="password" name="pw">
		<br>
		
		<label for="hobby">취미 : </label>
		<input type="checkbox" name="hobby"> 축구
		<input type="checkbox" name="hobby"> 야구
		<input type="checkbox" name="hobby"> 농구
		<input type="checkbox" name="hobby"> 배구
		<br>
		
		<label for="gender">성별 : </label>
		<input type="radio" name="gender">남자
		<input type="radio" name="gender">여자
		<br>
		
		<label for="job">직업 : </label>
		<select name="job">
			<option>실업자</option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
			<option>5</option>
		</select>
		<br>
		
		<label for="pr">자기소개</label>
		<br>
		<textarea name="pr" rows="5" cols="50"></textarea>
		<br>
			
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</body>
</html>