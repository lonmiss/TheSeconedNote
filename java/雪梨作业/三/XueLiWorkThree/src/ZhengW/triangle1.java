package ZhengW;

public class triangle1 {
	private line m=new line();
	private line n=new line();
	public void setM(line m) {
		this.m=m;
	}
	public line getM() {
		return m;
	}
	public void setN(line n) {
		this.n=n;
	}
	public line getN() {
		return n;
	}
	
	//构造三角形
	//无参构造方法
	public triangle1(){}
	//有参构造方法（传入两条线段）
	public triangle1(line l1,line l2){
		this.m=l1;
		this.n=l2;
		//这就构造完成了，不用在写别的，一步一步的来
		
		//后面在检验传入的数据还是否合法~就是是否有共同的端点
		if(m.getA()==n.getB()){
			
		}else if(m.getA()==n.getA()){
		
		}else if(m.getB()==n.getA()){
			
		}else if(m.getB()==n.getB()){
			
		}else{
			//此情况就是没有公共端点，构造的三角形非法
			System.out.println("没有公共端点，构造的三角形非法");
		}
	}
	//有参的构造方法~三个点
	public triangle1(point a1,point b1,point c1){
		this.m.setA(a1);
		this.m.setB(b1);
		
		this.n.setA(a1);
		this.n.setB(c1);
	}
// 此时构造的目的是把m和n赋上值即可
	
	//求三角形的周长
	public double getC(){
		//此时直接处理线段m和n就行
			//寻找三角形的三个端点
		point a = null,b = null,c = null;
		if(m.getA()==n.getB()){
			a=m.getA();
			b=m.getB();
			c=n.getB();
		}else if(m.getA()==n.getA()){
			a=m.getA();
			b=m.getB();
			c=n.getB();
		}else if(m.getB()==n.getA()){
			a=m.getA();
			b=m.getB();
			c=n.getB();
		}else if(m.getB()==n.getB()){
			a=m.getA();
			b=m.getB();
			c=n.getA();
		}
		//为了方便，构造一个可以求出两点之间距离的函数
		return wide(a, b)+wide(a, c)+wide(b, c);
		
	}
	//根据两点求距离
	public double wide(point p1,point p2){
		return Math.sqrt(((p1.getX()-p2.getX())*(p1.getX()-p2.getX()))+((p1.getY()-p2.getY())*(p1.getY()-p2.getY())));
	}
}
		
	
//	if(m.getA()==n.getB()){
//		a=m.getA();
//		b=m.getB();
//		c=n.getB();
//	}else if(m.getA()==n.getA()){
//		a=m.getA();
//		b=m.getA();
//		c=n.getB();
//	}else if(m.getB()==n.getA()){
//		a=m.getA();
//		b=m.getB();
//		c=n.getB();
//	}else(m.getB()==n.getB()){
//		a=m.getA();
//		b=m.getB();
//		c=n.getA();
//	}
	
//	public triangle1(point a,point b,point c) {
//		
//		
//	    double mlength=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
//	   	double nlength=Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
//	   	double lastlength=Math.sqrt((b.getX()-c.getX())*(b.getX()-c.getX())+(b.getY()-c.getY())*(b.getY()-c.getY()));
//		if(mlength+nlength>lastlength&&mlength+lastlength>nlength&&lastlength+nlength>mlength) {
////			this.a=a;
////			this.b=b;
////			this.c=c;
//			//没用
//		}
//		else {
//			System.out.println("创建三角形错误");
//		}
//	}
//	public double getC(point a,point b,point c) {
//	    double mlength=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
//	   	double nlength=Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
//	   	double lastlength=Math.sqrt((b.getX()-c.getX())*(b.getX()-c.getX())+(b.getY()-c.getY())*(b.getY()-c.getY()));
//	   	if(mlength+nlength>lastlength&&mlength+lastlength>nlength&&lastlength+nlength>mlength) {
//	   		return  mlength+nlength+lastlength;
//	   	}
//	   	else {
//	   		return-1;
//	   	}
//	}
	
	
//	public  triangle(line m,line n) {
//		
//		point a = null,b = null,c = null;
////		a=m.getA();
////		b=m.getB();
////		c=n.getB();//这只传进了两根线，但是不知道，他们的哪两个点是一个点，需要判断
//		
//		if(m.getA()==n.getB()){
//			a=m.getA();
//			b=m.getB();
//			c=n.getB();
//		}else if(m.getA()==n.getA()){
//			a=m.getA();
//			b=m.getA();
//			c=n.getB();
//		}else if(m.getB()==n.getA()){
//			a=m.getA();
//			b=m.getB();
//			c=n.getB();
//		}else if(m.getB()==n.getB()){
//			a=m.getA();
//			b=m.getB();
//			c=n.getA();
//		}
//	    double mlength=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
//	   	double nlength=Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
//	   	double lastlength=Math.sqrt((b.getX()-c.getX())*(b.getX()-c.getX())+(b.getY()-c.getY())*(b.getY()-c.getY()));
//	   	if(mlength+nlength>lastlength&&mlength+lastlength>nlength&&lastlength+nlength>mlength) {
//	   		this.m=m;
//	   		this.n=n;
//	   	}
//	   	else {
//			System.out.println("创建三角形错误");
//		}
//}
	
	
//	public  double getC(line m,line n) {
//		point a = null,b = null,c = null;
////		a=m.getA();
////		b=m.getB();
////		c=n.getB();//这只传进了两根线，但是不知道，他们的哪两个点是一个点，需要判断
//		
//		if(m.getA()==n.getB()){
//			a=m.getA();
//			b=m.getB();
//			c=n.getB();
//		}else if(m.getA()==n.getA()){
//			a=m.getA();
//			b=m.getA();
//			c=n.getB();
//		}else if(m.getB()==n.getA()){
//			a=m.getA();
//			b=m.getB();
//			c=n.getB();
//		}else if(m.getB()==n.getB()){
//			a=m.getA();
//			b=m.getB();
//			c=n.getA();
//		}
//	    double mlength=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
//	   	double nlength=Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
//	   	double lastlength=Math.sqrt((b.getX()-c.getX())*(b.getX()-c.getX())+(b.getY()-c.getY())*(b.getY()-c.getY()));
//	   	//求三边长
//	   	return  mlength+nlength+lastlength;
//	  
//	}
	
	
	
//	public triangle() {
//		point a=new point();
//		point b=new point();
//		point c=new point();
//		a.setX(0);
//		a.setY(0);
//		a.setX(1);
//		a.setY(0);
//		a.setX(0);
//		a.setY(1);
//		line m=new line();
//        line n=new line();
//        m.setA(a);
//		m.setB(b);
//		n.setA(a);
//		n.setB(c);
//		double mlength=Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
//	   	double nlength=Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
//	   	double lastlength=Math.sqrt((b.getX()-c.getX())*(b.getX()-c.getX())+(b.getY()-c.getY())*(b.getY()-c.getY()));
//		if(mlength+nlength>lastlength&&mlength+lastlength>nlength&&lastlength+nlength>mlength) {
//	   		this.m=m;
//	   		this.n=n;
//	   	}
//	}
//	public double  getC() {
//		return 3.414213562373095;
//	}
