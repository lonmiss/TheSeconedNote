
public class Student {
	private String no;
	protected String name;
	private int score;
	
	public void print(){
		System.out.println("name:"+name);
		System.out.println("no:"+no);
		System.out.println("score:"+score);
	}
	
	public Student(){
		this("zhangsan","2018001",80);
//		no = "2018001";
//		name = "zhangsan";
//		score = 80;
	}
	public Student(String aname,String ano, int ascore){
		no = ano;
		name = aname;
		score = ascore;
	}
	
	
	
	public Student(Student s){
		no = s.no;
		name = s.name;
		score = s.score;
	}
	
	public Student(String aname){
		name = aname;
	}
	
	public Student(String aname,String ano){
		no = ano;
		name = aname;
	}
	
	
	
	
	
	public void set(Student as){
		setNo(as.no);
		setName(as.getName());
		score = as.score;
	}
	
	public void set(String ano){
		no = ano;
	}
	
	public void set(String ano, String aname){
		no = ano;
		name = aname;
	}

	public void setName(String aname){
		name = aname;
	}
	
	public String getName(){
		return name;
	}
	
	//public void setNo(Student this, String ano)
	public void setNo(String ano){
		this.no = ano;
	}
	
	public String getNo(){
		return no;
	}


}
