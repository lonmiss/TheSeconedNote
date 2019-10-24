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
			// ���Excel�ļ�������
			      FileInputStream  in = new FileInputStream("F:\\�����\\TheSeconedNote\\java\\ѩ����ҵ\\��\\ʵ��һ\\�ɼ���.xls");
			        // ������Excel�������ļ�������
			        HSSFWorkbook workbook = new HSSFWorkbook(in);
			        // �����Թ���������á�
			        // �õ�Excel�������ĵ�һҳ����excel���������
			        // ��Excel�ĵ��У���һ�Ź������������0
			        HSSFSheet sheet = workbook.getSheetAt(0);
			        // �õ��������е�һ�е����ã���һ�е�������0
			        

			        for (int i = 0; i < 53; i++) {
			        	HSSFRow row = sheet.getRow(i+1);
			        	HSSFCell cell = row.getCell(6);
			        	nums[i]=cell.getNumericCellValue();
					}
			        
			        
			        in.close();// �ر��ļ�������
			    } catch (Exception e) {//���������ȷʱ������ִ�д˴�����
			        System.out.println("�����ˣ�");
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
			// ���Excel�ļ�������
			FileInputStream in = new FileInputStream("F:\\�����\\TheSeconedNote\\java\\ѩ����ҵ\\��\\ʵ��һ\\�ɼ�����.xls");
			// ����excel����������
			HSSFWorkbook wb = new HSSFWorkbook(in);
			// ���excel�е�һ������ҳ����������0��ʼ
			HSSFSheet sheet = wb.getSheetAt(0);
			
//			// ������������һ�У�������0��ʼ
//			HSSFRow row1 = sheet.getRow(1);
//			// �����������е�Ԫ��������0��ʼ
//			HSSFCell cell1_1 = row1.createCell(2);
//			// ���õ�Ԫ������
//			cell1_1.setCellValue("����");
			
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
			
			// ���Excel�ļ������
			FileOutputStream out = new 
			FileOutputStream("F:\\�����\\TheSeconedNote\\java\\ѩ����ҵ\\��\\ʵ��һ\\�ɼ�����.xls");
			// ���excel
			wb.write(out);
			// �ر��ļ����롢�����
			in.close();
			out.close();
		} catch (Exception e) {
			// ���������ȷʱ������ִ�д˴�����
			System.out.println("�����ˣ�");
			e.printStackTrace();
		}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] nums=new double[53];// ��ȡ����
		int[] Pnums=new int[5];//��¼��ͬ���͵�������
		String[] bili=new String[5];//��¼����
		
		
		ReadDate(nums);
//		double sum=0;

		double[] result=new double[3];
		result[1]=(double) nums[0];
		result[2]=(double) nums[0];
		//��������
		FenXiDate(nums,Pnums, bili,result);
//		for (int j = 0; j < bili.length; j++) {
//			System.out.println(bili[j]);
//		}
		//System.out.println("sum="+sum+"    max="+max+"    min="+min);
		WriteDate(Pnums,bili,result);
	}

}
