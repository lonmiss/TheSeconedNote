package WQHomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


public class EmployeeManagementSystem {
	final int max=100;   	 //最大  
	private static int current; //当前数量
	Employee[] em=new Employee[max];
	Scanner sc = new Scanner(System.in);
	
	public void readfile(){
		for (int i = 0; i < max; i++) {
			em[i]=new Employee();
		}
		//文件读取
		try {
			FileReader fReader = new FileReader("F:\\employees.txt");
		    BufferedReader bufferedReader = new BufferedReader(fReader);
			String str;
			while ((str = bufferedReader.readLine()) != null) {
				String[] arr = str.split(" ");
				
				em[current].setID(arr[0]);
				em[current].setName(arr[1]);
				em[current].setHeight(Double.parseDouble(arr[2]));
				em[current].setWeight(Double.parseDouble(arr[3]));
				current++;
			}
			bufferedReader.close();
			fReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int addEmployee() {
		// TODO Auto-generated method stub
		//判断是否达到可承受的最大数量
		if(current>=max) {
			System.out.println("职员管理系统达到上限");
			return 0;
		}
		System.out.println("请输入职工信息:");
		
		System.out.print("请输入职工编号: ");
		String id = sc.next();
		System.out.print("请输入职工姓名: ");
		String name = sc.next();
		System.out.print("请输入职工身高: ");
		double height = sc.nextDouble();
		System.out.print("请输入职工体重: ");
		double weight = sc.nextDouble();
		em[current] = new Employee();
		em[current].setID(id);
		em[current].setName(name);
		em[current].setHeight(height);
		em[current].setWeight(weight);
		current++;
		writein();
		return 0;
	}
	
	public void reviseEmployee() {
		// TODO Auto-generated method stub
		System.out.printf("请输入你要修改信息的职工编号：");
		String id = sc.next();
		for(int i = 0; i  < current; i++) {
			if(em[i]!=null) {
				if(em[i].getID().equals(id)) {
					System.out.printf("修改职员体重：");
					double weight1 = sc.nextDouble();
					em[i].setWeight(weight1);
					writein();
					System.out.println("ID:"+em[i].getID()+"，姓名："+em[i].getName()+",身高："+em[i].getHeight()+",体重："+em[i].getWeight());
					break;
				}
			}
		}
	}
	
	public void findEmployee() {
		// TODO Auto-generated method stub
		System.out.printf("请输入你要查找信息的职工姓名：");
		String name = sc.next();
		for(int i = 0; i  < current; i++) {
			if(em[i]!=null) {
				if(em[i].getName().equals(name)) {
					System.out.println("ID:"+em[i].getID()+"，姓名："+em[i].getName()+",身高："+em[i].getHeight()+",体重："+em[i].getWeight());
					break;
				}
			}
		}
	}
	
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.printf("请输入你要删除修改信息的职工编号：");
		String id = sc.next();
		int i;
		for(i = 0; i  < current; i++) {
			if(em[i]!=null) {
				if(em[i].getID().equals(id)) {
					em[i]=null;
					break;
				}
			}
		}
		for (int j = i; j < current-1; j++) {
			em[j]=em[j+1];
		}
		current--;
		writein();
	}
	
	public void printEmployee() {
		// TODO Auto-generated method stub
		for(int i = 0; i  < current; i++) {
			if(em[i]!=null) {
				System.out.println("ID:"+em[i].getID()+"，姓名："+em[i].getName()+",身高："+em[i].getHeight()+",体重："+em[i].getWeight());
			}
		}
	}
	
	public void writein() {
		// TODO Auto-generated method stub
		try {
			Writer writer = new FileWriter(new File("F:\\employees.txt")); 
			for(int i = 0; i < current; i++) {
				writer.write(em[i].getID()+" "+em[i].getName()+" "+em[i].getHeight()+" "+em[i].getWeight() + "\r\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
}

