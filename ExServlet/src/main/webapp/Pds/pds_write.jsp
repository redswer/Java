<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Include/topmenu.jsp" %>

<html>
   <head><title> 자료 올리기 </title>
   	<script type="text/javascript">
		function send(){
			if (!pds.name.value) {
				alert("이름을 입력하세요");
				pds.name.focus();
				return;
			}
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
<body>
<link rel="stylesheet" type="text/css" href="stylesheet.css">

<table border="0" width="800">
 <tr>
   <td width="20%" height="500" bgcolor="#ecf1ef" valign="top">
<%@ include file="/Include/login_form.jsp" %>
<!--     다음에 추가할 로그인  -->

   </td>
   <td width="80%" valign="top">&nbsp;<br>
     <img src="Pds/img/bullet-01.gif"><font size="3" face="돋움" color="blue"> <b>참 좋은 자료실</b></font>
     <font size="2"> - 자료올리기</font><p>
     <img src="Pds/img/bullet-03.gif"><font size="2" face="돋움" color="orange"> 잠깐</font> &nbsp;
     <img src="Pds/img/bullet-02.gif"><font size="2" face="돋움">는 필수 입력 사항입니다.</font><p>

<form action="/pds_write" enctype="multipart/form-data" name="pds" method="post">
	  <table border="0" >
		<tr>
         <td width="5%" align="right"><img src="Pds/img/bullet-02.gif"></td>
         <td width="15%"><font size="2" face="돋움">글쓴이</font></td>
         <td width="80%">
			<input type="text" size="20" name="name"></td>
		</tr>
		<tr> 
		  <td align="right">&nbsp;</td>
          <td><font size="2" face="돋움">메일주소</font></td>
		  <td><input type="text" size="20" name="email"></td>
		</tr>	
       <tr>
         <td align="right"><img src="Pds/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">제목</font></td>
         <td><input type="text" size="60" name="subject"></td>
       </tr>
       <tr>
         <td align="right"><img src="Pds/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">내용</font></td>
         <td><textarea wrap="physical" rows="10" name="contents" cols="60"></textarea></td>
       </tr>
		<tr>
		  <td align="right"><img src="Pds/img/bullet-02.gif"></td>
		  <td><font size="2" face="돋움">파일첨부</font></td>
		  <td><input type="file" name="filename" size="63"></td></tr>
		<tr>
       <tr>
         <td align="right"><img src="Pds/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">비밀번호</font></td>
          <td><input type="password" size="10" name="pass" > 
          <font size="2" face="돋움">*.게시글의 수정 및 삭제시 필요.</font>
         </td>
        </tr>

		<tr></tr>			<tr></tr>
          <td align="right">&nbsp;</td>
          <td><font size="2">&nbsp;</font></td>
          <td align=center>
			<img src="Pds/img/purple_save.gif" width="56" height="18" border="0" onClick="send()">
			<img src="Pds/img/purple_cancle.gif" width="56" height="18" border="0" onClick="history.back()">

		  </td>
        </tr>
      </table>
      </form>
    </td>
  </tr>
 </table>
</body>		
</html>

<%@ include file="/Include/copyright.jsp" %>