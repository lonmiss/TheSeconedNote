package homeWork.FourWork04_2;

public class Triangle {
    private Segment First_S;
    private Segment Second_S;
    public Triangle(){};
    public Triangle(Segment s1,Segment s2){
        First_S=s1;
        Second_S=s2;
    }
    public void setFirst_S(Segment first_S) {
        First_S = first_S;
    }

    public void setSecond_S(Segment second_S) {
        Second_S = second_S;
    }

    public Segment getFirst_S() {
        return First_S;
    }

    public Segment getSecond_S() {
        return Second_S;
    }
    public double Thirh_S()
    {
        double s2_x;
        double s2_y;
        if(First_S.getFirst_p()==Second_S.getFirst_p()){
            s2_x=(First_S.getSecend_p().getX()-Second_S.getSecend_p().getX())*(First_S.getSecend_p().getX()-Second_S.getSecend_p().getX());
            s2_y=(First_S.getSecend_p().getY()-Second_S.getSecend_p().getY())*(First_S.getSecend_p().getY()-Second_S.getSecend_p().getY());
        }else if(First_S.getFirst_p()==Second_S.getSecend_p()){
            s2_x=(First_S.getSecend_p().getX()-Second_S.getFirst_p().getX())*(First_S.getSecend_p().getX()-Second_S.getFirst_p().getX());
            s2_y=(First_S.getSecend_p().getY()-Second_S.getFirst_p().getY())*(First_S.getSecend_p().getY()-Second_S.getFirst_p().getY());
        }else if(First_S.getSecend_p()==Second_S.getFirst_p()){
            s2_x=(First_S.getFirst_p().getX()-Second_S.getSecend_p().getX())*(First_S.getFirst_p().getX()-Second_S.getSecend_p().getX());
            s2_y=(First_S.getFirst_p().getY()-Second_S.getSecend_p().getY())*(First_S.getFirst_p().getY()-Second_S.getSecend_p().getY());
        }else{
            s2_x=(First_S.getFirst_p().getX()-Second_S.getFirst_p().getX())*(First_S.getFirst_p().getX()-Second_S.getFirst_p().getX());
            s2_y=(First_S.getFirst_p().getY()-Second_S.getFirst_p().getY())*(First_S.getFirst_p().getY()-Second_S.getFirst_p().getY());
        }
        return Math.sqrt(s2_x+s2_y);
    }
    public double Perimeter(){
        return First_S.Segment_length()+Second_S.Segment_length()+Thirh_S();
    }
}
