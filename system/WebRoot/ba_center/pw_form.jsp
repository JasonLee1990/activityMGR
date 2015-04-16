<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>


 <form name="pw" id="pw" method="post" action="stuOpAction_updatePW.do" onSubmit="if(!checkpw()) return false;">
<table width="331" height="223" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="66" colspan="2" align="center"><input  type="submit" onclick="closeDiv()"  value="关闭" class="sub"/></td>
    </tr>
  <tr>
    <td width="98" align="right">旧密码：</td>
    <td width="233" height="25" align="left" valign="top"><input name="" type="password" id="password" onblur="pw0()" /> <span id="p0"></span></td>
    </tr>
  <tr>
    <td align="right">重复旧密码：</td>
    <td height="19" align="left" valign="middle"><input name="passwordDTO.pastPassword" type="password" id="password2" onblur="pw1()" /> <span id="p1"></span></td>
    </tr>
  <tr>
    <td height="22" colspan="2" align="left"><hr  style=" width:50px; border-top: dashed #999 1px" /></td>
    </tr>
  <tr>
    <td align="right">新密码：</td>
    <td height="26" align="left" valign="top"><input name="npassword" type="password" id="npassword"  onblur="pw2()" maxlength="18" /> <span id="p2"></span></td>
    </tr>
  <tr>
    <td align="right">重复新密码：</td>
    <td height="19" align="left" valign="middle"><input name="passwordDTO.newPassword" type="password" id="npassword2" onblur="pw3()" /> <span id="p3"></span></td>
    </tr>
  <tr>
    <td align="right">&nbsp;</td>
    <td height="43" align="center" valign="middle"><input name="log_st" type="submit"  id="log_st" value="提交修改" class="sub"/></td>
    </tr>

</table>
<span id="result"></span>
 </form>



