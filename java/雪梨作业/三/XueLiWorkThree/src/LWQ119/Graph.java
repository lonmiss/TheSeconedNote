package LWQ119;

import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.RelationshipReferenceDocument;

public abstract class Graph implements Compere{
	private String color;
	private boolean stuff;
	
	public Graph() {}
	public Graph(String color,boolean stuff) {
		this.color = color;
		this.stuff = stuff;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color ;
	}
	
	public boolean getStuff() {
		return stuff;
	}
	public void setStuff(boolean stuff) {
		this.stuff = stuff;
	}
	
	
	public abstract double Area();
	public abstract double Perimeter();
	
	public int compareTo(Graph a){
		if(this.Area()>a.Area()){
			return 1;
		}else if(this.Area()<a.Area()){
			return -1;
		}else{
			return 0;
		}
	}
		
		
}