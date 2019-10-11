package Class1008;

public class Student {
    private String no;
    private String name;
    private int score;

    public Student()
    {
        this("2018011702","李健",99);
//        no="2018011702";
//        name="李健";
//        score=99;
    }
    public Student(String no,String name,int score)
    {
        this.no=no;
        this.name=name;
        this.score=score;
    }
    //........
    public Student(Student s)
    {
        no=s.no;
        name=s.name;
        score=s.score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
