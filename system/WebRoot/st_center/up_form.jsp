<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<link href="../style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../st_center/form.js"></script>


 <form name="up" id="up" method="post" action="Navigation" onSubmit="if(!checkup()) return false;">
<table width="487" height="365" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="115" height="111">&nbsp;</td>
    <td align="left">综合素质拓展申报表</td>
    <td align="right"> <input  type="submit" onclick="closeDiv()"  value="关闭" class="sub"/></td>
    <td width="5" rowspan="6"></td>

  </tr>
  <tr>
    <td width="115" align="right">申报类型：</td>
    <td width="257" height="16" align="left" valign="top"><select name="uptype" id="uptype"
onchange="redirect(this.options.selectedIndex)" onblur="nc()" >
      <option  value="思想政治与道德修养" selected="selected">思想政治与道德修养</option>
      <option  value="社会实践与志愿服务">社会实践与志愿服务</option>
      <option  value="科技学术与创新创业">科技学术与创新创业</option>
      <option  value="文化艺术与身心发展">文化艺术与身心发展</option>
      <option  value="社团活动与社会工作">社团活动与社会工作</option>
      <option  value="技能培训及其它">技能培训及其它</option>

    </select></td>
    <td width="110" align="right" valign="top">&nbsp;</td>
    </tr>
  <tr>
    <td width="115" align="right">活动名称：</td>
    <td height="34" colspan="2" align="left" valign="middle"><input name="uptitle" type="text" class="ccc" id="uptitle"  onblur="up1()" onclick="up11()" value="规范书写：活动名（+奖项）" size="45" /></td>
    </tr>
  <tr>
    <td align="right" valign="top">备注：</td>
    <td height="43" colspan="2" rowspan="2" align="left" valign="middle"><textarea name="upnots" cols="50" rows="6" class="ccc" id="upnots" onblur="up2()" onclick="up21()">请注明：活动时间、地点（、证明人）</textarea></td>
    </tr>
  <tr>
    <td align="center" valign="bottom">&nbsp;</td>
  </tr>
  <tr>
    <td align="right">&nbsp;</td>
    <td height="43" colspan="2" align="center" valign="middle"> 申报分数：
      <input  name="upmark" type="text" class="ccc" id="upmark" style=" height:30px; width:100px" onkeyup="value=value.replace(/[^\d]/g,'')" value="输入1-100间的数字" maxlength="3" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,'')" onblur="up3()" onclick="up31()" />
      <input name="log_st" type="submit"  id="up" value="提交申报" class="sub"/></td>
    </tr>
  <tr>
    <td height="75" colspan="4" align="left" valign="top" style=" border-top: dashed #999 1px">
    申报须知：<br>
    
        &nbsp;&nbsp;&nbsp;&nbsp;
        <span id="upnc"></span>
     </td>
    </tr>
</table>

 </form>




