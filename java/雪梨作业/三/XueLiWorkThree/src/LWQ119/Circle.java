package LWQ119;

public class  Circle extends Graph{
	private double radius;
	private double perimeter;
	private double area;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public Circle() {}
	public Circle(String color,boolean stuff,double radius) {
		super(color,stuff);
		this.radius=radius;
	}
	
	public double Perimeter() {
		perimeter=2*radius*Math.PI;
		perimeter=(double)((Math.round(perimeter*100))/100.0);
		return perimeter;
	}
	public double Area() {
		area=radius*radius*Math.PI;
		area=(double)((Math.round(area*100))/100.0);
		return area;
	}
	public String toString() {
		// TODO Auto-generated method stub
		String s1;
		s1="圆的半径"+this.radius+"     周长： "+this.Perimeter()+"     面积是："+this.Area()+"     颜色："+getColor()+"    图形是否被填充："+getStuff();
		return s1;
	}
}
