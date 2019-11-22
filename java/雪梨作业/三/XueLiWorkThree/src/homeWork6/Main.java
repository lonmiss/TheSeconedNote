package homeWork6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args)  {
		
		final int MaxPeople=100;
		int count;
		// 执行程序
		Employee[] peoNums=new Employee[MaxPeople];
		EmployeeManagementSystem e1=new EmployeeManagementSystem();
		
		count=0;
		try{
			FileReader fReader = new FileReader("F:\\employees.txt");
		    BufferedReader bufferedReader = new BufferedReader(fReader);
		    String s1;
		    s1=bufferedReader.readLine();
		    count=0;
		    while (s1!=null) {
		    	String[] s2=s1.split(" ");//将数据分离
		    	//保存数据
		    	peoNums[count]=new Employee();
				peoNums[count].setNo(s2[0]);
				peoNums[count].setName(s2[1]);
				peoNums[count].setHeight(java.lang.Float.parseFloat(s2[2]));
				peoNums[count].setWeight(java.lang.Float.parseFloat(s2[3]));
				count++;
				s1=bufferedReader.readLine();
			}
		    
			bufferedReader.close();
			fReader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(count);
		e1.startWindows(peoNums,count);
		System.exit(0);
	
	}
}
