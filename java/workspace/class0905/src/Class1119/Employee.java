package Class1119;

public class Employee {
    private int no;//工号
    private String name;//姓名
    private float height;//身高
    private float weight;//体重
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    /**
     * 体重（kg）÷身高2（m）
     * @return
     */
    double getBMI() {
        return this.weight/(this.height*this.height);
    }

    public void toString1() {
        System.out.println("Employee [no=" + no + ", name=" + name + ", height=" + height + ", weight=" + weight + "]");
    }

}