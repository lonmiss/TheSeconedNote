package Class1114;

public class Main {
    public static void fun1() throws NullPointerException{
        //throws后边写的是检查类型的异常
        int a=0;
        if(a>5){
            //throws后跟异常类型的对象，代表当前行抛出这种类型的异常
            throw new NullPointerException();
        }
    }
    public static void main(String[] args) {
        //System.out.println(fun1());
    }
}
