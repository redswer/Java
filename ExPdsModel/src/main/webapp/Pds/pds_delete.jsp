<%@ page contentType="text/html; charset=UTF-8" %>
<%
	int idx = Integer.parseInt(request.getParameter("idx"));
%>

<html>
<head><title>자료 삭제</title>
<link rel="stylesheet" type="text/css" href="/stylesheet.css">
<script type="text/javascript">
	function send() {
		if (!pds.pass.value) {
			alert("비밀번호를 입력하세요");
			pds.pass.focus();
			return;
		}
		
		pds.submit();
	}
</script>
</head>
<body>
<form action="pds_delete_pro.jsp" method="post" name="pds">
<input type="hidden" name="idx" value="<%= idx %>">
<input type="hidden" name="filename" value="<%=  %>">
  <table border="0" cellpadding="0" cellspacing="0" width="300" align="center">
  <tr>
    <td height="50">
    <img src="./img/bullet-05.gif"> <b><font size="3" color="red">잠깐 !!</font></b></td></tr>
  <tr>
    <td valign="middle" height="30">
    <font size="2" face="돋움">게시물은 작성하신 분만 삭제할 수 있습니다.<br>
    글의 비밀번호를 입력해 주세요...</font></td></tr>
  <tr>
    <td valign="middle" height="40">
    <font size="2" face="돋움">비밀번호 <input type="password" name="pass" size="8"></font>
    <input type="button" value="삭제" onClick="send()">
    <input type="button" value="닫기" onClick="history.back()"> </td></tr>
  </table>
  </form>
</body>
</html>
