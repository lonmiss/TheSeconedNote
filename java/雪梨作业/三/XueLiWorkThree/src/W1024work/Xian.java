package W1024work;

public class Xian {
	private Dian p1;
	private Dian p2;
	public Dian getP1() {
		return p1;
	}
	public void setP1(Dian p1) {
		this.p1 = p1;
	}
	public Dian getP2() {
		return p2;
	}
	public void setP2(Dian p2) {
		this.p2 = p2;
	}
	public Xian(){
		this.p1=new Dian(0,0);
		this.p2=new Dian(0,1);
	}
	public Xian(Dian x1,Dian x2){
		this.p1=x1;
		this.p2=x2;
	}
}
