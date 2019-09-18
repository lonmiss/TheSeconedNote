package Class0912;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShuZu {
    public static void main(String[] args)
    {
        //第三章数组
        int arr[]={1,2,3,4,9,12,0,12,-1,-15,6};
//        String[] strs={"hello","world"};//写java程序时最常用的程序，是我们今后用的最多的
//        System.out.println("arr="+arr.length);
//        System.out.println("strs="+strs.length);
//        //length数组包含多少个元素
//        int arr1[]=new int[5];//动态分配内存//告诉编译器里面有5个元素
        //排序
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        //动态初始化赋值初始化（值能改变）；动态初始化最常用的
        int[] arr2=new int[3];
        arr2[0]=9;
        arr2[1]=5;
        arr2[2]=16;
        Arrays.sort(arr2);
        //toSTRING
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
