<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<link href="../style.css" rel="stylesheet" type="text/css" />
  <span class="mark">${student.jnqt}</span>
  <s:iterator value="list6">
  <li><s:property value="actRname"/><span><s:property value="actRpoint"/><span>
  </li>
  </s:iterator>

