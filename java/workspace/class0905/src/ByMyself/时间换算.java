package ByMyself;

import java.util.Scanner;

public class 时间换算 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int data=in.nextInt();
        int hour=data/100;
        hour=hour-8;
        if(hour<0){
            hour=hour+24;
        }
        data=data%100;
        if(hour==0)
        {
            System.out.println(String.format("%d",data));
        }else{
            System.out.println(hour+String.format("%02d",data));
        }
    }
//    {
//        Scanner in=new Scanner(System.in);
//        int cnt=in.nextInt();
//        int hour=cnt/100;
//        int min=cnt%100;
//        hour=hour-8;
//        if(hour<0)
//        {
//            hour=hour+24;
//        }
//        String result=hour+"";
//        if(min<10)
//        {
//            result+="0"+min;
//        }else {
//            result += min + "";
//        }
//        int flag=0;
//        for (int i = 0; i < result.length(); i++) {
//
//        }
//
//    }
}
