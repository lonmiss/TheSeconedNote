package homeWork6;

public class Employee {
    private static int cnt;

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Employee.cnt = cnt;
    }

    private String no;//����
    private String name;//����
    private float height;//���
    private float weight;//����
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
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
     * ���أ�kg�������2��m��
     */
    double getBMI() {
        return this.weight/(this.height*this.height);
    }
    public String toString() {
        return "Employee [no=" + no + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";
    }

}