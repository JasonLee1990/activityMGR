<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>



   <div class="Tab">
        <div class="Menubox" >
          <ul >
            
            <li id="one1"  onclick="setTab('one',1,3)">用户管理</li>
            <li id="one2"  onclick="setTab('one',2,3)"  class="hover">未审核申报</li>
            <li id="one3"  onclick="setTab('one',3,3)">已审核记录</li>
            
          </ul>
        </div>
        <div class="Contentbox">
          <div id="con_one_1" style="display:none">
               暂无此功能！

          </div>

          <div align="left" id="con_one_2">   
            
              <jsp:include page="admin_false.jsp"></jsp:include>   
            
         </div>

          
          <div id="con_one_3" style="display:none">
          
      <jsp:include page="admin_true.jsp"></jsp:include>  
         </div>
      </div>
</div>

