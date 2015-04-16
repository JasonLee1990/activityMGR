<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>

<script type="text/javascript"  src="../st_center/form.js"></script>


 <link href="../style.css" rel="stylesheet" type="text/css" />

<form name="sp" id="sp" method="post" action="../opreation/stuOpAction_actReport.do" onSubmit="if(!checksp()) return false;">
<table width="600" height="318" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="98" height="64">&nbsp;</td>
    <td colspan="2" align="left">综合素质拓展申报表</td>
    <td width="119"></td>

  </tr>
  <tr>
    <td width="98" align="right">申报活动类型：</td>
    <td width="149" height="16" align="left" valign="top"><select name="actReportDTO.actRtype" id="type"
onchange="redirect(this.options.selectedIndex)" onblur="spnc()">
      <option  value="思想政治与道德修养" selected="selected">思想政治与道德修养</option>
      <option  value="社会实践与志愿服务">社会实践与志愿服务</option>
      <option  value="科技学术与创新创业">科技学术与创新创业</option>
      <option  value="文化艺术与身心发展">文化艺术与身心发展</option>
      <option  value="社团活动与社会工作">社团活动与社会工作</option>
      <option  value="技能培训及其它">技能培训及其它</option>

    </select></td>
    <td align="right" valign="top">&nbsp;</td>
    <td width="119"></td>
    </tr>
  <tr>
    <td width="98" align="right">活动形式</td>
    <td height="34" colspan="2" align="left" valign="middle"><input name="actReportDTO.actRformat" type="text" class="ccc"  id="title"  value="请填写活动形式"  onfocus="if(this.value=='请填写活动形式'){this.value='';this.className='777'}"  onblur="if(this.value==''){this.value='请填写活动形式';this.className='ccc';}"/></td>
    <td width="119"></td>
    </tr>
    <tr>
    <td width="98" align="right">活动名称：</td>
    <td height="34" colspan="2" align="left" valign="middle"><input name="actReportDTO.actRname"  id="title2" type="text" class="ccc"  value="请填写活动名称" size="45"  onfocus="if(this.value=='请填写活动名称'){this.value='';this.className='777'}"  onblur="if(this.value==''){this.value='请填写活动名称';;this.className='ccc'}" /></td>
    <td width="119"></td>
    </tr>
    <tr>
    <td width="98" align="right">参加活动情况</td>
    <td height="34" colspan="2" align="left" valign="middle"><input name="actReportDTO.actRstatus"  id="title3" type="text" class="ccc" value="请填写参加该活动的情况，如参与、获奖等" size="45"  onfocus="if(this.value=='请填写参加该活动的情况，如参与、获奖等'){this.value='';this.className='777'}"  onblur="if(this.value==''){this.value='请填写参加该活动的情况，如参与、获奖等';this.className='ccc'}" /></td>
    <td width="119"></td>
    </tr>
    
  <tr>
    <td align="right" valign="top">认真填写备注：</td>
    <td height="43" colspan="2" rowspan="2" align="left" valign="middle"><textarea name="actReportDTO.actRmark" id="nots" cols="50" rows="6" class="ccc"  onfocus="if(this.value=='请注明：活动时间、地点（证明人）、并附上您的姓名'){this.value='';this.className='777'}"  onblur="if(this.value==''){this.value='请注明：活动时间、地点（证明人）、并附上您的姓名';this.className='ccc'}" >请注明：活动时间、地点（证明人）、并附上您的姓名</textarea></td>
    <td rowspan="2"></td>
  </tr>
  <tr>
    <td align="center" valign="bottom">&nbsp;</td>
  </tr>
  <tr>
    <td align="right">&nbsp;</td>
    <td height="43" colspan="2" align="center" valign="middle"> 申报分数：
      <input  name="actReportDTO.actRpoint" id="mark" type="text" class="hg_f10 ccc" style=" height:30px; line-height:30px; width:100px" onkeyup="value=value.replace(/[^\d]/g,'')" value="输入1-100间的恰当分数" maxlength="3" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,'')"
      onfocus="if(this.value=='输入1-100间的恰当分数'){this.value='';this.className='mark'}"  onblur="if(this.value==''){this.value='输入1-100间的恰当分数';this.className='ccc hg_f10'}" />  
      
      <input name="log_st" type="submit"  value="提交申报" class="sub"/></td>
    <td></td>
  </tr>
  <tr>
    <td height="75" colspan="4" align="left" valign="top" style=" border-top: dashed #999 1px">
    申报须知：<br>
    
        &nbsp;&nbsp;&nbsp;&nbsp;
        <span id="nc"></span>
     </td>
    </tr>
</table>

 </form>
