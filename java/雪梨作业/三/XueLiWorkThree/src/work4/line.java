package work4;

public class line {
	private point p1;
	private point p2;
	public point getP1() {
		return p1;
	}
	public void setP1(point p1) {
		this.p1 = p1;
	}
	public point getP2() {
		return p2;
	}
	public void setP2(point p2) {
		this.p2 = p2;
	}
	public double meterL(){
		return Math.sqrt( ((p1.getX()-p2.getX())*(p1.getX()-p2.getX()))+((p1.getY()-p2.getY())*(p1.getY()-p2.getY())));
	}
	@Override
	public String toString() {
		return "line [p1=" + p1.getX()+p1.getY() + ", p2=" + p2.getX()+p2.getY() + "]";
	}
	
}
