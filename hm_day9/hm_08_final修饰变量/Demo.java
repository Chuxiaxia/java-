package hm_day9.hm_08_final修饰变量;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        a = 20;

        //final修饰变量只能使用一次 " = " 赋值
        final int b = 20;
        //b = 30

        Person p1 = new Person();
        p1 = new Person();
        //final修饰变量只能使用一次 " = " 赋值
        final Person p2 = new Person();
        //p2 = new Person();
        p2.age = 14;
        p2.age = 18;
    }
}
