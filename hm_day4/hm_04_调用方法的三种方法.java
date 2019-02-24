package hm_day4;

/*
    方法调用方法的三种形式:
        1.直接调用: 方法名();  没有处理返回值
        2.赋值调用: 数据类型 变量名 = 方法名();  保存返回结果,可以操作返回的结果
        3.输出调用: System.out.println(方法名()); 可以打印返回值
 */
public class hm_04_调用方法的三种方法 {
    public static void main(String[] args) {
        // 1.直接调用: 方法名();  没有处理返回值
        getMax(1, 2);

        // 2.赋值调用: 数据类型 变量名 = 方法名();
        int m = getMax(1, 3);
        m += 3;
        System.out.println(m);

        // 3.输出调用: System.out.println(方法名()); 可以打印返回值
        System.out.println(getMax(10, 8));

        // 特殊情况: 返回值为void的只能直接调用
        test();
        // 以下不行:
//        void t = test();
//        System.out.println(test());
    }

    // 特殊情况
    public static void test() {
        int a = 10 + 2;
        System.out.println(a);
    }

    public static int getMax(int a, int b) {
        // 返回这两个整数的较大值
        int max = a > b ? a : b;
        return max;
    }
}
