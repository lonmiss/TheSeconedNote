package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class XueLiWork1_3_2 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String[] stuNo = { "2019011535", "2019011534", "2019011539", "2019011538", "2019011537" };
        String[] stuName = { "张三", "李四", "王五", "赵六", "王九" };
        int[] stuScore = { 53, 78, 96, 66, 85 };
        int max=stuScore[0],min=stuScore[0];
        int sum=stuScore[0];
        for (int i = 1; i < stuScore.length; i++) {
            sum+=stuScore[i];
            if(stuScore[i]<min)
            {
                min=stuScore[i];
            }
            if(stuScore[i]>max)
            {
                max=stuScore[i];
            }
        }
        System.out.println("最大值是："+max);
        System.out.println("最小值是："+min);
        System.out.println("所有值之和："+sum);
        System.out.print("\n");
        System.out.println("排序前：");
        System.out.println(Arrays.toString(stuNo));
        System.out.println(Arrays.toString(stuName));
        System.out.println(Arrays.toString(stuScore));
        System.out.println("排序后：");
        Arrays.sort(stuNo);
        Arrays.sort(stuName);
        Arrays.sort(stuScore);
        System.out.println(Arrays.toString(stuNo));
        System.out.println(Arrays.toString(stuName));
        System.out.println(Arrays.toString(stuScore));

        String[] stuNo1 = new String[stuNo.length];
        String[] stuName1 = new String[stuName.length];
        int[] stuScore1 = new int[stuScore.length];
        System.out.println("复制后输出后：");
        stuNo1=Arrays.copyOf(stuNo,stuNo.length);
        stuName1=Arrays.copyOf(stuName,stuName.length);
        stuScore1=Arrays.copyOf(stuScore,stuScore.length);
        System.out.println(Arrays.toString(stuNo1));
        System.out.println(Arrays.toString(stuName1));
        System.out.println(Arrays.toString(stuScore1));
    }
}
