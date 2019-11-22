### 第二章JavaScript基础语法
#### 语法特点
* 弱类型：变量的数据类型可以任意转换
* 动态类型：变量声明创建时不用指定数据类型

#### javascript输出内容的三种方式
* document.write() 页面输出内容
* console,log()  控制台输出
* alert()  弹出框输出

#### JavaScript原始数据类型
* 五种原始数据类型：Number String Boolean Undefined Null(判断变量在某一时刻数据类型是，使用typeof运算符)
#### 比较运算符
* == 值相等则为true
* === 类型和值都需相等则为true

##### 强制转换成Number类型
* parseInt()  parseFloat()  Number()
##### 强制转换成String（）类型
* String()

### 函数与事件处理
#### 使用函数注意事项
* 函数名必须是合法的标识符
* 最好每个函数只能实现一种功能

##### 定义函数
        function 自定义函数名(参数1，参数2，...){
            函数体;
            return 返回值;
        }

        注意：
            1、实参数量少于形参
            缺失的形参会被赋予unde
            
### 第四章 字符串和数组
##### 字符串属性
* 获得字符串的长度
** 通过字符串的length 属性获得

#### javascript中的对象
* 宿主对象
** 由javascript解析器所镶嵌入的宿主环境定义的（window,document,event）
* 内置对象
** 由ECMAScript规范定义的对象或构造器对象（Array,String）
* 自定义对象
** 用户自定义就javaScript代码创建的对象（dog,movie）

##### Math对象
        var a=1.4;
        var b=1.6;
        //四舍五如
        console.log(Math.round(a));//1
        console.log(Math.round(b));//2
        //向下取整
        console.log(Math.floor(a));//1
        console.log(Math.floor(b));//1
        //向上取整
        console.log(Math.ceil(a));//2
        console.log(Math.ceil(b));//2
        //随机生成0~1随机数
        console.log(Math.random());
        //最大值：Math.max()   最小值：Math.min()


##### Date 对象包含了一系列的日期时间处理的功能
* 创建 Date 对象，例:  var now = new Date( );
###### 常用操作
* 获取当前日期时间:  toLocaleString( )
* 获取年份、月份、日期:  getFullYear()、 getMonth()、getDate()
* 获取小时、分钟、秒钟:   getHours()、 getMinutes()、 getSeconds()
        var nowTime=new Date();
        console.log("请输出当前时间"+nowTime.toDateString());
        console.log("请输出当前年："+nowTime.getFullYear());
        console.log("请输出当前月份："+(nowTime.getMonth()+1));
        console.log("请输出当前日期："+nowTime.getDate());
        console.log("请输出当前时间"+nowTime.getHours()+":"+nowTime.getMinutes()+":"+nowTime.getSeconds());
        console.log("请输出当前是周几："+(nowTime.getDay()));


#### BOM概述（Browser Object Model）
* Browser Object:浏览器提供的用户与浏览器窗口之间交互对象及操作的接口
* Model:这些对象兵不是独立存在的，对象与对象之间存在着层次关系，对象模型的作用就是描述这些层次的关系

##### 对话框
* 警告框——————alert();
* 确认窗口——————confirm();
* 输入框——————prompt();

##### 延迟执行
        /*
             延迟执行 ----- setTimeout( )
             只执行一次
             setTimeout( code,interval )
             code 为要延迟执行的 JavaScript 代码；
             interval 为延迟执行的间隔时间，单位为毫秒
             取消延迟执行  clearTimeout( )
             clearTimeout( id )
             id 是 setTimeout( ) 方法返回的数字
        */
        var cnt;
        var btn1=document.getElementById("btn1");
        var btn2=document.getElementById("btn2");
        btn1.onclick=function () {
            cnt=setTimeout(function () {
                alert("我相信~");
            },4000);
        };
        btn2.onclick=function () {
            clearTimeout(cnt);
        }
##### 周期执行
    <body>
        <p id="count">0</p>
        <button id="start">开始计数</button>
        <button id="stop">结束计时</button>
    </body>
    <script>
        var count=document.getElementById("count");
        var start=document.getElementById("start");
        var stop=document.getElementById("stop");
    
        var intervalId=0;
        var countNum=0;
        start.onclick=function () {
            intervalId=setInterval(function () {
                countNum+=1;
                count.innerHTML=countNum;
            },1000)
        };
        stop.onclick=function () {
            clearInterval(intervalId);
        }
    </script>
    </html>
        /*
            周期执行 ----- setInterval( )
             重复执行，直到 clearInterval( ) 被调用或窗口被关闭
             setInterval( code,interval )
             code 为要周期执行的 JavaScript 代码；
             interval 为周期执行的间隔时间，单位为毫秒
             取消周期执行 clearInterval( )
             clearInterval( id )
             id 是 setInterval( ) 方法返回的数字
        */
##### history对象
* history对象可以访问浏览器窗口的浏览历史
* history.back();//后退到上一个访问过的页面
* history.forward();//前进到下一个访问过的页面
* history.go(n);//跳转到某个访问过的页面

##### location对象
* 可以修改location对象的属性加载另一个文档
* location.host   主机名和端口
* location.hostname 主机名
* location.href     当前页面的URL
* location.port     端口名
* location.reload   重新加载当前页面
* location.hash     设置或返回URL的金苗部分
* location.search   设置或返回当前 URL 的查询部分（问号 ? 之后的部分）
##### navigator对象
* navigator.appName  浏览器名称
* navigator.appVersion 浏览器版本和运行平台
* navigator.onLine  是否在线（非脱机）
* navigator.platform 浏览器运行平台
* navigator.userAgent HTTP 用户代理请求头的字符串

##### screen对象
* screen 对象包含客户端显示器屏幕的相关信息
* screen.height 屏幕的垂直分辨率，单位：像素
* screen.width 屏幕的水平分辨率，单位：像素
* screen.availHeight 可用屏幕高度
* screen.availWidth 可用屏幕宽度

###### 小结
 BOM：（Browser Object  Model）
 浏览器提供的用户与浏览器窗口之间交互的对象及操作接口的集合。
 BOM 没有统一标准，在使用时需要注意对不同浏览器的支持。











