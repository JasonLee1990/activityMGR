<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<script src="../js/json.js" type="text/javascript"></script>
<script src="../js/prototype.js" type="text/javascript"></script>

<div class="div2">
    <ul>
         <s:iterator value="falseResults" >
         <form action="" method="post" name="f" id="f">     
    <li>
<table border="0" cellspacing="0" cellpadding="0">
  <tr>



    <td width="150"  class="hg_bo1">
  <s:property value="actRtime"/><br><s:property value="actRtype"/>
 </td>
    <td width="250" align="left" valign="bottom">
    
    <a href="#"><s:property value="actRname"/>
    <span>
        活动形式是：<s:property value="actRformat"/> <br>
        您参加该活动的情况 ：<br><s:property value="actRstatus"/><br> 
        对该活动的申报回复/备注: <br><s:property value="actRmark"/><br>
<input name="按钮"  type="button" class="sub"  value="删除申报" onclick="setDelete(${actRid})"/>
<input name="按钮"  type="button" class="sub" onclick="showup()"  value="修改申报" /></span>
</a>

</td>
<td width="60" align="right" class="min_mark">应得<s:property value="actRpoint"/>分</td>
    <td width="140" align="right">目前审核进度<s:property value="actRverify"/>&nbsp;&nbsp;[<i id="resultTag"></i>]</td>
  </tr>
</table>
  </li>
          </form>
          </s:iterator>
          
                   </ul>
          </div>
          
		


       <script>
        function setDelete(id) {
           var url = "json/adminOpAction_delete.do?actRid="+id;
           new Ajax.Request(url,{method: 'post',onComplete: getResult});
        }
        function getResult(originalRequest){
            document.getElementById("resultTag").innerHTML=originalRequest.   responseText.parseJSON().jsonResult;
        }
     </script>