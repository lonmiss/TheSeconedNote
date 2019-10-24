import java.util.Scanner;

//78班
public class Demo {
	
//	public static int add(int d,float e){
//		return a+b;
//	}
//	
//	public static int add(int a,float b){
//		return a+b;
//	}
//	
	
//	public static void fun1(int[] a){
//		a = new int[2];
//		a[0] = 100;
//	}
	
	
	public static void searchStudent(Student[] stus,String name){
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].getName().equals(name)) {
				
			}
		}
	}
	
	
	public static void main(String[] args){
		
		
//		Animal a = new Dog();
//		a.shout();
		
		
//		Student s = new Student();
//		s.print();
//		
//		CollegeStudent c = new CollegeStudent();
//		c.print();
//		
//		//一个派生类的对象可以看做成一个基类对象。
//		Student s0 = new CollegeStudent();  //向上转型
//		//1、基类引用无法调用派生类新增的方法和属性。
////		s0.getMajor();
//		//2、基类引用可以调用派生类重写的方法。动态多态。
//		s0.print();
//		
//		s0.getName();
//		s0.getNo();
		
		
		
		
		
		
		

		
		
		
		
		
//		Student s = new Student();
//		s.print();
//		
//		CollegeStudent c = new CollegeStudent();
//		c.print();


		
		
		
//		Student s = new Student();
//		s.setName("lisi");
//		s.getName();
//		s.setMajor("Math");
//		s.getMajor();
		
		
		
		
		
		//类中成员的访问权限总结：
		//类内：类体内，确切的说，类中所有成员方法的内部。
		//类外：类体外。
		//               类内					类外
		//public	可以，对象.成员名		   可以，对象.成员名	
		//private	可以，对象.成员名		 不可以直接访问，通过公有接口访问
		
//		Student s1 = new Student();
//		s1 = new Student();
//
//		
//		System.out.println(s1.getName());
//		System.out.println(s1.getNo());
//		
//		Student s2 = new Student();
//		

		
		
		
		
//		Student s2 = new Student();
//		s2.set(s1);
//		s2.getName();
//		
//		s1.set(s2);
		
//		s2.setNo(s1.getNo());
//		s2.setName(s1.getName());
		
		
//		Student[] stus = new Student[3];
//		stus[0] = new Student();
//		
//		
//		
//		stus[0].setNo("2018001");
//		System.out.println(stus[0].getNo());
//		
//		stus[1] = new Student();
//		stus[1].setNo("2018002");
//		System.out.println(stus[1].getNo());
		
		
		
		
		
		
		
		
		
		
		
//		int[] arr = new int[3];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		fun1(arr);
//		System.out.println(Arrays.toString(arr));
		
		
		
		
//		int b = 20;
//		fun(b);
//		System.out.println(b);
		
		
		
		
		
		
//		int a = 10;
//		int b = 50;
//		int sum = 0;
//		
//		for (int i = a; i < b; i++) {
//			sum += i;
//		}
		
//		int[] arr = {1,2,3};
//		int[] arr1 = arr;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		arr1[0] = 10;
//		arr1[1] = 20;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		int[] arr = {12,51,10};
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//基本数据类型和引用数据类型的区别：
		//1、基本数据类型的操作直接针对本身的内存；引用数据类型一般包括属性和方法。
		//2、基本数据类型可以应用内置运算符做操作；引用数据类型需要调用它的方法。
		//3、变量比较：基本数据类型比值。引用数据类型：默认比较的不是值，而是地址。
		
//		int a = 10;
//		int b = a;
//		b = 20;
//		System.out.println(a+ "," + b);
		
		
		
//		int[] arr = new int[3];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		int[] arr1 = arr;
//		arr1[0] = 100;
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr1));
		
//		int[] arr1 = new int[3];
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
//		int[] arr2 = new int[3];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		arr2[2] = 30;
//		System.out.println(arr1 == arr2);
		
		
//		String str = "+";
//		String str1 = new String();
//		Scanner s = new Scanner(System.in);
//		str1 = s.next();
//		
//		str1.equals(str);
//		
//		if (str1 == str) {
//			
//		} else {
//
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
