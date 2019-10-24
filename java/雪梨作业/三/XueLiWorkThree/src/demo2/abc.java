package demo2;

import java.awt.BufferCapabilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hpsf.ReadingNotSupportedException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class abc {
	public static void ReadDate(double[] nums)
	{
		try {
			// 获得Excel文件输入流
			      FileInputStream  in = new FileInputStream("F:\\大二上\\TheSeconedNote\\java\\雪梨作业\\三\\实验一\\成绩单.xls");
			        // 创建对Excel工作簿文件的引用
			        HSSFWorkbook workbook = new HSSFWorkbook(in);
			        // 创建对工作表的引用。
			        // 得到Excel工作簿的第一页，即excel工作表对象
			        // 在Excel文档中，第一张工作表的索引是0
			        HSSFSheet sheet = workbook.getSheetAt(0);
			        // 得到工作表中第一行的引用，第一行的索引是0
			        

			        for (int i = 0; i < 53; i++) {
			        	HSSFRow row = sheet.getRow(i+1);
			        	HSSFCell cell = row.getCell(6);
			        	nums[i]=cell.getNumericCellValue();
					}
			        
			        
			        in.close();// 关闭文件输入流
			    } catch (Exception e) {//上面程序正确时，不会执行此处代码
			        System.out.println("出错了！");
			        e.printStackTrace();
			}    
		}
	public static void FenXiDate(double[] nums,int[] Pnums,String[] bili,double[] arr){
		for (int i = 0; i < nums.length; i++) {
			if(arr[1]<nums[i])
			{
				arr[1]=nums[i];
			}
			if(arr[2]>nums[i])
			{
				arr[2]=nums[i];
			}
			arr[0]+=nums[i];
			if(nums[i]>=90&&nums[i]<=100)
			{
				Pnums[0]++;
			}else if(nums[i]>=80&&nums[i]<=89)
			{
				Pnums[1]++;
			}else if(nums[i]>=70&&nums[i]<=79)
			{
				Pnums[2]++;
			}else if(nums[i]>=60&&nums[i]<=69)
			{
				Pnums[3]++;
			}else{
				Pnums[4]++;
			}
		}
		for (int i = 0; i < Pnums.length; i++) {
			String s2;
			double ss=(Pnums[i]*1.0)/(53*1.0)*100;
			s2=String.format("%.2f", ss)+"%";
			bili[i]=s2;
			//System.out.println(s2);
		}
	}
	public static void WriteDate(int[] Pnums,String[] bili,double[] brr){
		try {
			// 获得Excel文件输入流
			FileInputStream in = new FileInputStream("F:\\大二上\\TheSeconedNote\\java\\雪梨作业\\三\\实验一\\成绩分析.xls");
			// 创建excel工作簿对象
			HSSFWorkbook wb = new HSSFWorkbook(in);
			// 获得excel中第一个工作页对象，索引从0开始
			HSSFSheet sheet = wb.getSheetAt(0);
			
//			// 创建工作表中一行，索引从0开始
//			HSSFRow row1 = sheet.getRow(1);
//			// 创建工作表中单元格，索引从0开始
//			HSSFCell cell1_1 = row1.createCell(2);
//			// 设置单元格内容
//			cell1_1.setCellValue("内容");
			
			for (int i = 0; i < Pnums.length; i++) {
				HSSFRow row1 = sheet.getRow(1);
				HSSFCell cell1_1 = row1.createCell(2+i);
				cell1_1.setCellValue(Pnums[i]);
			}
			for (int i = 0; i < bili.length; i++) {
				HSSFRow row1 = sheet.getRow(2);
				HSSFCell cell1_1 = row1.createCell(2+i);
				cell1_1.setCellValue(bili[i]);
			}
			HSSFRow row3 = sheet.getRow(3);
			HSSFCell cell3_1 = row3.createCell(2);
			cell3_1.setCellValue(String.format("%.1f", (brr[0]*1.0)/53));
			cell3_1 = row3.createCell(4);
			cell3_1.setCellValue(String.format("%d", (int)brr[1]));
			cell3_1 = row3.createCell(6);
			cell3_1.setCellValue(String.format("%d", (int)brr[2]));
			
			// 获得Excel文件输出流
			FileOutputStream out = new 
			FileOutputStream("F:\\大二上\\TheSeconedNote\\java\\雪梨作业\\三\\实验一\\成绩分析.xls");
			// 输出excel
			wb.write(out);
			// 关闭文件输入、输出流
			in.close();
			out.close();
		} catch (Exception e) {
			// 上面程序正确时，不会执行此处代码
			System.out.println("出错了！");
			e.printStackTrace();
		}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] nums=new double[53];// 读取数据
		int[] Pnums=new int[5];//记录不同类型的人数的
		String[] bili=new String[5];//记录比例
		
		
		ReadDate(nums);
//		double sum=0;

		double[] result=new double[3];
		result[1]=(double) nums[0];
		result[2]=(double) nums[0];
		//处理数据
		FenXiDate(nums,Pnums, bili,result);
//		for (int j = 0; j < bili.length; j++) {
//			System.out.println(bili[j]);
//		}
		//System.out.println("sum="+sum+"    max="+max+"    min="+min);
		WriteDate(Pnums,bili,result);
	}

}
