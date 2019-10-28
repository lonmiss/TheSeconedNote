package W1024work;

import ZhengW.point;

public class Jiao {
	private Xian x1;
	private Xian x2;
	public Xian getX1() {
		return x1;
	}
	public void setX1(Xian x1) {
		this.x1 = x1;
	}
	public Xian getX2() {
		return x2;
	}
	public void setX2(Xian x2) {
		this.x2 = x2;
	}
	public Jiao(){
		this.x1=new Xian(new Dian(0,0),new Dian(0,1));
		this.x2=new Xian(new Dian(0,0),new Dian(1,0));
	}
	public Jiao(Xian x1,Xian x2){
		this.x1=x1;
		this.x2=x2;
	}
	public double BianLength(Dian d1,Dian d2){
		return Math.sqrt((d1.getX()-d2.getX())*(d1.getX()-d2.getX())+(d1.getY()-d2.getY())*(d1.getY()-d2.getY()));
	}
	public double meter(){
		double cnt=0;
		double b1,b2,b3;
		if(  ((this.x1.getP2().getY()-this.x1.getP1().getY())/(this.x1.getP2().getX()-this.x1.getP1().getX())
				==
		((this.x2.getP2().getY()-this.x2.getP1().getY()))/(this.x2.getP2().getX()-this.x2.getP1().getX())
		)|| (
				this.x1.getP1().getX()==this.x2.getP1().getX()&&this.x1.getP1().getX()==this.x2.getP2().getX()&&
				this.x1.getP1().getX()==this.x2.getP2().getX()&&this.x1.getP2().getX()==this.x2.getP2().getX())
		||(
				this.x1.getP1().getY()==this.x2.getP1().getY()&&this.x1.getP1().getY()==this.x2.getP2().getY()&&
				this.x1.getP1().getY()==this.x2.getP2().getY()&&this.x1.getP2().getY()==this.x2.getP2().getY())
		)
		{
			System.out.println("不满足条件构成三角形的条件：具有共同端点且不在同一直线上");
			
		}else{
			if(x1.getP1()==x2.getP1()){
				b1=this.BianLength(x1.getP1(), x1.getP2());
				b2=this.BianLength(x2.getP1(), x2.getP2());
				
				b3=this.BianLength(x1.getP2(),x2.getP2());
				
				cnt=b1+b2+b3;
				System.out.println(b1+"  "+b2+"   "+b3);
				
			}else if(x1.getP1()==x2.getP2()){
				b1=this.BianLength(x1.getP1(), x1.getP2());
				b2=this.BianLength(x2.getP1(), x2.getP2());
				
				b3=this.BianLength(x1.getP2(),x2.getP1());
				cnt=b1+b2+b3;
				System.out.println(b1+"  "+b2+"   "+b3);
				
			}else if(x1.getP2()==x2.getP1()){
				b1=this.BianLength(x1.getP1(), x1.getP2());
				b2=this.BianLength(x2.getP1(), x2.getP2());
				
				b3=this.BianLength(x1.getP1(),x2.getP2());
				cnt=b1+b2+b3;
				System.out.println(b1+"  "+b2+"   "+b3);
				
			}else if(x1.getP2()==x2.getP2()){
				b1=this.BianLength(x1.getP1(), x1.getP2());
				b2=this.BianLength(x2.getP1(), x2.getP2());
				
				b3=this.BianLength(x1.getP1(),x2.getP1());
				cnt=b1+b2+b3;
				System.out.println(b1+"  "+b2+"   "+b3);
			}
		}
		
		return cnt;
	}
	
	
	
	
}
