<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Include/topmenu.jsp" %>
<%@ page import="com.jslhrd.exservlet.model.pds.*" %>
<%
	PdsDTO dto = (PdsDTO) request.getAttribute("dto");
%>
<html>
<head><title>자료 등록 수정</title><link rel="stylesheet" type="text/css" href="/stylesheet.css">
<script type="text/javascript">
		function send(){
			if (!pds.subject.value) {
				alert("제목을 입력하세요");
				pds.subject.focus();
				return;
			}
			if (!pds.contents.value) {
				alert("내용을 입력하세요");
				pds.contents.focus();
				return;
			}
			if (!pds.pass.value) {
				alert("비밀번호를 입력하세요");
				pds.pass.focus();
				return;
			}
			
			if (pds.filename.value) {
				var size = pds.filename.files[0].size;
				
				if (size > (5 * 1024 * 1024)) { 
					alert("파일용량은 5MB 를 초과할 수 없습니다.");
					return;
				}
			}
			
			alert("글을 등록합니다.");
			pds.submit();
		}
	</script>
</head>
<body topmargin="0" leftmargin="0">
<table border="0" width="800">
<tr>
  <td width="20%" height="500" valign="top" bgcolor="#ecf1ef">
<%@ include file="/Include/login_form.jsp" %>
  <!--  로그인 폼 추가부분 -->
  
  </td>
  <td width="80%" valign="top">&nbsp;<br>
  <img src="Pds/img/bullet-01.gif"><font size="3" face="돋움" color="blue">
  <b> 뮤직자료실</b></font><font size="2"> - 자료 수정하기</font><p>
  <img src="Pds/img/bullet-03.gif"><font size="2" face="돋움" color="orange"> 잠깐</font> &nbsp;
  <img src="Pds/img/bullet-02.gif"><font size="2" face="돋움">는 필수 입력 사항입니다.</font><p></p>

<form action="/pds_modify" enctype="multipart/form-data" name="pds" method="post">
	<input type="hidden" value="${dto.idx}" name="idx">
   <table border="0">
    <tr>
      <td width="5%" align="right"><img src="Pds/img/bullet-02.gif"></td>
      <td width="15%"><font size="2 face="돋움"">글쓴이</font></td>
      <td width="80%"><input type="text" size="20" name="name" value="${dto.name}" readOnly></td></tr>
    <tr>
      <td align="right">&nbsp;</td>
      <td ><font size="2 face="돋움"">메일주소</font></td>
      <td><input type="text" size="20" name="email" value="${dto.email}"></td></tr>
    <tr>
      <td align="right"><img src="Pds/img/bullet-02.gif"></td>
      <td><font size="2" face="돋움">제목</font></td>
      <td><input type="text" size="60" name="subject" value="${dto.subject}"></td></tr>
    <tr>
      <td align="right"><img src="Pds/img/bullet-02.gif"></td>
      <td><font size="2" face="돋움">자료설명</font></td>
      <td><textarea wrap="physical" rows="10" name="contents" cols="60">${dto.contents}</textarea></td></tr>
<%
	if(dto.getFilename() != null ){
%>    
    <tr>
      <td align="right"><img src="Pds/img/bullet-02.gif"></td>
      <td><font size="2" face="돋움">파일명</font></td>
      <td><input value="<%= dto.getFilename() %>" name="o_filename" readOnly> </td></tr>
<%
	}
%>
    <tr>
      <td align="right"><img src="Pds/img/bullet-02.gif"></td>
      <td><font size="2" face="돋움">파일첨부</font></td>
      <td><input type="file" name="filename" size="30"></td></tr>
    <tr>
      <td align="right"><img src="Pds/img/bullet-02.gif"></td>
      <td><font size="2" face="돋움">비밀번호</font></td>
      <td><input type="password" size="10" name="pass"></td></tr>
    <tr>
      <td align="right">&nbsp;</td>
      <td><font size="2">&nbsp;</font></td>
      <td><input type="button" value="수정하기" onClick="send()">&nbsp;
      <input type="button" value="돌아가기" onClick="history.back()"></td></tr>
    </table>
</form>
</td>

  </tr>
  </table>
</body>
</html>

<%@ include file="/Include/copyright.jsp" %>