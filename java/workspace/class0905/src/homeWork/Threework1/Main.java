package homeWork.Threework1;

public class Main {
    public static void main(String[] args)
    {
        Circle c=new Circle(1.0);
        System.out.println("圆的周长是"+c.CirclePerimeter()+"    圆的面积是："+c.CircleArea());

        Square s=new Square(2.0);
        System.out.println("正方形的周长是："+s.SquarePerimeter()+"     正方形的面积是："+s.SquareArea());

        Rectangle r=new Rectangle(4.0,3.0);
        System.out.println("长方形的周长是："+r.RectanglePerimeter()+"      长方形的面积是："+r.RectangleArea());
    }
}
