package ZhengW;

public class test {
	public static void main(String[] args) {
		//创建构造点的方法，并且调用创建点
		point a=new point(0,0);
		point b=new point(0,3);
		point c=new point(0,6);
		
		triangle1 t1=new triangle1(a,b,c);
		System.out.println(t1.getC());
		
		point a1=new point(0,0);
		point b1=new point(0,6);
		point c1=new point(8,0);
		line l1=new line();
		line l2=new line();
		l1.setA(a1);
		l1.setB(b1);
		
		l2.setA(a1);
		l2.setB(c1);
		triangle1 t2=new triangle1(l1,l2);
		System.out.println(t2.getC());
		
		
	}
	
}
//	point a=new point();
//	point b=new point();
//	point c=new point();
//	
//	line m=new line();
//	line n=new line();
//	
//	a.setX(1);
//	a.setY(0);
//	
//	b.setX(0);
//	b.setY(1);
//	
//	c.setX(0);
//	c.setY(0);
//	
//	m.setA(a);
//	m.setB(b);
//	
//	n.setA(a);
//	n.setA(c);
//	
//	double C;
//	
////	triangle1 tri1=new triangle1(a,b,c);
////	double C=tri1.getC();
////	System.out.println(C);
//	triangle1 tri2=new triangle1(m,n);
//	
//    C=tri2.getC();
//	System.out.println(C);
//	triangle1 tri3=new triangle1();
//	C=tri3.getC();
//	System.out.println(C);
//	}


