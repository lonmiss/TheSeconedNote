package homeWork.FourWork04_3;

public class Main04_3 {
    public static void main(String[] args)
    {
        Point p1=new Point(0,0);
        Point p2=new Point(3,0);
        Point p3=new Point(0,4);

        Triangle t1=new Triangle(p1,p2,p3);//合法
        System.out.println("三角形t1周长是："+t1.Perimeter());

        Point p10=new Point(0,0);
        Point p20=new Point(0,3);
        Point p30=new Point(0,4);
        Triangle t10=new Triangle(p10,p20,p30);//不合法

        Segment s1=new Segment(p1,p2);
        Segment s2=new Segment(p2,p3);
        Triangle t2=new Triangle(s1,s2);//合法
        System.out.println("三角形t2周长是："+t2.Perimeter());

        Segment s10=new Segment(p2,p3);
        Segment s20=new Segment(p1,p20);
        Triangle t20=new Triangle(s10,s20);//不合法
    }

}
