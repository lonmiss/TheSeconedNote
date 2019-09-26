//package ByMyself.类And包And接口;
//
//public class 父类对象的引用强制转换成子类对象 {
//    class Person (String n,int a)
//    {
//        int age=a;
//        String name=n;
//        void sayHello(){
//            System.out.println("My name is"+name+",My sge is"+age);
//
//        }
//    }
//    public static class Student extends Person
//    {
//        String school;
//        int score;
//        void sayHello(Student another){
//            System.out.println("Hi!");
//            if(school==another.school){
//                System.out.println("Schoolmates");
//            }
//        }
//        boolean isGoodStudent()
//        {
//            return score>=90;
//        }
//
//        void textThisSuper()
//        {
//            int a;
//            a=age;
//            a=this.age;
//            a=super.age;//这三个都是用一个a
//        }
//        void sayHello()
//        {
//            super.sayHello();
//            System.out.println("My school is"+school);
//        }
//    }
//    public static void main(String[] args)
//    {
//        Person p=new Person();
//        Student s=new Student();
//        Person p2=new Student();
//        Student s2=(Student)p2;
//
//        Student s3=(Student)p;
//
//        ((Student) p).sayHello(s);
//
//        Person[] manypeople=new Person[100];
//        manypeople[1]=new Person("li",18);
//        manypeople[1]=new Student();
//    }
//}
