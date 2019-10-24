package Homework3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.stream.IntStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.sun.xml.bind.v2.runtime.output.IndentingUTF8XmlOutput;

public class Main {
	//读取所有学生成绩单中期末成绩
	public static void readExcel(double[] arr){
		try{
			
			FileInputStream  in = new FileInputStream("F:\\大二上\\TheSeconedNote\\java\\雪梨作业\\三\\实验一\\成绩单.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(in);
			HSSFSheet sheet = workbook.getSheetAt(0);//第一张表
			HSSFRow row;
			HSSFCell cell;
			for(int i=0;i<53;i++)
			{
				row = sheet.getRow(i+1);//得到工作表中第一行的引用，第一行的索引是0
				cell = row.getCell(6); //得到某一行的第一个单元格，单元格的索引也是从0开始
				//System.out.println(cell.getNumericCellValue());
				arr[i]=cell.getNumericCellValue();
			}
			workbook.close();
			in.close();
		}catch (Exception e) {//上面程序正确时，不会执行此处代码
	        System.out.println("出错了！");
	        e.printStackTrace();
		}

	}
	public static void DealWithDate(double[] arr,int[] Peoples,String[] BID,int[] MaxMin){
		//处理数据
		double max=arr[0],min=arr[0],sum=0;
		int excellent=0,well=0,medium=0,pass=0,fail=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<60)
			{
				fail++;
			}else if(arr[i]<70)
			{
				pass++;
			}else if(arr[i]<80)
			{
				medium++;
			}else if(arr[i]<90)
			{
				well++;
			}else if(arr[i]<=100)
			{
				excellent++;
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
			sum+=arr[i];
		}
		Peoples[0]=fail;
		Peoples[1]=pass;
		Peoples[2]=medium;
		Peoples[3]=well;
		Peoples[4]=excellent;
		
		for (int i = 0; i < 5 ; i++) {
			BID[i]=String.format("%.2f",(((Peoples[i]*1.0)/(arr.length*1.0))*100))+"%";
		}
		BID[Peoples.length]=String.format("%.1f", sum/arr.length);
		MaxMin[0]=(int)max;
		MaxMin[1]=(int)min;
	}
	
	public static void WriteDate(int[] Peoples,String[] BID,int[] MaxMin){
		//写入数据
		try{
			FileInputStream in = new FileInputStream("F:\\大二上\\TheSeconedNote\\java\\雪梨作业\\三\\实验一\\成绩分析.xls");
			HSSFWorkbook wb1 = new HSSFWorkbook(in);
			
			HSSFSheet sheet = wb1.getSheetAt(0);// 获得excel中第一个工作页对象，索引从0开始
			HSSFRow row1 = sheet.getRow(1);// 创建工作表中一行，索引从0开始
			HSSFCell cell1_1 = row1.createCell(2);
			cell1_1.setCellValue(Peoples[4]);
			HSSFCell cell1_2 = row1.createCell(3);
			cell1_2.setCellValue(Peoples[3]);
			HSSFCell cell1_3 = row1.createCell(4);
			cell1_3.setCellValue(Peoples[2]);
			HSSFCell cell1_4 = row1.createCell(5);
			cell1_4.setCellValue(Peoples[1]);
			HSSFCell cell1_5 = row1.createCell(6);
			cell1_5.setCellValue(Peoples[0]);
			
		HSSFRow row11 = sheet.getRow(2);// 创建工作表中一行，索引从0开始	
		for (int i = 0; i < 5; i++) {
			HSSFCell cell2_0 = row11.createCell(i+2);
			cell2_0.setCellValue(BID[4-i]);
		}
		HSSFRow row111 = sheet.getRow(3);
		for (int i = 1; i < 4; i++) {
			if(i==1)
			{
				HSSFCell cell3_0 = row111.createCell(2*i);
				cell3_0.setCellValue(BID[Peoples.length+i-1]);
			}else{
				HSSFCell cell3_0 = row111.createCell(2*i);
				cell3_0.setCellValue(MaxMin[i-2]);
			}
			
		}
		
		FileOutputStream out = new FileOutputStream("F:\\大二上\\TheSeconedNote\\java\\雪梨作业\\三\\实验一\\成绩分析.xls");
		wb1.write(out);
		in.close();
		out.close();

		}catch (Exception e) {
			// 上面程序正确时，不会执行此处代码
			System.out.println("2出错了！");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr=new double[53];
		int[] Peoples=new int[5];
		String[] Proportion=new String[8];
		int[] MaxMin=new int[2];
		//读取数据
		readExcel(arr);
		DealWithDate(arr,Peoples,Proportion,MaxMin);
		WriteDate(Peoples,Proportion,MaxMin);
	}
}