package Class1017;

public class Student {
    private String no;
    private String name;
    private int score;

    public Student()
    {
        this("2018011702","zhangsan",23);
    }

    public Student(String no, String name, int score) {
        this.no=no;
        this.name=name;
        this.score=score;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public void print(){
        System.out.println("no:"+no+"   name:"+name+"   score:"+score);
    }
}
