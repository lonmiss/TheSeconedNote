package homeWork.FiveWork05_2;

public class Circle extends Graphics {
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    public Circle(){};
    public Circle(double r,String color,String b){
        this.r=r;
        this.setPen_color(color);
        this.setFill(b);
    };
    @Override
    public double Area() {
        return this.r*this.r*3.14;
    }

    @Override
    public double perimeter() {
        return 2*this.r*3.14;
    }

    @Override
    public String toString() {
        String s1;
        s1="半径是："+this.r+"  画笔颜色："+this.getPen_color()+"    图形是否被填充："+this.getFill()+"  圆的面积："+this.Area()+"    圆的周长："+this.perimeter();
        return s1;
    }
}
