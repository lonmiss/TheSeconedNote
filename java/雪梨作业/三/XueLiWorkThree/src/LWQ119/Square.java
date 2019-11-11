package LWQ119;

public class Square extends Graph{
	public double side;
	public double perimeter;
	public double area;
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	public Square() {}
	public Square(String color,boolean stuff,double side) {
		super(color,stuff);
		this.side=side;
	}
	public double Perimeter() {
		perimeter=4*side;
		return perimeter;
	}

	public double Area() {
		area=side*side;
		return area;
	}
	public String toString() {
		// TODO Auto-generated method stub
		String s1;
		s1="正方形的边长："+this.side+"     周长： "+this.Perimeter()+"     面积是："+this.Area()+"     颜色："+getColor()+"    图形是否被填充："+getStuff();
		return s1;
	}
}

