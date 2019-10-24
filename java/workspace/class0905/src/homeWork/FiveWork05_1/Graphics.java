package homeWork.FiveWork05_1;

public abstract class Graphics {
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
}
