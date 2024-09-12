<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, com.jslhrd.exservlet.model.guest.*" %>
<%@ include file="/Include/topmenu.jsp" %>

<%
	List<GuestDTO> list = (List)request.getAttribute("list");
	String search = (String)request.getAttribute("search");
	String key = (String)request.getAttribute("key");
	int listcount = (int)request.getAttribute("listcount");
%>
<html>
<head><title>방명록 읽기</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<style type="text/css">
  a.list {text-decoration:none;color:black;font-size:10pt;}
</style>
<script type="text/javascript">
	function send() {
		if (!guest.key.value) {
			guest.key.focus();
			alert("검색어를 입력하세요");
			return;
		}
		
		guest.submit();
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
        <img src="Guest/img/bullet-01.gif"> <b>방 명 록</b></font></td></tr>
      <tr>
        <td colspan="5" align="right" valign="middle" height="20">
		<font size="2" face="고딕">전체 : <b>${cnt}</b>건 - ${totpage} / ${page} Pages</font></td></tr>
 	   <tr bgcolor="e3e9ff">
 	      <td width="10%"align="center" height="20"><font face="돋움" size="2">번호</font></td>
 	      <td width="50%" align="center" height="20"><font face="돋움" size="2">제목</font></td>
 	      <td width="15%" align="center" height="20"><font face="돋움" size="2">글쓴이</font></td>
 	      <td width="15%" align="center" height="20"><font face="돋움" size="2">작성일</font></td>
 	      <td width="10%" align="center" height="20"><font face="돋움" size="2">조회수</font></td>
 	   </tr>

<%
	for(int i = 0; i < list.size(); i++) {
%>
		<tr onMouseOver="style.backgroundColor='#D1EEEE'" onMouseOut="style.backgroundColor=''">
			<td align="center" height="25">
			<font face="돋움" size="2" color="#000000"></font><%= listcount-- %></td>
			<td align="left" height="20">&nbsp;
				<font face="돋움" size="2" color="#000000">
				<a class="list" href="/guest_view?idx=<%= list.get(i).getIdx() %>&page=${page}"><%= list.get(i).getSubject() %></a></td>
					<td align="center" height="20"><font face="돋움" size="2">
					<a class="list" href="#"><%= list.get(i).getName() %></a></font></td>
				<td align="center" height="20"><font face="돋움" size="2"><%= list.get(i).getRegdate().substring(0, 10) %></font></td>
				<td align="center" height="20"><font face="돋움" size="2">
				<%= list.get(i).getReadcnt() %></font></td>
		</tr>
<%
	}
%>
     <div align="center">
        <table width="700" border="0" cellspacing="0" cellpadding="5">
          <tr>&nbsp;</tr><tr>
             <td colspan="5">        
                <div align="center">${pageIndex}</div>
			  </td>
			 </tr>
		</table>
		
		<table width="700">
		<tr>
			<td width="25%"> &nbsp;</td>
			<td width="50%" align="center">
				<form name="guest" action="/guest_list" method="post">	
					<table>
					<!-- 검색어를 이용하여 글제목, 작성자, 글내용 중에 하나를 입력 받아 처리하기 위한 부분 -->
						<tr>
							<td>
								<select name="search">
									<option value="subject" <% if (search.equals("subjet")) { %> selected <% } %>>글제목</option>
									<option value="name" <% if (search.equals("name")) { %> selected <% } %>>작성자</option>
									<option value="contents" <% if (search.equals("contents")) { %> selected <% } %>>글내용</option>
								</select>
							</td>
							<td> <input type="text" size=20 name="key" <% if (key != null) { %> value="<%= key %>" <% } %>></td>
							<td> <a href="javascript:send()"><img src="Guest/img/search2.gif" border="0"></a></td>
						</tr>
					</table>
				</form>
			</td>
			<td width="25%" align="right">
			<a href="/guest_list"><img src="Guest/img/list-2.gif" border="0"></a>&nbsp;&nbsp;&nbsp;
			<a href="/guest_write"><img src="Guest/img/write.gif" border="0"></a>
			</td>
		</tr>
	</table>
		
		</div>
	</body>
	</html>

<%@ include file="/Include/copyright.jsp" %>