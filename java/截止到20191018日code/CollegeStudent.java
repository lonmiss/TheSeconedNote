
public class CollegeStudent extends Student {
	private String major;
	
	public CollegeStudent(){
		//1、初始化继承自基类的属性，调用基类的构造方法
		super("zhangsan");
		//2、初始化新增的属性
		major = "Math";
	}
	
	
	
	public void print(){
		super.print();
		System.out.println("Major:"+major);
	}
	
	public void set(String aname,String ano, String am){
		name = aname;
		this.setNo(ano);
		this.major = am;
	}
	
	
	public void setMajor(String am){
		major = am;
	}
	public String getMajor(){
		return major;
	}

}
