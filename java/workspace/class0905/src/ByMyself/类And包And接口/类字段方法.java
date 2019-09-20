package ByMyself.类And包And接口;

public class 类字段方法 {
//    void sayHello1(){
//        String name="123";
//        System.out.println("Hello!My name is"+name);
//    }
//    void sayHello2(){
//        String name="123";
//        System.out.println("Hello!My name is"+this.name);
//    }
//

//    static public class Person{
//        String name;
//        int age;
//        void sayHello(){
//            System.out.println("hello !My name is"+name);
//        }
//    }
//    static public void main(String[] args)
//    {
//        Person p = new Person();
//        System.out.println(p.name);
//        p.sayHello();
//    }
}
/*
类是组成Java程序的基本要素
是一类对象的原型
它封装了一类对象的状态和方法
    它将变量与函数封装到一个类中

字段（file）是类的属性，是用来变量来表示的
    字段又称为域、属性、成员变量等
方法（method）是类的功能和操作，是用函数来表示的

构造方法
* 构造方法（constructor）是一种特殊的方法
* 用来初始化（new）该类的一个新的对象
* 构造方法和类同名，而且不写返回数据类型
    Person(String n,int a){
        name = n;
        age = a;
    }

方法重载（overload）
* 方法重载（overload）:多个方法有相同的名字，编译时你能够识别来
* 这些方法的名字（signature）不同，或者是参数个数不同，或者是类型不同
* 通过方法重载可以实现多态

this的使用
在方法及构造方法中，使用this来访问字段及方法
    this解决局部变量（方法中的变量）或者参数变量与域变量同名的问题
    在构造方法中，经常这样用：
    Person(int age,String name){
        this.age=age;
        this.name=name;
        //this.age表示域变量而age表示参数变量
    在构造方法中，可以用this调用另一构造方法
    Person(){
        this(0,"");
        .....
    }
    }
 */