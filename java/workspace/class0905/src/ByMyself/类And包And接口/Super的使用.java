package ByMyself.类And包And接口;

public class Super的使用 {

    static public void main(String[] args){

    }
}
/*
1、super使用访问父类的域和方法
    void testThisSuper(){
        int a;
        a=age;
        a=this.age;
        a=super.age;
    }
// 父类Student有一个域age,在子类Student中使用age,this。age
,super.age来访问age是完全一样的
    当然，使用super不能访问在子类中添加的域和方法
    在覆盖父类的方法的同时，又利用好已经定义好的父类的方法
 2、是用父类的构造方法
 构造方法是不能继承的
    比如，父类Person有一个构造访问
 */