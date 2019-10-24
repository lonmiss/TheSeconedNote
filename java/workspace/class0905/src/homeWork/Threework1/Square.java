package homeWork.Threework1;

public class Square {
    private double side;
    public Square(double side){
        this.side=side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public double SquarePerimeter(){
        return 4*side;
    }
    public double SquareArea(){
        return side*side;
    }
}
