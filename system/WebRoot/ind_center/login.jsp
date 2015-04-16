<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>

<script type="text/javascript">
function $(obj){
return document.getElementById(obj);
}
function change(n){
for (var i=1;i<4;i++){
if(n==i){
$("a"+i).style.zIndex="100";
}else{
$("a"+i).style.zIndex="0";
}
}
}
</script>
<div style=" color:#999">

<div id="a1" style="position:absolute;right:19%;top:140px;width:200px;height:100px; background:url(imge/ind2.png) #ddeeff;z-index:1" onclick="change('1')" >

<jsp:include page="log_ad.jsp"></jsp:include>

</div>
<div id="a2" style="position:absolute;right:17%;top:160px;width:200px;height:100px; background:url(imge/ind2.png) #eeffdd;z-index:2" onclick="change('2')">

<jsp:include page="log_st.jsp"></jsp:include>

</div>
<div id="a3" style="position:absolute;right:15%;top:180px;width:200px;height:100px; background:url(imge/ind.png) #ffddee;z-index:3" onclick="change('3')"></div>
</div>