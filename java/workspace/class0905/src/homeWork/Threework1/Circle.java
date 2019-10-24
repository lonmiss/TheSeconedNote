package homeWork.Threework1;

public class Circle {
    private double R;
    public Circle(double r){
        R=r;
    }
    public void setR(double r) {
        R = r;
    }
    public double getR() {
        return R;
    }

    public double CirclePerimeter(){
        return 2*R*3.14;
    }
    public double CircleArea(){
        return R*R*3.14;
    }
}
