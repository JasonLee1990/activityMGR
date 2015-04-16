<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<script type="text/javascript" src="../js/js.js"></script>

<script type="text/javascript">
function ad1(){ 

if(document.ad.username.value=="输入管理员ID"){ 
document.ad.username.value="";return false;}
else return true;
}
function ad2(){ 

if(document.ad.username.value==""){document.ad.username.value="输入管理员ID";
     return false;}else return true;	  

}

function checkad(){
	
if(!ad1()){document.ad.username.value="";
                 document.ad.username.focus();return false;}
else if(document.ad.password.value==""){document.ad.password.focus();return false;}
else return true;	  
}

</script>
 <form name="ad" id="ad" method="post" action="adminAction_adminLogin.do" onSubmit="if(!checkad()) return false;">
<table width="200" height="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="20" rowspan="4">&nbsp;</td>
    <td width="168" align="right">后台登录</td>
    <td width="12" rowspan="4"></td>

  </tr>
  <tr>
    <td height="16" align="center" valign="top"><input name="loginDTO.userId" type="text" id="username" value="输入管理员ID"  onfocus="if(this.value=='输入管理员ID'){this.value='';}"  onblur="if(this.value==''){this.value='输入管理员ID';}"></td>
    </tr>
  <tr>
    <td align="center" valign="middle"><input name="loginDTO.password" type="password" id="password" value=""/></td>
    </tr>
  <tr>
    <td align="center" valign="top"><input name="log_st" type="submit"  id="log_st" value="快速登录" class="sub"/></td>
    </tr>
</table>
<span id="status"></span>




</form>