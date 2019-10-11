package homeWork.TwoQuestion02_2;

public class MyPoint {
    private double x;
    private double y;
    private double z;
    public void setX(double x)
    {
        this.x=x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }
    public double distancefromPoint(MyPoint anotherPoint)
    {
        return Math.sqrt((x-anotherPoint.getX())*(x-anotherPoint.getX())+(y-anotherPoint.getY())*(y-anotherPoint.getY())+(z-anotherPoint.getZ())*(z-anotherPoint.getZ()));
    }
    public double distance(double anotherX, double anotherY, double anotherZ)
    {
        return Math.sqrt((x-anotherX)*(x-anotherX)+(y-anotherY)*(y-anotherY)+(z-anotherZ)*(z-anotherZ));
    }
}
