package homeWork.Threework1;

public class Rectangle {
    private double length;
    private double wide;
    public Rectangle(double length,double wide){
        this.length=length;
        this.wide=wide;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public double getWide() {
        return wide;
    }

    public double RectanglePerimeter(){
        return 2*length+2*wide;
    }
    public double RectangleArea(){
        return length*wide;
    }
}
