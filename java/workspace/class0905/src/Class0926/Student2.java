package Class0926;

public class Student2 {
    private String no;
    private String name;
    private int score;
    public void study()
    {
        System.out.println(name+",要学习了~~~");
    }
    //public void setNo(Student this,String ano)//(原型)
    public void setNo(String no)
    {
        this.no=no;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setScore(int score)
    {
        this.score=score;
    }
    public String getNo()
    {
        return this.no;
    }
    public String getName()
    {
        return this.name;
    }
    public int getScore()
    {
        return this.score;
    }
    public void set1(Student2 s)
    {
        this.name=s.name;
        this.score=s.score;
        this.no=s.no;
    }
    public void set2(Student2 s)
    {
        this.setName(s.getName());
        this.setScore(s.getScore());
        this.setNo(s.getNo());
    }
}
