package hm_day8.Test9;

public class Test9 {
    public static void main(String[] args) {
        OldPhone o = new OldPhone();
        o.call();
        o.sendMessage();
        NewPhone n =new NewPhone();
        n.call();
        n.sendMessage();
        n.playGame();
    }
}
