package ByMyself;


import java.util.Scanner;

public class 温度转化 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int c=(int)((x-32)*5/9);
        System.out.println(c);
    }
}
