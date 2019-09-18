package Class0917;

import java.util.Arrays;

public class demo1 {
    //函数重载~类型不同，顺序不同，个数不同
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        //System.out.println(add(1));//1
        System.out.println("hello world~");
        //Arrays 自己写一段代码，自己试验
        //基本数据类型VS引用数据类型
        int[] arr1=new int[3];
        arr1[0]=1;
        arr1[1]=8;
        arr1[2]=3;
        int[] arr2=arr1;
        //System.out.println(arr1==arr2);//true
        arr2[0]=100;
        arr2 = new int[3];
        arr2[0]=200;
        arr2[1]=300;
        //arr2[6]=6;
        //没有赋值的话默认为0
        System.out.println(Arrays.toString(arr1));//[100, 8, 3]
        System.out.println(Arrays.toString(arr2));//[100, 8, 3]  [200, 300, 0]
    }
}
