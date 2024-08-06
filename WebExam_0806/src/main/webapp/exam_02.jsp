<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ul / li</title>
</head>
<body>
	<!-- 순서가 없는 목록 -->
	<ul>
		<li><a href="http://www.naver.com">naver</a></li>
		<li><a href="http://www.google.com">google</a></li>
		<li><a href="http://www.yahoo.com">yahoo</a></li>
	</ul>
	
	<!-- 순서가 있는 목록 -->
	<ol>
		<li><a href="http://www.naver.com">naver</a></li>
		<li><a href="http://www.google.com">google</a></li>
		<li><a href="http://www.yahoo.com">yahoo</a></li>
	</ol>
	<hr>
	
	<ul>
		<li>축구</li>
		<li>야구</li>
		<li>배구</li>
		<li>농구</li>
	</ul>
	<ol type="a">
		<li>축구</li>
		<li>야구</li>
		<li>배구</li>
		<li>농구</li>
	</ol>
	<hr>
	
	<ul>
		<li>
			1일차
			<ol type="A">
				<li>축구</li>
				<li>배구</li>
				<li>야구</li>
			</ol>
		</li>
		<li>
			2일차
			<ol type="A">
				<li>욱상</li>
				<li>수영</li>
				<li>양궁</li>
			</ol>
		</li>
	</ul>
</body>
</html>