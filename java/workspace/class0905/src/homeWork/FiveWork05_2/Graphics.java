package homeWork.FiveWork05_2;

public abstract class Graphics implements Compere{
    private  String pen_color;
    private String Fill;

    public void setPen_color(String pen_color) {
        this.pen_color = pen_color;
    }

    public String getPen_color() {
        return pen_color;
    }

    public void setFill(String fill) {
        Fill = fill;
    }

    public String  getFill() {
        return Fill;
    }

    abstract public double Area();
    abstract public double perimeter();

    @Override
    public int compareTo(Graphics otherGraphics) {
        int cnt;
        if(this.Area()>otherGraphics.Area())
        {
            cnt=1;
        }else if(this.Area()==otherGraphics.Area()){
            cnt=0;
        }else{
            cnt=-1;
        }
        return cnt;
    }

}
