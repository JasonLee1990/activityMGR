//申报



function sp11(){ 
if(document.sp.title.value=="请填写活动形式"){
	document.sp.title.value="";document.getElementById("title").className="777";return false;}
		  else {return true;}	  
}

function sp41(){ 
if(document.sp.title2.value=="请填写活动名称"){
	document.sp.title2.value="";document.getElementById("title2").className="777";return false;}
		  else {return true;}	  
}

function sp51(){ 
if(document.sp.title3.value=="请填写参加该活动的情况，如参与、获奖等"){
	document.sp.title3.value="";document.getElementById("title3").className="777";return false;}
		  else {return true;}	  
}


function sp21(){ 

if(document.sp.nots.value=="请注明：活动时间、地点（证明人）、并附上您的姓名"){
	document.sp.nots.value="";document.getElementById("nots").className="777";return false;}
		  else {return true;}	  
}

function sp31(){ 

if(document.sp.mark.value=="输入1-100间的恰当分数"){
	document.sp.mark.value="";document.getElementById("mark").className="mark";return false;}
		  else {return true;}	  
}




function checksp(){
	
if(!sp11()){
	 document.sp.title.focus();return false;}
	 
else if(!sp41()){
	document.sp.title2.focus();return false;}
else if(!sp51()){
	document.sp.title3.focus();return false;}
else if(!sp21()){
	document.sp.nots.focus();return false;}
	
else if(!sp31()){
	document.sp.mark.focus();return false;}
	  else return true;	  
}



function spnc() {
    var f = document.sp;
        if(f.type.value!=""){
			
			if(f.type.value=="思想政治与道德修养"){document.getElementById("nc").innerHTML = "思政！！";}
			else if(f.type.value=="社会实践与志愿服务"){document.getElementById("nc").innerHTML = "社会实践与志愿服务！！";}
			else if(f.type.value=="科技学术与创新创业"){document.getElementById("nc").innerHTML = "社会实践与志愿服务！！";}
			else if(f.type.value=="文化艺术与身心发展"){document.getElementById("nc").innerHTML = "与>社会实！！";}
			else if(f.type.value=="社团活动与社会工作"){document.getElementById("nc").innerHTML = "社！！";}
			else if(f.type.value=="技能培训及其它"){document.getElementById("nc").innerHTML = "ti务！！";}

					 }
					 
    else {document.getElementById("nc").innerHTML = "*请输入";
          //document.getElementById("nc").className="f6";
		  }
}










//修改申报

function up1(){ 

if(document.up.uptitle.value==""){
	document.up.uptitle.value="规范书写：活动名（+奖项）";
	document.getElementById("uptitle").className="ccc";}
}
function up11(){ 
if(document.up.uptitle.value=="规范书写：活动名（+奖项）"){
	document.up.uptitle.value="";document.getElementById("uptitle").className="777";return false;}
		  else {return true;}	  
}

function up2(){ 

if(document.up.upnots.value==""){
	document.up.upnots.value="请注明：活动时间、地点（、证明人）";
	document.getElementById("upnots").className="ccc";}
		
}
function up21(){ 

if(document.up.upnots.value=="请注明：活动时间、地点（、证明人）"){
	document.up.upnots.value="";document.getElementById("upnots").className="777";return false;}
		  else {return true;}	  
}

function up3(){ 

if(document.up.upmark.value==""){
	document.up.upmark.value="输入1-100间的数字";
	document.getElementById("upmark").className="ccc";}
		
}
function up31(){ 

if(document.up.upmark.value=="输入1-100间的数字"){
	document.up.upmark.value="";document.getElementById("upmark").className="mark";return false;}
		  else {return true;}	  
}



function checkup(){
	
if(!up11()){
	 document.up.uptitle.focus();return false;}
	 

else if(!up31()){
	document.up.upnots.focus();return false;}
else if(!up41()){
	document.up.upnots.focus();return false;}
else if(!up51()){
	document.up.upnots.focus();return false;}

else if(!up21()){
	document.up.upnots.focus();return false;}	
else if(!up31()){
	document.up.upmark.focus();return false;}
	  else return true;	  
}



function nc() {
    var f = document.up;
        if(f.uptype.upvalue!=""){
			
			if(f.uptype.value=="思想政治与道德修养"){document.getElementById("upnc").innerHTML = "思政！！";}
			else if(f.uptype.value=="社会实践与志愿服务"){document.getElementById("upnc").innerHTML = "社会实践与志愿服务！！";}
			else if(f.uptype.value=="科技学术与创新创业"){document.getElementById("upnc").innerHTML = "社会实践与志愿服务！！";}
			else if(f.uptype.value=="文化艺术与身心发展"){document.getElementById("upnc").innerHTML = "与>社会实！！";}
			else if(f.uptype.value=="社团活动与社会工作"){document.getElementById("upnc").innerHTML = "社！！";}
			else if(f.uptype.value=="技能培训及其它"){document.getElementById("upnc").innerHTML = "ti务！！";}

					 }
					 
    else {document.getElementById("upnc").innerHTML = "*请输入";
          //document.getElementById("nc").className="f6";
		  }
}

