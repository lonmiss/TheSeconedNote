package homeWork.TwoQuestion02_2;

public class Main {
    public static void CreatPoint(MyPoint p,double x,double y,double z)
    {
        p.setX(x);
        p.setY(y);
        p.setZ(z);
    }
    public static void main(String[] args)
    {
        MyPoint[] arr=new MyPoint[2];
        arr[0]=new MyPoint();
        arr[1]=new MyPoint();
        CreatPoint(arr[0],0,0,0);
        CreatPoint(arr[1],10,30.5,20.0);
        double cnt=arr[0].distancefromPoint(arr[1]);
        System.out.println(cnt);
    }
}
