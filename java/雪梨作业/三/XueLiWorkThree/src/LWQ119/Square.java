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
		s1="�����εı߳���"+this.side+"     �ܳ��� "+this.Perimeter()+"     ����ǣ�"+this.Area()+"     ��ɫ��"+getColor()+"    ͼ���Ƿ���䣺"+getStuff();
		return s1;
	}
}

