package homeWork.FiveWork05_1;

public class Rectangle extends Graphics {
    private double Length;
    private double Wide;


    public Rectangle(double Length,double Wide,String color,String b){
        this.Length=Length;
        this.Wide=Wide;
        this.setPen_color(color);
        this.setFill(b);
    }
    public void setLength(double length) {
        Length = length;
    }

    public void setWide(double wide) {
        Wide = wide;
    }

    public double getLength() {
        return Length;
    }

    public double getWide() {
        return Wide;
    }

    @Override
    public double Area() {
        return this.Wide*this.Length;
    }

    @Override
    public double perimeter() {
        return 2*(this.Wide+this.Length);
    }

    @Override
    public String toString() {
        String s1;
        s1="长是："+this.Length+"  宽是："+this.Wide+"  画笔颜色："+this.getPen_color()+"    图形是否被填充："+this.getFill()+"  这个长方形的面积："+this.Area()+"    这个正方形的周长："+this.perimeter();
        return s1;
    }
}
