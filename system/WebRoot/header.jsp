<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"/>

<head>

<title>综合素质拓展系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="Text/html;charset=utf-8" %>

</head>
<body bgcolor="#f2f2f2">
<style>
*
{
margin: 0px;
padding: 0px;
}
.topNavWrapper {
width: 100%;
text-align: center;
height: 89px;
margin: 0px auto;
z-index:1;
background:url(imge/main.png) no-repeat center center;
_position: relative ;
_top:0px;
}
#topNav {
width: 100%;
display: block;
z-index: 2;
overflow: visible;
position: fixed;
top: 0px; /* position fixed for IE6 */
_position: absolute;
_top: expression(documentElement.scrollTop + "px");
background:url(imge/t0.png) repeat;
height: 89px;
}
#info {
width: 100%;
float: center;
display: block;
z-index: 2;
overflow: visible;
position: fixed;
top:128px;/* position fixed for IE6 */
_position: absolute;
_top: expression(documentElement.scrollTop + "px");_right: expression(documentElement.scrollTop + "px");
height: 89px;
color:#fff;
}

#TopTipHolder{height:0;overflow:hidden;position:relative}
#TopTip{height:35px;line-height:35px;text-align:center;background:#FC0}
.TopTipClose{width:45px;height:16px;background:#fff;position:absolute;right:10px;top:10px}

</style>
<div class="topNavWrapper">
<ul class="jd_menu"  id="topNav">
<img src="imge/main.png"/>
</ul>
</div>


<div id="TopTipHolder"><div id="TopTip">
      大学生综合素质拓展系统 College Students' comprehensive quality development system .<span>

<jsp:include page="sm.jsp"></jsp:include>
</span></div>
<div id="TopTipClose" class="TopTipClose" title="关闭" align="center">关闭</div>

</div>


<script>
/* 
 * 页面顶部提示栏效果(TopTipEffect)
 *  
 * author: 爱微网
 * version: 1.0.0
 * @param {string}    id           tip提示标签id
 * @param {string}    holderId     父标签
 * @param {bool}      expand       展开/收起
 * @param {string}    step         每次移动步长
 * @param {object}    speed        移动速度
 */
var TopTipEffect = function(id, holderId, expand, step, speed){
    this.obj = document.getElementById(id);
    this.holder = document.getElementById(holderId);
    this.step = step;
    this.speed = speed;
    this.expand = expand;
    this.maxH = this.obj.offsetHeight;
    this.moveT = null;
    this.moving = false;
    this.tempH = expand ? 0 : this.maxH;
}
TopTipEffect.prototype = {
    play : function(){
        if(this.moving) return;
        if(this.holder.offsetHeight > this.maxH) return;
        var _this = this;
        this.moveT = setInterval(function(){_this.move()}, _this.speed);
    },
    move : function(){
        this.moving = true;
        if(this.expand){
            this.tempH += this.step;
            if(this.tempH > this.maxH){
                if((this.tempH - this.maxH) >= this.step){
                    this.expand = false;
                    this.moving = false;
                    clearInterval(this.moveT);
                    return;
                }else{
                    this.tempH = this.maxH;
                }
            }
        }else{
            this.tempH -= this.step;
            if(this.tempH < 0){
                if(-this.tempH >= this.step){
                    this.expand = true;
                    this.moving = false;
                    clearInterval(this.moveT);
                    return;
                }else{
                    this.tempH = 0;
                }
            }
        }
        this.holder.style.height = this.tempH + "px";
        this.holder.scrollTop = this.maxH - this.tempH;
    }
}
var mytip = new TopTipEffect("TopTip", "TopTipHolder", true, 1, 10);
mytip.play();
//右上角关闭按钮点击
document.getElementById("TopTipClose").onclick = function(){
    mytip.play();
}
</script>

</body>

