package LWQ119;

public class Rectangle extends Graph{
	public double length;
	public double width;
	public double perimeter;
	public double area;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public Rectangle() {}
	public Rectangle(String color,boolean stuff,double length,double width) {
		super(color,stuff);
		this.length=length;
		this.width=width;
	}
	public double Perimeter() {
		// TODO Auto-generated method stub
		perimeter=2*(length+width);
		return perimeter;
	}
	public double Area() {
		// TODO Auto-generated method stub
		area=length*width;
		return area;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s1;
		s1="�����γ���"+this.length+"      ��"+this.width+"     �ܳ��� "+this.Perimeter()+"     ����ǣ�"+this.Area()+"     ��ɫ��"+getColor()+"    ͼ���Ƿ���䣺"+getStuff();
		return s1;
	}
}

