package work4;

public class jiao {
	private line l1;
	private line l2;
	public line getL1() {
		return l1;
	}
	public void setL1(line l1) {
		this.l1 = l1;
	}
	public line getL2() {
		return l2;
	}
	public void setL2(line l2) {
		this.l2 = l2;
	}
	
	public jiao(line l1,line l2){
		this.l1=l1;
		this.l2=l2;
		if(l1.getP1()==l2.getP1()||l1.getP1()==l2.getP2()||l1.getP2()==l2.getP1()||l1.getP2()==l2.getP1()){
		}else{
			System.out.println("三角非法");
		}
	}
	public jiao(point p1,point p2,point p3){
		l1=new line();
		l2=new line();
		l1.setP1(p1);
		l1.setP2(p2);
		
		l2.setP1(p1);
		l2.setP2(p3);
	
		double s1=l1.meterL(),s2=l2.meterL(),s3=ThirdL();
		if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1)){
		}else{
			System.out.print("三角形构造非法");
		}
		
	}
	public jiao(){
		this(new point(0,0),new point(6,0),new point(0,8));	
	}
		
//			
//		}else if(l1.getP1()==l2.getP2()){
//			
//		}else if(l1.getP2()==l2.getP1()){
//			
//		}else if(l1.getP2()==l2.getP1()){
//			
//		}
//	}
	
	//求两点之间距离的函数
	public double diatance(point p1,point p2){
		return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
	}
	public double ThirdL(){
		if(l1.getP1()==l2.getP1()){
			return diatance(l1.getP2(), l2.getP2());
		}else if(l1.getP1()==l2.getP2()){
			return diatance(l1.getP2(), l2.getP1());
		}else if(l1.getP2()==l2.getP1()){
			return diatance(l1.getP1(), l2.getP2());
		}else if(l1.getP2()==l2.getP2()){
			return diatance(l1.getP1(), l2.getP1());
		}else{
			System.out.println("没有公共端点");
			return 0;
		}
	}
	
	public double perimeter(){
		double s1=l1.meterL(),s2=l2.meterL(),s3=ThirdL();
		System.out.println(s1+"  "+s2+"  "+s3);
		if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1)){
			return l1.meterL()+l2.meterL()+ThirdL();
		}else{
			System.out.println("s1="+s1+"   s2="+s2+"  s3="+s3);
			System.out.print("三角形构造非法");
			return 0;
		}
	}

}
