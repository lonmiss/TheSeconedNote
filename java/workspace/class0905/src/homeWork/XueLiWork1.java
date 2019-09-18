package homeWork;

import java.util.Scanner;

public class XueLiWork1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个表达式：");
        int a=in.nextInt();
        String b=in.next();
        int c=in.nextInt();
        int d=0;
        switch (b){
            case "+":{
                d=a+c;
                break;
            }
            case "-":{
                d=a-c;
                break;
            }
            case "*":{
                d=a*c;
                break;
            }
            case "/":{
                d=a/c;
                break;
            }
        }
        System.out.println("表达式值为："+d);

    }
}
