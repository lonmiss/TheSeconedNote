package Class1119;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        EmployeeManagementSystem mg=new EmployeeManagementSystem();

        Scanner input=new Scanner(System.in);

        mg.readfile();

        while (true){
            int number=input.nextInt();
            switch (number){
                case 1:{
                    mg.addpeo();
                    break;
                }case 2:{
                    mg.xiugai();
                    break;
                }case 3:{
                    mg.findpeo();
                    break;
                }case 4:{
                    mg.delepeo();
                    break;
                }case 5:{
                    mg.printALL();
                    break;
                }case 6:{
                    System.exit(0);
                    break;
                }default:{
                    System.out.println("~~~~");
                    break;
                }
            }

        }
    }
}
