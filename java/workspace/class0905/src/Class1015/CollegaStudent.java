package Class1015;

public class CollegaStudent extends Student {
    private String major;

    //默认生成构造方法
    public CollegaStudent()
    {
        //1、初始化继承自基类的属性，由基类的构造方法进行初始化
        super();//默认代表自动化调用基类的调用方法
        //super("展示那","65");//显示调用有参的初始化方法
        //super只能访问非private方法
        //2、在堆自增的属性进行初始化
        major="本科";
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void set(String no,String name,int score,String major)
    {
        this.major=major;
        this.setName(name);
        this.setNo(no);
        this.setScore(score);
    }
    public void print(){
        System.out.println("no:"+super.getNo()+"   name:"+super.getName()+"   score:"+super.getScore()+"     major:"+major);
    }
}
