
var actRID;
function setTab(name,cursel,n){
for(i=1;i<=n;i++){
var menu=document.getElementById(name+i);
var con=document.getElementById("con_"+name+"_"+i);
menu.className=i==cursel?"hover":"";
con.style.display=i==cursel?"block":"none";}
}



 function showPW(){
  document.getElementById("pwDiv").style.display = "block" ;
  document.getElementById("overDiv").style.display = "block" ;
 }
 function closeDiv(){
  document.getElementById("pwDiv").style.display = "none" ;
  document.getElementById("overDiv").style.display = "none" ;
 }
 
 
 


 function showup(id){
	actRID=id;
	setID();
  document.getElementById("overDiv").style.display = "block" ;
  document.getElementById("upDiv").style.display = "block" ;
 }
 
 function closeupDiv(){
  document.getElementById("overDiv").style.display = "none" ;
  document.getElementById("upDiv").style.display = "none" ;
 }







function menus(str){
var obj, pic;
// 返回 str 对象和 picId 对象是否存在
if (document.getElementByIdx(str)){
obj=document.getElementByIdx(str); //obj 为 DIV 对象
  //pic 为 图片对象

if (obj.style.display == "none"){ //如果DIV对象的 display 样式值为 none 的话
obj.style.display = ""; //就将 display 的样式清空
//pic.src = "0001.gif"; //更改图片对象的路径
}else{
obj.style.display = "none";
//pic.src = "0000.gif";
}
}
}
 function   change(obj)  
  {  
  var   objs=document.getElementsByName(obj.name);  
   
   //如果取消选中某个子,则其父也取消选中
   for(var   i=0;   i<objs.length;   i++)  
  {  
  if(!obj.checked&&obj.id.substr(0,objs[i].id.length)==objs[i].id)
    objs[i].checked=false;  
  }
  //如果选中子,刚其父也被选中
 // for(var   i=0;   i<objs.length;   i++)  
 // {  
 // if(obj.checked&&obj.id.substr(0,objs[i].id.length)==objs[i].id)
 //   objs[i].checked=true;  
 // }  
  //如果选中父,则所有子都被选中
  for(var   i=0;   i<objs.length;   i++)  
  {  
  if(objs[i].id.substr(0,obj.id.length)==obj.id)
    objs[i].checked=obj.checked;  
  }  
  return   true;  
  } 





function pw0(){ 
if(document.pw.password.value==""||document.pw.password.value==null){
					 document.getElementById("p0").innerHTML = "不能为空.";              return false;}
			else{document.getElementById("p0").innerHTML = ""; return true;}
}
function pw1(){ 
if(document.pw.password.value!=document.pw.password2.value){
					 document.getElementById("p1").innerHTML = "两次输入不一致.";return false;}
			else{document.getElementById("p1").innerHTML = ""; return true;}
}
function pw2(){ 
if(document.pw.npassword.value.length>=6){ document.getElementById("p2").innerHTML = ""; return true;}
			else{    
					 document.getElementById("p2").innerHTML = "长度为6位以上.";return false;}
}
function pw3(){ 
if(document.pw.npassword.value!=document.pw.npassword2.value){
					 document.getElementById("p3").innerHTML = "两次输入不一致.";return false;}
			else{document.getElementById("p3").innerHTML = ""; return true;}

}

function checkpw(){
	
    if(!pw0()){
		document.pw.password.focus();return false;
		}
	else if(!pw1()){
		document.pw.password2.focus();return false;
		}
	else if(!pw2()){
		document.pw.npassword.focus();return false;
		}
	else if(!pw3()){
		document.pw.npassword2.focus();return false;
		}
	else{ return true;}
	
	
          //document.getElementById("nc").className="f6";	 
}