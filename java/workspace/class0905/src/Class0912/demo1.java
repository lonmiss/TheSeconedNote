package Class0912;


import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner syin=new Scanner(System.in);
        int cnt=syin.nextInt();
        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(i+"*"+j+"="+i*j+"	");
            }
            System.out.println("");
        }
    }

}