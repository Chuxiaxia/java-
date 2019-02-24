package hm_day4;

public class hm_06_方法重载2 {
    public static void main(String[] args) {
        int x = add(10, 20);
        System.out.println(x);

        double y = add(3.1, 6.6);
        System.out.println(y);
    }

    // 定义2个int数求和
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    // 定义2个double数求和
    public static double add(double a, double b) {
        double c = a + b;
        return c;
    }
}
