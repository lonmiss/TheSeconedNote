package homeWork.FiveWork05_1;

public class Main {
    public static void main(String[] args) {
        Graphics r1=new Rectangle(10.0,5.0,"red","No");
        Graphics c1=new Circle(3.0,"green","Yes");
        Graphics s1=new Square(4.0,"yellow","No");
        System.out.println(r1.toString());
        System.out.println(c1.toString());
        System.out.println(s1.toString());
    }
}
