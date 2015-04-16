<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>



<div class="div2">
    <ul>
         <s:iterator value="falseResults" >
     <form action="#" method="post">
    <script>
        function setAgree(id){
           var url = "json/adminOpAction_adminVerify.do?actRId="+id;
           new Ajax.Request(url,{method: 'post',onComplete: getResult});
        }
        function getResult(originalRequest){
            document.getElementById("result").innerHTML=
                                                       originalRequest.responseText.parseJSON().jsonResult;
        }
     </script>
    <li>
<table border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="150" style="border-top:#CCC 1px dashed">
    <!-- 在表单中定义隐藏属性，传递活动记录ID值到AdminOpreationAction中 -->
 学号：<s:property value="stuId"/><br>
  <s:property value="actRtime"/><br>
   <s:property value="actRtype"/></td>
    <td  width="250" align="left" valign="middle">
    
    <a href="#"><s:property value="actRname"/><span>
         活动形式是<s:property value="actRformat"/>  <br>
        该生参加该活动的情况：<s:property value="actRstatus"/><br> 
        对该活动的申报回复/备注: <br><s:property value="actRmark"/><br>
<input name="按钮"  type="button" class="sub"  value="同意申报" onclick="setAgree(${actRid})"/>
<input name="按钮"  type="button" class="sub" onclick="showup(${actRid})"  value="驳回申报" /></span>
</a>

</td>

    <td width="70" align="center" class="min_mark">应得<s:property value="actRpoint"/>分</td>
    <td width="70" class="hg_f10">[<span id="result"></span>]</td>
  </tr>
</table>
  </li>
    </form>
          </s:iterator>
                   </ul>
          </div>
          
		