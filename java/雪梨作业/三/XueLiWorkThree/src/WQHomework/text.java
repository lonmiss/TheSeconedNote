package WQHomework;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class text {
	
	public static void cz() {
		// TODO Auto-generated method stub
		System.out.println("职工管理系统======");
		System.out.println("1.添加职工");
		System.out.println("2.修改职工信息");
		System.out.println("3.查找职工信息");
		System.out.println("4.删除职工信息");
		System.out.println("5.显示所有职工信息");
		System.out.println("6.退出系统");
		System.out.println("请选择……\n");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		EmployeeManagementSystem system = new EmployeeManagementSystem();
		Scanner in = new Scanner(System.in);
		system.readfile();
		int a=1;
		while(a==1) {
			cz();
			String number = in.next();
			switch (number) {
			case "1":
				system.addEmployee();
				break;
			case "2":
				system.reviseEmployee();
				break;
			case "3":
				system.findEmployee();
				break;
			case "4":
				system.deleteEmployee();
				break;
			case "5":
				system.printEmployee();
				break;
			case "6":
				System.out.println("职工管理系统已关闭\n");
//				system.writein();
				a=0;
				break;
			default:
				System.out.println("输入无效，请重新输入\n");
				cz();
				break;
			}
		}
	}
}
