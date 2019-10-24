import java.sql.SQLClientInfoException;
import java.util.Arrays;

//12班
public class Demo1 {
	
//	public static void fun(int[] arr){
//		
//	}
//
//	public static int add(int a, int b) {
//		return a + b;
//	}
//
//	public static int add(int a, int b, int c) {
//		return a + b + c;
//	}
	
	public static void searchStudent(Student[] arrs, String name){
		for (int i = 0; i < arrs.length; i++) {
			if (arrs[0].getName().equals(name)) {
				
			}
		}
	}

	public static void main(String[] args) {
//		Animal a = new Animal();

		
		
		
		
		
		
//		//重写：在派生类中重写基类继承下来的方法。要求方法原型完全相同。
//		Student s = new Student();
//		s.print();
//		
//		CollegeStudent c = new CollegeStudent();
//		c.print();
//		
//		Student s0 = new CollegeStudent();  //向上转型.理解很重要，多态的大前提。
//		//1、可以调用基类继承下来的方法。
//		s0.setName("lisi");
//		s0.getName();
//		//2、不能调用派生类新增的方法。
//		//s0.getMajor();
//		
//		//3、派生类中重写的方法，可以调用
//		s0.print();
		
		
		
		
		
		
		
		
		
		
//		Student s1 = new Student();
//		s1 = new Student();
//		s1.setNo("2018001"); //Student::setNo(s1,"2018001");
//		s1.setName("zhangsan");
		
//		Student s2 = new Student();
//		s2.set(s1);
		
//		s2.setNo(s1.getNo());
//		s2.setName(s1.getName());
		
		
		//访问权限相关知识：public，private
		//类内：类的定义内部，准确来说应该类的所有成员方法内部。
		//类外：类的外部。
		//				类内					类外
		//public	可以，对象名.成员		可以，对象名.成员	
		//private	可以，对象名.成员		不可以被直接访问，对象名.公开方法()
		
		
		
		
		
		
		
//		Student[] arr = new Student[3];  //这行代码只分配了arr的内存
//		Student s = new Student(); //这行代码分配了arr[0]的内存
//		arr[0] = new Student();
////		arr[0].no = "2018001";
//		arr[0].setNo("2018001");  //arr   arr[0]    
////		arr[0].name = "zhangsan";
//		arr[0].setName("zhangsan");
//		
//		arr[0].print();
		
		
		
		
		
		
		
		
		
		
		
		

		// TODO Auto-generated method stub
		// int a = 10;
		// int b = 20;
		// int c = a + b;
		// int d = a * b;
		// double e = 1.0 * a / b;
		// System.out.println(c);
		// System.out.println(d);
		// System.out.println(e);

		// Scanner sa = new Scanner(System.in);
		// int a = sa.nextInt();
		// String str = sa.next();
		// int b = sa.nextInt();
		//
		// System.out.println(a + "+" + b + "=" + (a + b));
		//
		// switch (str) {
		// case "+":
		//
		// break;
		// case "-":
		//
		// break;
		//
		//
		// default:
		// break;
		// }

		// for(int i = 0; i < 10; i++){
		// System.out.println(i);
		// }

		// 基本数据类型和引用数据类型的区别
		// 1、基本数据类型不包含其他对象及方法。引用数据类型包含其他属性和方法。
		// 2、基本数据类型直接操作变量。引用数据类型的操作一般都会用到包含的方法。
		// 3、变量比较：基本数据类型比值。引用数据类型：默认比较的不是值，而是地址。

		// int a = 10;
		// int b = 10;
		// System.out.println(a == b);
		//
		//
		// int[] arr1 = null;
		// arr1[0] = 10;

	}

}
