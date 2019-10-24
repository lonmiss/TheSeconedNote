package ByMyself.today1020;

public class Initail {
    public static void main(String[] args) {
        Telphone tell=new CallPhone();
        tell.call();
        tell.message();

        Telphone tell1=new SmartPhone();
        tell1.message();
        tell1.call();
    }
}
