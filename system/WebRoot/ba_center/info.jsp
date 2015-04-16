'<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<table width="226" border="0" align="left" cellpadding="0" cellspacing="0">
  <tr>
    <td width="35" rowspan="3" align="left" valign="top" bgcolor="#FFFFFF"  class="cd">&nbsp;</td>
    <td width="158" align="left" valign="top" bgcolor="#FFFFFF">
      
    </td>    <td width="33" height="30" align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td width="158" rowspan="2" align="left" valign="top" bgcolor="#FFFFFF"  
    style="background:url(imge/ind.jpg) no-repeat bottom left">
    
      <div class="menu">
        <ul>管理员${admin.name},欢迎您 
        <form action="adminOpAction_logout.do" method="post">
          <input name="zx" type="submit"  id="zx" value="注销" class="sub1"/>
          </form>
        </ul>
      </div>
    </td>
    <td height="110" align="left" valign="top">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="top">
         <a class='button' onclick="setTab('one',1,5)">用户管理</a>
         <a class='button'  onclick="showPW()">修改密码</a> 
         <a class='button' onclick="">新闻浏览</a>
    </td>
  </tr>
</table>

