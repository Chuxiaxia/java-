package hm_day7.Test10;

public class Test10 {
    public static void main(String[] args) {
        Manager m = new Manager("m001","老王",10000.0);
        m.work();
        m.eat();
        Chef c = new Chef("c001","小王",100.0);
        c.work();
        c.eat();

    }
}
