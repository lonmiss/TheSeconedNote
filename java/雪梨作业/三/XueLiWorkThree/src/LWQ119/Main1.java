package LWQ119;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle("green",true ,3.0);
		Rectangle r = new Rectangle("red",false,10.0,5.0);
		Square s = new Square("yellow",false,4.0);
		System.out.println(c.toString());
		System.out.println(r.toString());
		System.out.println(s.toString());
		Graph[] g=new Graph[6];
		g[0]=new Circle("green",true ,3.0);
		g[1]=new Circle("green",true ,4.0);
		g[2]=new Rectangle("red",false,1.0,6.0);
		g[3]=new Rectangle("blue",false,4.0,6.0);
		g[4]=new Square("yellow",true,4.0);
		g[5]=new Square("black",false,6.0);
		Graph max=g[0];
		for (int i = 1; i < g.length; i++) {
			if(g[i].compareTo(max)>0){
				max=g[i];			
			}
		}
		System.out.println("最大面积是："+max.Area()+"     "+max.toString());
//		System.out.println("长方形的周长 :  "+r.Perimeter());
//		System.out.println("长方形的面积 :  "+r.Area());
//		System.out.println("长方形的颜色 :  "+r.getColor());
//		System.out.println("长方形的是否填充: "+r.getStuff());
//		System.out.println("长方形的长和宽: "+r.getLength()+r.getWidth()+"\n");		
		
//		
//		System.out.println("圆的周长 :  "+c.Perimeter());
//		System.out.println("圆的面积 :  "+c.Area());
//		System.out.println("圆的颜色 :  "+c.getColor());
//		System.out.println("圆的是否填充: "+c.getStuff());
//		System.out.println("圆的半径: "+c.getRadius()+"\n");

	
		
//		System.out.println("正方形的周长 :  "+s.Perimeter());
//		System.out.println("正方形的面积 :  "+s.Area());
//		System.out.println("正方形的颜色 :  "+s.getColor());
//		System.out.println("正方形的是否填充: "+s.getStuff());
//		System.out.println("正方形的边长: "+s.getSide()+"\n");
		
//		Graph[] g=new Graph[9];
//		for(int i=0;i<3;i++){
//			Circle c1=new Circle();
//			g[i]=c1;
//		}
//		for(int i=3;i<6;i++){
//			Square s1=new Square();
//			g[i]=s1;
//		}
//		for(int i=6;i<9;i++){
//			Rectangle r1=new Rectangle();
//			g[i]=r1;
//		}
//		Graph max;
//		max=g[0];
//		for(int i=0;i<g.length;i++){
//			if(max.compareTo(g[i])==-1){
//				max=g[i];
//			}
//		}
//		System.out.println("最大图形面积为： "+max.Area());
	}

}
