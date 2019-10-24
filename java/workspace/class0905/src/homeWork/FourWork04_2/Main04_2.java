package homeWork.FourWork04_2;

public class Main04_2 {
    public static void main(String[] args)
    {
        Point p1=new Point(0,0);
        Point p2=new Point(4,0);
        Point p3=new Point(0,3);

        Segment s1=new Segment(p1,p2);
        Segment s2=new Segment(p1,p3);

        Triangle t1=new Triangle(s1,s2);

        System.out.println("周长是"+t1.Perimeter());
    }

}
