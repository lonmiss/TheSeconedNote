package homeWork.FourWork04_3;

public class Segment {
    private Point First_p ;
    private Point Secend_p;
    public Segment(){};
    public Segment(Point p1,Point p2){
        First_p=p1;
        Secend_p=p2;
    };
    public void setFirst_p(Point first_p) {
        First_p = first_p;
    }

    public void setSecend_p(Point secend_p) {
        Secend_p = secend_p;
    }

    public Point getFirst_p() {
        return First_p;
    }

    public Point getSecend_p() {
        return Secend_p;
    }

    public double Segment_length()
    {
        double x=(First_p.getX()-Secend_p.getX())*(First_p.getX()-Secend_p.getX());
        double y=(Secend_p.getY()-First_p.getY())*((Secend_p.getY()-First_p.getY()));
        return Math.sqrt(x+y);
    }
}
