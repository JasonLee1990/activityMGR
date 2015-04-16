<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<link href="../style.css" rel="stylesheet" type="text/css" />
<table width="226" border="0" align="left" cellpadding="0" cellspacing="0">
  <tr>
    <td width="35" rowspan="3" align="left" valign="top" bgcolor="#FFFFFF"  class="cd">&nbsp;</td>

    <td width="158" align="left" valign="top" bgcolor="#FFFFFF">
         
      
    </td>    <td width="33" height="30" align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td width="158" rowspan="2" align="left" valign="top" bgcolor="#FFFFFF">
      <div class="menu">
        <ul> ${student.name}欢迎登陆
          <form action="stuOpAction_logout.do" method="post">
          <input name="zx" type="submit"  id="zx" value="注销" class="sub1"/>
          </form>
          
        </ul>
        <ul>
          综合素质总分<span>${student.point}</span>
        </ul>
        <ul>
          <a href="#">  思想政治与道德修养 
          <jsp:include page="../st_center/one.jsp"></jsp:include>   </a>
        </ul>
        <ul>
          <a href="#">  社会实践与志愿服务
          <jsp:include page="../st_center/two.jsp"></jsp:include>   </a>
        </ul>
        <ul>
          <a href="#">  科技学术与创新创业
          <jsp:include page="../st_center/three.jsp"></jsp:include>   </a>
        </ul>
        <ul>
          <a href="#">  文化艺术与身心发展
          <jsp:include page="../st_center/four.jsp"></jsp:include>   </a>
        </ul>
        <ul>
          <a href="#">  社团活动与社会工作
          <jsp:include page="../st_center/five.jsp"></jsp:include>  </a>
          </ul>
        <ul>
          <a href="#"> 技能培训及其它
          <jsp:include page="../st_center/six.jsp"></jsp:include>   </a>
        </ul>
        
      </div>
      
 
      
    </td>
    <td height="110" align="left" valign="top">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="top">
    <a class='button' onclick="setTab('one',1,5)">我要申报</a>
    <a class='button'  onclick="showPW()">修改密码</a>  
    <a class='button' onclick="">新闻浏览</a></td>
  </tr>
</table>

      