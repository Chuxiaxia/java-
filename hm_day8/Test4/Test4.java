package hm_day8.Test4;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("===============================================================");
        Manager m = new Manager("m110", "老王", 10000.0);
        m.eat();
        m.work();
        System.out.println("---------------------------------------------------------------");
        Chef c = new Chef("c110", "小王", 6666);
        c.eat();
        c.work();
        System.out.println("===============================================================");
    }
}
