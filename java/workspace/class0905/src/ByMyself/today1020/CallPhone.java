package ByMyself.today1020;

public class CallPhone extends Telphone {
    @Override
    public void call() {
        System.out.println("通过键盘来打电话");
    }

    @Override
    public void message() {
        System.out.println("通过键盘来发短信");
    }
}
