package homeWork.FiveWork05_2;

public class Square extends Graphics {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public Square(){}
    public Square(double side,String color,String b){
        this.side=side;
        this.setPen_color(color);
        this.setFill(b);
    }
    @Override
    public double Area() {
        return this.side*this.side;
    }

    @Override
    public double perimeter() {
        return 4*this.side;
    }

    @Override
    public String toString() {
        String s1;
        s1="边长是："+this.side+"  画笔颜色："+this.getPen_color()+"    图形是否被填充："+this.getFill()+"  这个正方形的面积："+this.Area()+"    这个正方形的周长："+this.perimeter();
        return s1;
    }

}
