package Class1031;

public class Main {
    public static void main(String[] args) {
        //1、构造包装器类对象
        Short s=new Short("5");
        System.out.println(s.toString());
        Integer i=new Integer(10);
        System.out.println(i);

        //基本数据类型转换成包装器类,通过类名+“.”+"valueOf
        Float f=Float.valueOf("3.14");

        //把包装器类的对象转换成对应的基本类型对象
        float f0=f.floatValue();

        //自动装箱，自动拆箱
        f=f0;//等价为：Float f=Float.valueOf("3.14");
        f0=f;//等价于：float f0=f.floatValue();

        //匿名内部类
        Comparable c=new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        WeekDays d1=WeekDays.TUS;
        if (d1 == WeekDays.WED) {

        }
        switch (d1){
            case Mon:
                System.out.println("这天是第1天~");
                break;
            case TUS:
                System.out.println("这天是第2天~");
                break;
            case WED:
                System.out.println("这天是第3天~");
                break;
            default:
                System.out.println("NULL");
                break;
        }
    }
}
