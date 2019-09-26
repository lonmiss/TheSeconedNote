package Class0924;

public class Student {
    private int no;
    private String name;
    private int score;
    public void setNo(int no){
        this.no=no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setScore(int score){
        this.score=score;
    }
    public int getNo()
    {
        return no ;
    }
    public String getName()
    {
        return name ;
    }
    public int getScore()
    {
        return this.score;
    }
    public void say()
    {
        System.out.println("My name is"+name+", My no is "+no+"My score is "+score);
    }
}
