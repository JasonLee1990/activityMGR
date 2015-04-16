<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<script type="text/javascript">
function setID(){
    document.getElementById("ID").value=actRID;
}
</script>
 <form name="up" id="up" method="post" action="adminOpAction_fire.do" onSubmit="if(!checkup()) return false;">
<table width="487" height="276" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="74" height="152">&nbsp;</td>
    <td width="142" align="left">驳回 </td>
    <td width="266" align="right">
    <!-- 在表单中定义隐藏属性，传递活动记录ID值到AdminOpreationAction中 -->
      <s:hidden name="reasonDTO.actRid" id="ID"></s:hidden>
    <input name="按钮"  type="button" class="sub" onclick="closeupDiv()"  value="关闭"/></td>
  </tr>
  <tr>
    <td align="right" valign="top">&nbsp;</td>
    <td height="43" colspan="2" align="left" valign="middle"><textarea name="reasonDTO.reason" cols="50" rows="6" class="777" id="re"></textarea></td>
  </tr>
  <tr>
    <td align="right">&nbsp;</td>
    <td height="43" colspan="2" align="center" valign="middle">
    <input name="log_st" type="submit"  id="up" value="确认" class="sub"/></td>
  </tr>

</table>

 </form>



