package homeWork6;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


import javax.lang.model.element.VariableElement;

public class EmployeeManagementSystem {
	Scanner str = new Scanner(System.in); 

	
	//添加人员
	public void addPeo(String no,String name,float height,float weight,Employee a){
		a=new Employee();
		a.setNo(no);
		a.setName(name);
		a.setHeight(height);
		a.setWeight(weight);
		try {
			FileReader fReader = new FileReader("F:\\original.txt");
		    BufferedReader bufferedReader = new BufferedReader(fReader);
			Writer writer = new FileWriter(new File("F:\\modify.txt"));
			String str;
			while ((str = bufferedReader.readLine()) != null) {
			}
			writer.write(no+" "+name+" "+height+" "+weight+"\r\n");
			bufferedReader.close();
			fReader.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//根据编号修改职工体重信息
	public void alterPeo(Employee[] arr,String no,float weightData) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getNo()==no){
				arr[i].setWeight(weightData);
				String s1="编号："+arr[i].getNo()+"   姓名："+arr[i].getName()+"   身高："+arr[i].getHeight()+"   体重："+arr[i].getWeight();
				System.out.println(s1);
				break;
			}
		}
	}
	//根据姓名查找职工信息
	public void findName(Employee[] arr,String name){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getName()==name){
				String s1="编号："+arr[i].getNo()+"   姓名："+arr[i].getName()+"   身高："+arr[i].getHeight()+"   体重："+arr[i].getWeight();
				System.out.println(s1);
				break;
			}
		}
	}
	//显示所有职工信息
	public void printAll(Employee[] arr,int count){
		for (int i = 0; i < count; i++) {
			String s1="编号："+arr[i].getNo()+"   姓名："+arr[i].getName()+"   身高："+arr[i].getHeight()+"   体重："+arr[i].getWeight();
			System.out.println(s1);
		}
	}
	
	// 输出框
	public void startWindows(Employee[] peoNums,int count){
		while(true){
			System.out.println("职工管理系统=====\n"+"1、添加职工信息\n"+"2、修改职工信息\n"+"3、查找职工信息\n"+"4、删除职工信息\n"+"5、显示所有职工信息\n"+"6、退出系统\n");
			int flag;
			flag=str.nextInt();
			switch (flag) {
			case 1:
			{
				String no;
				String name;
				float height;
				float weight;
				System.out.println("请按以下要求输入添加员工信息\n请输入员工编号：\n");
				no=str.next();
				System.out.println("请输入员工姓名：\n");
				name=str.next();
				System.out.println("请输入员工身高：\n");
				height=str.nextFloat();
				System.out.println("请输入员工体重：\n");
				weight=str.nextFloat();
				addPeo(no,name,height,weight,peoNums[++count]);
				break;
			}case 2:
			{
				//根据职工编号修改职工体重并打印
				System.out.println("请输入该员工的编号:\n");
				String id=str.next();
				System.out.println("请输入该员工现在体重:\n");
				float nowWeight=str.nextFloat();
				alterPeo(peoNums,id,nowWeight);
				break;
			}case 3:
			{
				System.out.println("请输入该员工的姓名:\n");
				String name=str.nextLine();
				findName(peoNums,name);
				break;
			}case 4:
			{
				
				break;
			}case 5:
			{
				printAll(peoNums,count);
				break;
			}case 6:
			{
				System.exit(0);
				break;
			}default:
			{
				System.out.println("请输入合法字符!");
				break;
			}
		}
	}
	

}}
