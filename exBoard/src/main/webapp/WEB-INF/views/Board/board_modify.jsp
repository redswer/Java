<%@ page contentType="text/html; charset=UTF-8" %>

   <head><title>게시판 수정</title>
    <link rel="stylesheet" type="text/css" href="/stylesheet.css">
	<script type="text/javascript">
		function send() {
			if (!board.email.value) {
				alert("이메일 입력");
				board.email.focus();
				return;
			}
			
			if (!board.subject.value) {
				alert("제목 입력");
				board.subject.focus();
				return;
			}
			
			if (!board.contents.value) {
				alert("내용 입력");
				board.contents.focus();
				return;
			}
			
			if (!board.pass.value) {
				alert("비밀번호 입력");
				board.pass.focus();
				return;
			}
			
			board.submit();
		}
	</script>
</head>

 <body topmargin="0" leftmargin="0">
 <table border="0" width="800">
 <tr>
   <td width="20%" height="500" bgcolor="#ecf1ef" valign="top">

   <!-- 다음에 추가할 부분 "-->

   </td>
   <td width="80%" valign="top">&nbsp;<br>
     <img src="/img/bullet-01.gif"><font size="3" face="돋움" color="blue"> <b>자 유 게 시 판</b></font>
     <font size="2"> - 수정하기</font><p>
     <img src="/img/bullet-03.gif"><font size="2" face="돋움" color="orange"> 잠깐</font> &nbsp;
     <img src="/img/bullet-02.gif"><font size="2" face="돋움">는 필수 입력 사항입니다.</font><p>
     <form method="post" action="/Board/board_modify" name="board">
		<input type="hidden" value="${dto.idx}" name="idx">
      <table border="0">
       <tr>
         <td width="5%" align="right"><img src="/img/bullet-02.gif"></td>
         <td width="15%"><font size="2" face="돋움">글쓴이</font></td>
         <td width="80%">
         <input type="text" size="20" name="name" value="${dto.name}" readOnly></td>
       </tr>
       <tr>
         <td align="right">&nbsp;</td>
         <td ><font size="2" face="돋움">메일주소</font></td>
         <td>
          <input type="text" size="20" name="email" value="${dto.email}"></td>
       </tr>
       <tr>
         <td align="right"><img src="/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">제 목</font></td>
         <td><input type="text" size="60" name="subject" value="${dto.subject}"></td>
       </tr>
       <tr>
         <td align="right"><img src="/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">내용</font></td>
         <td><textarea wrap="physical" rows="10" name="contents" cols="60" >${dto.contents}</textarea></td>
       </tr>
       <tr>
         <td align="right"><img src="/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">비밀번호</font></td>
          <td><input type="password" size="10" name="pass" >
		  <font size="2" face="돋움">*.수정과 삭제시 꼭 입력하셔야 합니다.</font></td>
        </tr>
        <tr>
          <td align="right">&nbsp;</td>
          <td><font size="2">&nbsp;</font></td>
          <td><a href="javascript:send()"><img src="/img/edit2.gif" border=0></a>&nbsp;
          <a href="javascript:history.back()"><img src="/img/cancle.gif" border=0></a></td></tr>
      </table>
      </form>
    </td></tr>
  </table>
  </body>
  </html>
