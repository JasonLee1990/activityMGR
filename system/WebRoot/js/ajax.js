/*页面载入。创建xmlhttp异步传输对象*/
function createXMLHttpRequest(){
   if(window.ActiveXObject)
      {
     xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
     }
   else
   {
      if(window.XMLHttpRequest)
      {
       xmlHttp = new XMLHttpRequest();
      }
  }
}
//获取网页中的元素
function $(id){
	return document.getElementById(id);
}
//检测用户名
function checklogin(){
	createXMLHttpRequest();
	var id=$("stuId").value;
	var pass=$("stuPassword").value;
	if(id==null||id==""){
		$("status1").innerHTML='<img src="ajaximge/error.png" width="12" height="12"><span class="f2">请键入您的学号</span>';
		 return false;
	}else{
		if(pass=null||pass==""){
			$("status2").innerHTML='<img src="ajaximge/error.png" width="12" height="12"><span class="f2">请键入您的密码</span>';
			return false;
		}
		   if(id&&pass){
		var url="CheckMailAction?ID="+id+"&&passWord="+pass;
	//准备对服务器发出请求，第三个参数为是否异步
	  xmlHttp.open("GET", url, true);
	//当服务器状态改变，update方法跟踪处理
	   xmlHttp.onreadystatechange=update;
	//发出请求
	   xmlHttp.send(null);
		   }
		   else{
			
	$("status3").innerHTML='<img src="ajaximge/error.png" width="12" height="12"><span class="f2">输入信息不完整</span>';	
	return false;
		}
		
		
	}
	
}
	//根据服务器传回结果，决定客户端页面的显示
	
	
	function update(){
		if(xmlHttp.readyState!=4){
			$("status3").innerHTML='<span class="f1">登录中····</span>';
		}else{//完成请求的情况
			var response=xmlHttp.responseText;
			if(response=="NO"){
				//若在Servlet中检测到重复,则返回结果不为空
				$("status3").innerHTML='<img src="imge/error.png" width="12" height="12"><span class="f2">登录不成功，请检查用户名或密码</span>';
				return false;	//光标定位在mail输入框，等待用户重新输入
			}else{
				return true;
					
			}
		}
	}