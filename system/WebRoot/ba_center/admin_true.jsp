<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="div2">
    <ul>
         <s:iterator value="trueResults">    
    <li>
<table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="100" style="border-top:#CCC 1px dashed">
   学号：<s:property value="stuId"/><br>
  <s:property value="actRtime"/><br>
  <s:property value="actRtype"/>
 </td>
    <td align="left" valign="middle">
    
    <a href="#"><s:property value="actRname"/><span>
        活动形式是<s:property value="actRformat"/><br>
        该生参加该活动的情况：&nbsp;&nbsp;&nbsp;&nbsp;<br>
        对该活动的备注: &nbsp;&nbsp;&nbsp;&nbsp;<s:property value="actRmark"/>
</span></a>

</td>
    <td width="70" align="right" class="min_mark">应得<s:property value="actRpoint"/>分</td>
    <td width="70" ><s:property value="actRstatus"/></td>
  </tr>
</table>
  </li>
         </s:iterator> 
                   </ul>    
         
             
 </div>         


   



