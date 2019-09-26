package homeWork;


public class XueLiWork1_3_13 {
    public static void main(String[] args)
    {
        String[] stuNo = { "2019011535", "2019011534", "2019011539", "2019011538", "2019011537" };
        String[] stuName = { "张三", "李四", "王五", "赵六", "王九" };
        int[] stuScore = { 53, 78, 96, 66, 85 };
        String No,Name;
        int Score;
        for (int i = 0; i < stuNo.length-1; i++) {
            for (int j = 0; j <stuNo.length-1-i ; j++) {
                if(stuScore[j]>stuScore[j+1])
                {
                    Score=stuScore[j];
                    stuScore[j]=stuScore[j+1];
                    stuScore[j+1]=Score;

                    No=stuNo[j];
                    stuNo[j]=stuNo[j+1];
                    stuNo[j+1]=No;

                    Name=stuName[j];
                    stuName[j]=stuName[j+1];
                    stuName[j+1]=Name;
                }
            }
        }
        for (int i = 0; i <stuNo.length ; i++) {
            System.out.println(stuNo[i]+" "+stuName[i]+" "+stuScore[i]);
        }
    }
}
