package Class0924;

public class 类和对象 {
    public static void fuzhi(String name,int no,int score,Student l)
    {
        l.setName(name);
        l.setNo(no);
        l.setScore(score);
    }
    public static void main(String[] args)
    {
//        Student s1=new Student();
//        s1.no=2018011666;
//        s1.name="LiuHen";
//        s1.say();
        Student[] arr=new Student[3];


        int id=2018001001;
        arr[0]=new Student();
        arr[1]=new Student();
        arr[2]=new Student();
        fuzhi("张三",01,99,arr[0]);
        fuzhi("李四",02,100,arr[1]);
        fuzhi("赵武",03,98,arr[2]);
        for (int i = 0; i < arr.length; i++) {
            arr[i].say();
        }
    }
}
