package BXhomework;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		EmployeeManagementSystem mg=new EmployeeManagementSystem();
		mg.starttxt();
		while(true){
			mg.caoZuo();
		}
	}

}
