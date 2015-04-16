<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>

<script type="text/javascript">
function st1(){ 

if(document.st.userId.value=="输入您的学号"){ document.st.userId.focus();
document.st.userId.value="";return false;}
else return true;	 
}
function st2(){ 

if(document.st.userId.value==""){ document.st.userId.focus();
document.st.userId.value="输入您的学号";return false;}else return true;	 
}


function checkst(){
	
if(!st1()){ document.st.userId.value=="";
      document.st.userId.focus();return false;}
else if(document.st.stuPassword.value==""){
	 document.st.stuPassword.focus();return false;}
else return true;	  
}

</script>

 <form name="st" id="st" method="post" action="stuAction_stuLogin.do" onSubmit="if(!checkst()) return false;">
<table width="200" height="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="20" rowspan="4">&nbsp;</td>
    <td width="168" align="right">学生登录</td>
    <td width="12" rowspan="4"></td>

  </tr>
  <tr>
    <td height="16" align="center" valign="top">
    <input name="loginDTO.userId" type="text" id="userId" value="输入您的学号" onfocus="if(this.value=='输入您的学号'){this.value='';}"  onblur="if(this.value==''){this.value='输入您的学号';}"/>
    </td>
    </tr>
  <tr>
    <td align="center" valign="middle">
    <input name="loginDTO.password" type="password" id="stuPassword" onfocus=""/>
    </td>
    </tr>
    
  <tr>
    <td align="center" valign="top"><input name="log_st" type="submit"  id="log_st" value="我要登录" class="sub"/></td>
    </tr>
</table>
<span id="status"></span>




</form>