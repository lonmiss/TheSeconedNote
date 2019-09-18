package ByMyself;

import java.util.Scanner;

public class 信号报告 {
    public static void main(String[] args)
    {
        String[] R={"unreadable","barely readable, occasional words distinguishabl","readable with considerable difficulty","readable with practically no difficulty","perfectly readable"};

        String[] S={"Faint signals, barely perceptible","Very weak signals","Weak signals","Fair signals","Fairly good signals","Good signals","Moderately strong signals","Strong signals","Extremely strong signals"};

        Scanner in=new Scanner(System.in);
        int data=in.nextInt();
        int r=data/10;
        int s=data%10;
        System.out.println(S[s-1]+", "+R[r-1]+".");
    }
}
