package ByMyself.today1020;

public class SmartPhone extends Telphone {
    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void message() {
        System.out.println("通过语音发短信");
    }
}
