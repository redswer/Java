<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, com.jslhrd.exservletjstl.model.board.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="/Include/topmenu.jsp" %>

<html>
<head><title>게시판 읽기</title>
<link rel="stylesheet" type="text/css" href="/stylesheet.css">
<style type="text/css">
  a.list {text-decoration:none;color:black;font-size:10pt;}
</style>
	<script type="text/javascript">
		function send() {
			if (!board.key.value) {
				alert("검색어를 입력하세요");
				board.key.focus();
				return;
			}
			
			board.submit();
		}
	</script>
</head>
<body bgcolor="#FFFFFF" topmargin="0" leftmargin="0">
<table border="0" width="800">
  <tr>
    <td width="20%" height="500" valign="top" bgcolor="#ecf1ef">
	<%@ include file="/Include/login_form.jsp" %>
	<!-- 다음에 추가할 부분 --></td>

	<td width="80%" valign="top">	
		<br>
    <table border="0" cellspacing="1" width="100%" align="center">
      <tr>
        <td colspan="7" align="center" valign="center" height="20">
        <font size="4" face="돋움" color="blue">
        <img src="Board/img/bullet-01.gif"> <b>자 유 게 시 판</b></font></td></tr>
      <tr>
        <td colspan="5" align="right" valign="middle" height="20">
		<font size="2" face="고딕">전체 : <b>${cnt}</b>건 - ${page}/ ${totpage} Pages</font></td></tr>
 	   <tr bgcolor="e3e9ff">
 	      <td width="10%" align="center" height="20"><font face="돋움" size="2">번 호</font></td>
 	      <td width="50%" align="center" height="20"><font face="돋움" size="2">제 목</font></td>
 	      <td width="15%" align="center" height="20"><font face="돋움" size="2">글쓴이</font></td>
 	      <td width="15%" align="center" height="20"><font face="돋움" size="2">작성일</font></td>
 	      <td width="10%" align="center" height="20"><font face="돋움" size="2">조회수</font></td>
 	   </tr>
	<c:if test="${empty list}" >
		<tr>
			<td width="10%" align="center" height="20" colspan="2"><font face="돋움" size="2">데이터 없음</font></td>
		</tr>
	</c:if>
	<c:if test="${!empty list}">
		<c:forEach var="i" items="${list}">
			<tr onMouseOver="style.backgroundColor='#D1EEEE'" onMouseOut="style.backgroundColor=''">
				<td align="center" height="25">
				<font face="돋움" size="2" color="#000000"></font>${i.idx}</td>
				<td align="left" height="20">&nbsp;
					<font face="돋움" size="2" color="#000000">
					<a class="list" href="/board_view.do?idx=${i.idx}&page=${page}">${i.subject}</a></td>
						<td align="center" height="20"><font face="돋움" size="2">
						<a class="list" href="${i.email}">${i.name}</a></font></td>
					<td align="center" height="20"><font face="돋움" size="2">${i.regdate.substring(0, 10)}</font></td>
					<td align="center" height="20"><font face="돋움" size="2">
					${i.readcnt}</font></td>
			</tr>
		</c:forEach>
	</c:if>
	 <div align="center">
        <table width="700" border="0" cellspacing="0" cellpadding="5">
          <tr>&nbsp;</tr><tr>
             <td colspan="5">        
                <div align="center">${pageIndex}</div>
			  </td>
			 </tr>
		</table>

	<table width="600">
		<tr>
			<td width="25%"> &nbsp;</td>
			<td width="50%" align="center">
			<form action="board_list.do" method="post" name="board">	
				<table>
					<!-- 검색어를 이용하여 글제목, 작성자, 글내용 중에 하나를 입력 받아 처리하기 위한 부분 -->
						<tr>
							<td>
								<select name="search">
									<option value="subject" <c:if test="${search == 'subject'}">selected</c:if>>글제목</option>
									<option value="name" <c:if test="${search == 'name'}">selected</c:if>>작성자</option>
									<option value="contents" <c:if test="${search == 'contents'}">selected</c:if>>글내용</option>
								</select>
							</td>
							<td> <input type="text" size=20 name="key" <c:if test="${!empty key}">value="${key}"</c:if>></td>
							<td> <a href="javascript:send()"><img src="Board/img/search2.gif" border="0"></a></td>
						</tr>
				</table>
			</form>
			</td>
			<td width="25%" align="right">
			<a href="/board_list.do"><img src="Board/img/list-2.gif" alt="자료등록" align="middle" border="0"></a>&nbsp;&nbsp;&nbsp;
			<a href="/board_write.do"><img src="Board/img/write.gif" border="0"></a>
			</td>
		</tr>
	</table>
</body>
</html>