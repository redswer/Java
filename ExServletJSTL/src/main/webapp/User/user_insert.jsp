<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Include/topmenu.jsp" %>

<html>
<head>
<title>회원등록</title>
<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000; BACKGROUND-POSITION: left top; BACKGROUND-REPEAT: no-repeat;}
-->
.formbox {
	BACKGROUND-COLOR: #F0F0F0; FONT-FAMILY: "Verdana", "Arial", "Helvetica", "돋움"; FONT-SIZE:9pt
} 
--->
</STYLE>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		// input에 입력된 값에 변화가 있을 시
		// alert로 입력된 값 출력
		$("input[name='userid']").on("change",function(){
			var userid=$('#userid').val();
			//alert("userid :" + userid);
			
			$.ajax({
				url:'/user_id_check.do',  //서블릿 이용시
				//url:'user_insert_pro.jsp'
				type:'post',
				data:{'userid': userid},
				success:function(result){
					if(result==0){
						userid_c.innerHTML="사용가능한 아이디입니다";
						$('#passwd').focus();
					}else if(result==1){
						userid_c.innerHTML="중복된 아이디입니다";
						$('#userid').val('');
						$('#userid').focus();
					}else{
						userid_c.innerHTML="결과" + result;
					}
				},
				error:function(error){
					alert("error : " + error);
				}
			});
		});
		
		//비번 체크
		$("input[name='repasswd']").on("change",function(){
			var passwd=$('#passwd').val();
			var repasswd=$('#repasswd').val();
			//alert("userid :" + userid);
			if(passwd!=repasswd){
				repasswd_c.innerHTML="비밀번호를 다시 입력하세요";
				$('#repasswd').val('');
				$('#repasswd').focus();
			}else if(passwd==repasswd){
				repasswd_c.innerHTML="확인되었습니다";
			}
		});

	});

	//이메일 체크(이메일 입력체크)
	function emailCheck(){
		if(user.email3.selectedIndex != 0){
			user.email2.readOnly=true;
			user.email2.value = user.email3.value;
		}else{
			user.email2.readOnly=false;
			user.email2.value = "";			
		}
	}

	function user_send() {
		if (!user.name.value) {
			alert("이름을 입력하세요");
			user.name.focus();
			return;
		}
		if (!user.userid.value) {
			alert("아이디를 입력하세요");
			user.userid.focus();
			return;
		}
		if (!user.passwd.value) {
			alert("비밀번호를 입력하세요");
			user.passwd.focus();
			return;
		}
		if (!user.repasswd.value) {
			alert("비밀번호를 입력하세요");
			user.repasswd.focus();
			return;
		}
		if (!user.tel.value) {
			alert("전화번호를 입력하세요");
			user.tel.focus();
			return;
		}
		if (!user.email1.value) {
			alert("이메일을 입력하세요");
			user.email1.focus();
			return;
		}
		if (!user.email2.value) {
			alert("이메일을 입력하세요");
			user.email2.focus();
			return;
		}
		
		user.action="/user_insert.do";
		user.submit();
	}
</script>
</head>

<body bgcolor="#FFFFFF" LEFTMARGIN=0  TOPMARGIN=0 >
 
 <!-- 탑 메뉴 영역 삽입-->


<table border="0" width="800">
<tr>
  <td width="20%"  bgcolor="#ecf1ef" valign="top" style="padding-left:0;">
	<%@ include file="/Include/login_form.jsp" %>
	<!--로그인 영역 삽입-->

  </td>
  <td width="80%" valign="top">&nbsp;<img src="/User/img/title1.gif" ><br>    
	<form name="user" method=post action="/user_insert.do">
	<table border=0 cellpadding=0 cellspacing=0 border=0 width=730 valign=top>
		<tr><td align=center><br>                            
			<table cellpadding=0 cellspacing=0 border=0 width=650 align=center>       
				<tr>
					<td bgcolor="#7AAAD5">            
						<table cellpadding=0 cellspacing=0 border=0 width=100%>
							<tr bgcolor=#7AAAD5>
								<td align=left BORDER="0" HSPACE="0" VSPACE="0"><img src="/User/img/u_b02.gif"></td>
								<td align=center bgcolor="#7AAAD5"><FONT COLOR="#FFFFFF"><b>사용자등록&nbsp;</b><font color=black>(</font><font color=red>&nbsp;*&nbsp;</font><font color=black>표시항목은 반드시 입력하십시요.)</font></FONT></td>
								<td align=right BORDER="0" HSPACE="0" VSPACE="0"><img src="/User/img/u_b03.gif"></td>
							</tr>
						</table>
						<table cellpadding=3 cellspacing=1 border=0 width=100%>
							<tr>
								<td width=110 bgcolor=#EFF4F8>&nbsp;회원 성명<font color=red>&nbsp;*</font></td>
								<td BGCOLOR=WHITE>
									<input type=text name=name size=16 maxlength=20 value="">성명은 빈칸없이 입력하세요.
								</td>
							</tr>
							<tr>
								<td BGCOLOR="#EFF4F8">&nbsp;회원 ID<font color=red>&nbsp;*</font></td>
								<td BGCOLOR=WHITE>
									<table cellspacing=0 cellpadding=0>
										<tr>
											<td align=absmiddle>
												<input type=text name=userid id=userid size=12 maxlength=16 value="" style="width:120">
											</td>
											<td id="userid_c">
                 								5~16자 이내의 영문이나 숫자만 가능합니다.
                  							</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td BGCOLOR="#EFF4F8">&nbsp;비밀번호<font color=red>&nbsp;*</font></td>
								<td BGCOLOR=WHITE>
								<input type=password name=passwd id=passwd size=8 maxlength=12 style="width:80">
									6~12자 이내의 영문이나 숫자만 가능합니다.
								</td>
							</tr>
							<tr>
								<td BGCOLOR="#EFF4F8">&nbsp;비밀번호확인<font color=red>&nbsp;*</font></td>
								<td BGCOLOR=WHITE><input type=password name=repasswd id=repasswd size=8 maxlength=12 value="" style="width:80">
									<font id="repasswd_c" color="red">비밀번호 확인을 위해서 비밀번호를 한번 더 입력해주세요.</font>
								</td>
							</tr>
							<tr>
								<td BGCOLOR="#EFF4F8">&nbsp;전화번호<font color=red>&nbsp;*</font></td>
								<td BGCOLOR=WHITE>
									<input type=text name=tel size=13 maxlength=13 value="">
								</td>
							</tr>
							<tr>
								<td BGCOLOR="#EFF4F8">&nbsp;E-mail
                					<font color=red>&nbsp;</font>
								</td>
								<td bgcolor=WHITE valign=middle>
									<input type="text" name="email1" size=13 maxlength="15">
									@ <input type="text" name="email2" size=13 maxlength="15">
									<select name="email3" onChange="emailCheck()">
		      							<option value="0">직접입력</option>
		      							<option value="naver.com">naver.com</option>
		      							<option value="daum.net">daum.net</option>
		      							<option value="nate.com">nate.com</option>
		      							<option value="gmail.com">gmail.com</option>
		  							   </select>
									 <input type="button"  value="인증하기">
								</td>
							</tr>
						</table>
						<table cellpadding=0 cellspacing=0 border=0 width=100%>
							<tr bgcolor=#7AAAD5>
								<td valign=bottom>
									<img src="/User/img/u_b04.gif" align=left hspace=0 vspace=0 border=0>
								</td>
								<td align=center></td>
								<td valign=bottom>
									<img src="/User/img/u_b05.gif" align=right hspace=0 vspace=0 border=0>
								</td>
							</tr>
							<tr bgcolor=#ffffff>
								<td colspan=3 align=center>
									<img src="/User/img/u_bt06.gif" vspace=3 border=0 name=img3 onClick="user_send()">
									<img src="/User/img/u_bt05.gif" border=0 hspace=10 vspace=3 name=img4 onClick="reset()">
								</td>
							</tr>
						</table> 
					</td>
				</tr>
				</td>
			</tr>
		</table>
	</form>
	</td>
</tr>
</table>

 <!-- copyright 영역 삽입-->
  

</body>
</html>
