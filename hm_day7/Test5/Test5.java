package hm_day7.Test5;

public class Test5 {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.name = "马化腾";
        coder.age = 99;
        coder.eat();
        coder.sleep();
        coder.coding();
        System.out.println("=============");
        Teacher t = new Teacher();
        t.name = "马云";
        t.age = 99;
        t.eat();
        t.sleep();
        t.teach();
    }
}
