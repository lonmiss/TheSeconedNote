package homeWork.二.Question02_1;

public class Employee {
    private int id;
    private String name;
    private double height;
    private double weight;
    public void setterId(int id)
    {
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setterName(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setterHeight(double height)
    {
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setterWeight(double weight)
    {
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getBMI()
    {
        return this.weight/(this.height*this.height);
    }
    public void scan(int id,String name,double height,double weight)
    {
        setterId(id);
        setterName(name);
        setterHeight(height);
        setterWeight(weight);
    }
}
