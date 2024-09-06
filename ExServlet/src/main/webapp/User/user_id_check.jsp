<%@ page contentType="text/html; charset=UTF-8" %>
<%
	int row = -1;
	String userid = null;

	if (request.getAttribute("row") != null) {
		row = (int)request.getAttribute("row");
		userid = (String)request.getAttribute("userid");
	}
%>

<HTML>
<HEAD>
<TITLE>사용자의 아이디를 체크합니다.</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
--->
</STYLE>
<script type="text/javascript">
	function id_check() {
		if(!idcheck.userid.value) {
			alert("아이디를 입력하세요");
			idcheck.userid.focus();
			return;
		}
		
		idcheck.submit();
	}
</script>

<%
	if (row == 0) {
%>
<script type="text/javascript">
	function win_close() {
		opener.user.userid.value = "${userid}";
		self.close();
	}
</script>
<%
	} else {
%>
<script type="text/javascript">
function win_close() {
	alert("중복된 아이디입니다");
	idcheck.userid.focus();
	return;
}
</script>
<%
	}
%>
</HEAD>
<BODY bgcolor="#FFFFFF">
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
    <td align=left><img src="User/img/u_b02.gif"></td>
    <td align=center><FONT COLOR="#FFFFFF"><b>아이디 중복 체크</FONT></td>
    <td align=right><img src="User/img/u_b03.gif"></td>
  </tr>
</table>
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
<TR BGCOLOR=#948DCF>
  <TD>
    <TABLE CELLPADDING=4 CELLSPACING=1 BORDER=0 WIDTH=330>
  	  <TR BGCOLOR="#FFFFFF">
        <TD ALIGN="center">
        <%
        	if (row == -1) {
        %>
        	<br><FONT FACE="굴림"><B>아이디를 입력하세요</B></FONT><br>
        <%
        	} else if (row == 0) {
        %>
          <br><FONT FACE="굴림"><B>사용 가능합니다.</B></FONT><br>
         <BR><FONT COLOR="#483cae"><b>${userid}</b></FONT>는 아직 사용되지 않은 아이디입니다.
         <BR><FONT COLOR="#483cae"><b>${userid}</b></FONT>로 등록하셔도 됩니다.
         <%
        	} else {
         %>
         <br><font face="굴림"><b>죄송합니다</b></font><br>
    	<BR><FONT COLOR="#483cae"><b>${userid}</b></FONT>는 이미 사용 중인 아이디입니다<br>
    	다른 아이디를 사용하여 주십시오.
    	<%
        	}
    	%>
    	<form name="idcheck" action="user_id_check" method="post">
    		아이디 검색 : 
           <INPUT NAME=userid type=text size=16 maxlength=16 value=${userid}>
      	   <input type=image src="User/img/u_bt08.gif" border=0 vspace=0 onClick="id_check()">
    	</form>
        </TD>
      </TR>
    </TABLE>
 </TD>
</TR>
</TABLE>

<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
    <td align=left><img src="User/img/u_b04.gif"></td>
    <td align=right><img src="User/img/u_b05.gif"></td>
  </tr>
  <tr>
    <td colspan=3 align=center>
      <img src="User/img/u_bt13.gif" border=0 vspace=5 onClick="win_close()">
    </td>
  </tr>
</table>
</BODY>
</HTML>