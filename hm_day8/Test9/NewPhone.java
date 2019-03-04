package hm_day8.Test9;

public class NewPhone extends OldPhone implements Play{

    public void call() {
        System.out.println("新手机打电话");
    }

    public void sendMessage() {
        System.out.println("新手机发短信");
    }

    public void playGame() {
        System.out.println("新手机打游戏");
    }
}
