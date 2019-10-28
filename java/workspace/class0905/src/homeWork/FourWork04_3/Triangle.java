package homeWork.FourWork04_3;

public class Triangle {
    private Segment First_S;
    private Segment Second_S;

    public Triangle(){
        this.First_S=new Segment(new Point(0,0),new Point(0,3));
        this.Second_S=new Segment(new Point(0,0),new Point(4,0));
    };

    public Triangle(Segment s1,Segment s2){
        First_S=s1;
        Second_S=s2;
        double s11=First_S.Segment_length();
        double s21=Second_S.Segment_length();
        double s31=this.Thirh_S();
        //System.out.println("s11:"+s11+" s21:"+s21+" s31:"+s31);
        if((Math.abs(s11-s21)>s31)&&(Math.abs(s11-s31)>s21)&&(Math.abs(s21-s31)>s11)){
        }else if((s1.getFirst_p()==s2.getFirst_p())||(s1.getSecend_p()==s2.getFirst_p())){
        }else{
            System.out.println("三角形构建不合法");
        }
    }
    public Triangle(Point p1,Point p2,Point p3) {
        First_S=new Segment(p1,p2);
        Second_S=new Segment(p1,p3);
        double s11=First_S.Segment_length();
        double s21=Second_S.Segment_length();
        double s31=this.Thirh_S();
        //System.out.println(s11+"    "+s21+"     "+s31);
        if((Math.abs(s11+s21)>s31)&&(Math.abs(s11+s31)>s21)&&(Math.abs(s21+s31)>s11)){
        }else if((p1.getX()==p2.getX()&&p1.getX()==p3.getX())||(p1.getY()==p2.getY()&&p1.getY()==p3.getY())) {
            System.out.println("三角形构建不合法");
        }else{
            System.out.println("三角形构建不合法");
        }
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
