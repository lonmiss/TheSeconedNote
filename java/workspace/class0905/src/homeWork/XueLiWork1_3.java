package homeWork;

import java.util.Arrays;

public class XueLiWork1_3 {
    public static void main(String[] args) {
        String[] stuNo = {"2019011535", "2019011534", "2019011539", "2019011538", "2019011537"};
        String[] stuName = {"张三", "李四", "王五", "赵六", "王九"};
        int[] stuScore = {53, 78, 96, 66, 85};
        System.out.println("1、计算成绩数组中最大值、最小值、所有值之和，并输出到控制台:");
        int[] stuScore1 = Arrays.copyOf(stuScore, 5);
        //stuScore1=Arrays.copyOf(stuScore);
        //System.out.print(Arrays.toString(stuScore1));
        Arrays.sort(stuScore1);
        int sum = 0;
        for (int i = 0; i < stuScore1.length; i++) {
            sum += stuScore1[i];
        }
        System.out.println("最大值：" + stuScore1[stuScore1.length - 1] + "   最小值：" + stuScore1[0] + "    所有值之和：" + sum);


        System.out.println("2、分别对以上三组数据排序，向控制台输出排序前和排序后的内容:");
        String[] stuNo1 = Arrays.copyOf(stuNo, stuNo.length);
        String[] stuName1 = Arrays.copyOf(stuName, stuName.length);
        Arrays.sort(stuNo1);
        Arrays.sort(stuName1);
        System.out.println(Arrays.toString(stuNo1));
        System.out.println(Arrays.toString(stuName1));
        System.out.println(Arrays.toString(stuScore1));
        System.out.println("\n \n");

        System.out.println("将（2）中排序好的内容复制到另外三个数组中:已经分别复制在stuNo1、stuName1、stuScore1中");
        //已经分别复制在stuNo1、stuName1、stuScore1中
        System.out.println("\n \n");


        System.out.println("4、根据成绩排序，要求保持学号、姓名、成绩对应:");//使用二维数组

        String[][] stuNo2 = {{"2019011535", "1"}, {"2019011534", "2"}, {"2019011539", "3"}, {"2019011538", "4"}, {"2019011537", "5"}};
        String[][] stuName2 = {{"张三", "1"}, {"李四", "2"}, {"王五", "3"}, {"赵六", "4"}, {"王九", "5"}};
        int[][] stuScore2 = {{53, 1}, {78, 2}, {96, 3}, {66, 4}, {85, 5}};
        int score, xvhao;

        for (int i = 0; i < stuScore2.length - 1; i++) {
            for (int j = 0; j < stuScore2.length - i - 1; j++) {
                if (stuScore2[j][0] > stuScore2[j + 1][0]) {
                    score = stuScore2[j][0];
                    xvhao = stuScore2[j][1];

                    stuScore2[j][0] = stuScore2[j + 1][0];
                    stuScore2[j][1] = stuScore2[j + 1][1];

                    stuScore2[j + 1][0] = score;
                    stuScore2[j + 1][1] = xvhao;
                }
            }
        }

        for (int i = 0; i < stuScore2.length; i++) {
            for (int j = 0; j < stuNo2.length; j++) {
                if ((stuScore2[i][1] + "").equals(stuNo2[j][1])) {
                    System.out.print(stuNo2[j][0] + " ");
                    break;
                }
            }
            for (int j = 0; j < stuName2.length; j++) {
                if ((stuScore2[i][1] + "").equals(stuName2[j][1])) {
                    System.out.print(stuName2[j][0] + "   ");
                    break;
                }
            }
            System.out.println(stuScore2[i][0]);
        }
    }
}
