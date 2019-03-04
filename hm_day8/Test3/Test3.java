package hm_day8.Test3;

public class Test3 {
    public static void main(String[] args) {
        Chicken c = new Chicken("🐓", 2, "red");
        c.eat();
        c.jiao();
        System.out.println("---------------------");
        Duck d = new Duck("🦆", 1, "blank");
        d.eat();
        d.swimming();
    }
}
