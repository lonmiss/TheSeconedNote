package BXhomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


public class EmployeeManagementSystem {
	static Scanner  sc1 = new Scanner(System.in);
	private final static int maxnum=100;
	private static int num=0;
	static Employee[] em =new Employee[maxnum];
	static Scanner sc = new Scanner(System.in);
	public int getMaxnum() {
		return maxnum;
	}
	public int getNum() {
		return num;
	}
	
	public void setNum(int n) {
		this.num = n;
	}

	
	public void starttxt(){
		for (int i = 0; i < maxnum; i++) {
			em[i]=new Employee();
		}
		try {
			FileReader fReader = new FileReader("F:\\employees.txt");
		    BufferedReader bufferedReader = new BufferedReader(fReader);
			String str;
			while ((str = bufferedReader.readLine()) != null) {
				String[] arr = str.split(" ");
				
				em[num].setID(arr[0]);
				em[num].setName(arr[1]);
				em[num].setHeight(Double.parseDouble(arr[2]));
				em[num].setWeight(Double.parseDouble(arr[3]));
				num++;
			}
			bufferedReader.close();
			fReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void caoZuo() {
		System.out.println("职工管理系统═ ═ ═ ═ ═");
		System.out.println("1.添加职工");
		System.out.println("2.修改职工信息");
		System.out.println("3.查找职工信息");
		System.out.println("4.删除职工信息");
		System.out.println("5.显示所有职工信息");
		System.out.println("6.退出系统");
		System.out.println("请选择……\n");
		
		String s = sc1.next();
		switch(s) {
		case "1":
			addEmployee();
			break;
		case "2":
			updateEmployee();
			break;
		case "3":
			findEmployee();
			break;
		case "4":
			delEmployee();
			break;
		case "5":
			displayEmployee();
			break;
		case "6":
			backEmployee();
			System.exit(0);
			break;
		default:
			break;
		}	
	}
	
	public void addEmployee() {
		System.out.println("增加职工,请输入相关信息\n");
		System.out.println("id:");
		String ID = sc1.next();
		System.out.println("姓名:");
		String na = sc1.next();
		System.out.println("身高:");
		Double h = sc1.nextDouble();
		System.out.println("体重:");
		Double w = sc1.nextDouble();
		Employee a = new Employee(); 
		
		em[num].setID(ID);
		em[num].setName(na);
		em[num].setHeight(h);
		em[num].setWeight(w);
		num++;
		backEmployee();
		
	}
	
	public  void updateEmployee() {
		System.out.println("修改职工信息，请输入你要修改的ID");
		String ID = sc1.next();
		for (int i = 0; i < 100; i++) {
			if (em[i] != null) {
				if (em[i].getID().equals(ID)) {
					System.out.println("你要修改的是：");
					em[i].display();
					System.out.println("请输入修改后的信息");
					System.out.println("ID：");
					String id = sc1.next();
					System.out.println("姓名：");
					String name = sc1.next();
					System.out.println("身高：");
					Double h = sc1.nextDouble();
					System.out.println("体重：");
					Double w = sc1.nextDouble();
				}
			}
		}
		backEmployee();
	}
	
	public void findEmployee() {
		System.out.println("查找职工信息,请输入你要查找的ID");
		String ID = sc1.next();
		for (int i = 0; i < em.length; i++) {
			if (em[i]!= null) {
				if (em[i].getID().equals(ID)) {
					em[i].display();
				}
				else {
					System.out.println("未找到");
					break;
				}
			}
			else {
				break;
			}
		}
	}
	
	public void delEmployee() {
		System.out.println("删除职工信息,请输入职工id");
		String idString = sc1.next();
		for (int i = 0; i < 100; i++) {
			if (em[i] != null) {
				if(em[i].getID().equals(idString)) {
					System.out.println("你要删除的是：" + em[i].getName());
					System.out.println("你确定要删除吗？\n [y]确定,[n]取消");
					String s = sc1.next();
					if(s.equals("y")) {
						em[i] = null;
						System.out.println("删除成功！");
						backEmployee();
					}
				}
			}
		}
	}
	
	public void displayEmployee() {
		System.out.println("查看所有职工的信息\n");
		for (int i = 0; i < num; i++) {
			em[i].display();
		}
	}
	
	public void backEmployee() {
		try {
			Writer writer = new FileWriter(new File("F:\\employees.txt"));
			for (int i = 0; i <num; i++) {
				writer.write(em[i].getID()+" "+em[i].getName()+" "+em[i].getHeight()+" "+em[i].getHeight()+" "+em[i].getWeight());
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public EmployeeManagementSystem() {
		// TODO Auto-generated constructor stub
	}

}
