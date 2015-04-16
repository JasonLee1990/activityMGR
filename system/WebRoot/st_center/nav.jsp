<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<link href="../st_center/st.css" rel="stylesheet" type="text/css" />


   <div class="Tab">
        <div class="Menubox" >
          <ul >
            
            <li id="one1"  onclick="setTab('one',1,5)">我要申报</li>
            <li id="one2"  onclick="setTab('one',2,5)"  class="hover">未审核申报</li>
            <li id="one3"  onclick="setTab('one',3,5)">已通过申报</li>
            
          </ul>
        </div>
        <div class="Contentbox">
          <div id="con_one_1" style="display:none">
          
               <jsp:include page="form.jsp"></jsp:include>

          </div>

          <div align="left" id="con_one_2">   
            
                 <jsp:include page="st_false.jsp"></jsp:include> 
            
         </div>

          
          <div id="con_one_3" align="left" style="display:none">
          
                  <jsp:include page="st_true.jsp"></jsp:include>             
  
         </div>
      </div>
</div>

