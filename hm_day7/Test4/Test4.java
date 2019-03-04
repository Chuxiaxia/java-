package hm_day7.Test4;

public class Test4 {
    public static void main(String[] args) {
        Card card = new Card("♠","A");
        card.setHs("♥");
        card.setDs("A");
        System.out.println("牌面信息：" + card.getHs() + card.getDs());
        card.showCard();
    }
}
