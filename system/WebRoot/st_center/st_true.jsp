<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<link href="../style.css" rel="stylesheet" type="text/css" />

<div class="div2">
    <ul>
         <s:iterator value="trueResults">    
    <li>
<table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="150" class="hg_bo1">
   <s:property value="actRtime"/><br>
 <s:property value="actRtype"/></td>
    <td align="left"  width="250"  valign="bottom">
    
    <a href="#"><s:property value="actRname"/><span><br>
    活动形式是<s:property value="actRformat"/>
        您参加该活动的情况：&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="actRstatus"/><br>
        对该活动的备注: &nbsp;&nbsp;&nbsp;&nbsp;<s:property value="actRmark"/>
</span></a>
</td>
    <td width="70" align="right" class="min_mark">应得<s:property value="actRpoint"/>分</td>
    <td></td>
  </tr>
</table>
  </li>
         </s:iterator> 
                   </ul>    
         
             
 </div>         


   



