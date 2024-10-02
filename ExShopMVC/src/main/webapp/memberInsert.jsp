<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{margin:0; padding:0;}
	ul,li {list-style:none;}
	a {text-decoration:none; color:#fff;}
	.logo {color:#fff; text-align:center; background-color:#0040FF; padding:16px 0;}
	.nav{padding:12px 0; overflow:hidden;background-color:#BCA9F5;}
	.nav ul,li{float:left; padding:0 20px; text-align:center;}
	.content {background-color:#E6E6E6; padding:16px;}
	.title {text-align:center;padding:22px;}
	.content table{width:500px;margin:0 auto;}
	.content table th, td{border:1px solid #bbb;}
	.content table .btn_group {text-align:center;}
	.footer {padding:16px 0; text-align:center; background-color:#0040FF;}
</style>
<script type="text/javascript">
	function send() {
		alert("등록합니다");
		memberInsert.submit();
	}
</script>
</head>
<body>
	<div class="header">
		<header>
			<h1 class="logo">쇼핑몰 매출 현황 관리 Ver 1.0</h1>
			<div class="nav">
				<nav>
					<ul class="navi">
						<li><a href="/shop?cmd=insert">회원등록</a></li>
						<li><a href="/shop?cmd=list">회원전체목록</a></li>
						<li><a href="/shop?cmd=view">회원정보조회</a></li>
						<li><a href="/shop?cmd=money">회원매출현황</a></li>
						<li><a href="/index">홈으로</a></li>
					</ul>
				</nav>			
			</div>
		</header>
	</div>
	<div class="section">
		<section>
			<div class="content">
				<h2 class="title">회원등록</h2>
				<form action="/shop?cmd=insertPro" name="memberInsert" method="post">
					<table>
						<tr>
							<th>회원번호(자동)</th>
							<td>
								<input name="custno">
							</td>
						</tr>
						<tr>
							<th>회원성명</th>
							<td>
								<input name="custname">
							</td>
						</tr>
						<tr>
							<th>전화번호</th>
							<td>
								<input name="phone1" size=4>-
								<input name="phone2" size=4>-
								<input name="phone3" size=4>
							</td>
						</tr>
						<tr>
							<th>성별</th>
							<td>
								<input name="gender" type="radio" value="M"> 남성
								<input name="gender" type="radio" value="F"> 여성
							</td>
						</tr>
						<tr>
							<th>가입일자</th>
							<td>
								<input name="joindate">
							</td>
						</tr>
						<tr>
							<th>등급</th>
							<td>
								<select name="grade">
									<option value="">고객등급을 선택하세요</option>
									<option value="A">VIP</option>
									<option value="B">일반</option>
									<option value="C">직원</option>
								</select>
							</td>
						</tr>
						<tr>
							<th>도시코드</th>
							<td>
								<select name="city">
									<option value="">도시를 선택하세요</option>
									<c:forEach var="i" items="${list}">
										<option value="${i.city}">${i.cityname}</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td colspan=2 class="btn_group">
								<input type="button" onClick="send()" value="등록">
								<input type="button" onClick="reset()" value="취소">
							</td>
						</tr>
					</table>
				</form>
			</div>
		</section>
	</div>
	<div class="footer">
		<footer>
			<p>HRDKOREA Copyright@2016 All rights reserve. Human Resources 
			Development Serivce of Korea</p>
		</footer>
	</div>
</body>
</html>