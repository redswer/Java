<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.jslhrd.board.model.*" %>
<%
	int idx = Integer.parseInt(request.getParameter("idx"));

	BoardDAO dao = BoardDAO.getInstance();
	
	boolean found = false;
	Cookie info = null;
	
	// 컴퓨터의 쿠키 목록 불러오기
	Cookie[] cookies = request.getCookies();
	
	// 쿠키 조회
	for (int i = 0; i < cookies.length; i++) {
		info = cookies[i];
		
		if (info.getName().equals("board" + idx)) {
			found = true;
			break;
		}
	}
	
	String newVal = "" + System.currentTimeMillis();
	
	if (!found) {
		dao.readcnt(idx);
		
		// 쿠키 생성 (이름, 값)
		info = new Cookie("board" + idx, newVal);
		
		// 유효기간 (기본 단위 : 초)
		info.setMaxAge(24 * 60 * 60);
		
		// 쿠키 전송
		response.addCookie(info);
	}
	
	BoardDTO dto = dao.boardSelect(idx);
%>

 <html>
 <head><meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
   <title>게시판 내용 보기</title>
   <link rel="stylesheet" type="text/css" href="/stylesheet.css">
   <style type="text/css">
     td.title { padding:4px; background-color:#e3e9ff }
     td.content { padding:10px; line-height:1.6em; text-align:justify; }
     a.list { text-decoration:none;color:black;font-size:10pt; }
   </style>
	<script type="text/javascript">
		function board_del() {
			window.open("./board_delete.jsp?idx=<%= idx %>", "_blank", "width=500, height=300, top=150, left=500");
		}
	</script>
 </head>
 <body topmargin="0" leftmargin="0">
   <table border="0" width="800">
     <tr>
       <td width="20%"  height="500" bgcolor="#ecf1ef" valign="top">

		 <!--  다음에 추가할 부분 -->

	   </td>
       <td width="80%" valign="top">&nbsp;<br>
         <table border="0" width="90%" align="center">
           <tr>
             <td colspan="2"><img src="./img/bullet-01.gif"> 
              <font color="blue" size="3">자 유 게 시 판</font><font size="2"> - 글읽기</font></td>
           </tr>
         </table>
       <p>
       <table border="0" width="90%" align="center" cellspacing="0"  style="border-width:1px;border-color:#0066cc;border-style:outset;">
         <tr bgcolor="e3e9ff">
           <td class="title">
             <img src="./img/bullet-04.gif"> <font size="2" face="돋움"><%= dto.getSubject() %></font>
           </td>
         </tr>
         <tr>
           <td class="content">
             <p align="right"><font size="2" face="돋움">
              <a class="list" href="mailto:ein1027@nate.com"><%= dto.getName() %></a> / <font size="2" face="돋움"><%= dto.getRegdate() %> / <%= dto.getReadcnt() %>번 읽음</font>
             <p><%= dto.getContents().replace("\n", "<br>") %><p><!--contents의 내용을 <BR>태그로 처리-->
           </td>
         </tr>
       </table>
  
      <!--**** 여기서부터 게시물 내용 아래쪽의 버튼들이 나옵니다. 답변, 수정, 삭제, 목록보기 ****-->
      <p align="center">
      <font size="2">
       <!-- 새글쓰기 -->
       <a href="./board_write.jsp">
       <img src="./img/write.jpg" border="0"></a>&nbsp;&nbsp;
      <!-- 수정하기 -->
       <a href="./board_modify.jsp?idx=<%= idx %>">
       <img src="./img/edit.gif" border="0"></a>&nbsp;&nbsp;
         <!-- 삭제하기 -->
       <a href="javascript:board_del()"><img src="./img/del.gif" border="0"></a>&nbsp;&nbsp;
       <!-- 목록보기 -->
       <a href="./board_list.jsp"><img src="./img/list-2.gif" border="0"></a>&nbsp;&nbsp;
      </font>
    </td>
  </tr>
  </table>
  </body>
  </html>

