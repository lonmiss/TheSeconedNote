package ByMyself.today1004;

public class Telphone {
    //属性（成员变量）有什么
    float screen;
    float cpu;
    float mem;
    //方法：干什么
    void call(){
        System.out.println("Telephone有打电话的功能");
    }
    void sendMessage()
    {
        System.out.println("screen:"+screen+" cpu:"+cpu+" mem:"+mem+"Telphone有发短信的功能。");
    }
}
