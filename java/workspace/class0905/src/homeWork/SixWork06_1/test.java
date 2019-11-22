package homeWork.SixWork06_1;


import java.io.*;
import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        EmployeeManagementSystem tool=new EmployeeManagementSystem();
        tool.startStaff();
        Scanner in=new Scanner(System.in);
        tool.readStaff();
        int number;
        while (true) {
            System.out.println("职工管理系统=====\n"+"1、添加职工信息\n"+"2、修改职工信息\n"+"3、查找职工信息\n"+"4、删除职工信息\n"+"5、显示所有职工信息\n"+"6、退出系统");
            number = in.nextInt();
            switch (number) {
                case 1:
                    //添加职工
                    int no;//工号
                    String name;//姓名
                    float height;//身高
                    float weight;//体重
                    System.out.println("该员工工号:");
                    no = in.nextInt();
                    System.out.println("该员工姓名:");
                    name = in.next();
                    System.out.println("该员工身高:");
                    height = in.nextFloat();
                    System.out.println("该员工体重:");
                    weight = in.nextFloat();
                    int cnt=tool.getCount();
                    tool.addStaff( no, name, height, weight);
                    tool.reload();
                    break;
                case 2:
                    //修改职工信息～根据职工编号修改职工体重并打印
                    System.out.println("请输入该员工的编号：");
                    int tNo = in.nextInt();
                    System.out.println("该员工现体重:");
                    float tWeight = in.nextFloat();
                    tool.replaceWeight( tNo, tWeight);
                    tool.reload();
                    break;
                case 3:
                    //查找员工信息～根据职姓名查找职工信息并打印
                    System.out.println("请输入该员工的姓名：");
                    String tName = in.next();
                    tool.searchStaff(tName);
                    break;
                case 4:
                    //删除员工信息～根据职工编号删除职工信息
                    System.out.println("请输入该员工的编号：");
                    int tno = in.nextInt();
                    tool.deleteStaff(tno);
                    tool.reload();
                    break;
                case 5:
                    //显示所有员工信息
                    tool.PrintStaff();

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入合法字符！！！\n");

            }
        }
    }
}
