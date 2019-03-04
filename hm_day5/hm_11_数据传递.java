package hm_day5;

public class hm_11_数据传递 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 实参(实际参数),调用方法时传递的参数,有具体值
//        test(10, 20);
        test(a, b); // 调用方法时,如果基本数据类型传递具体的值(值传递)

        int[] arr = new int[] {11, 22, 33};
        test2(arr); // 调用方法时,如果是数组传递地址(引用传递)
    }
    public static void test2(int[] xyz) {
        System.out.println(xyz);
    }

    // 形参(形式参数),定义方法时,参数列表中的变量就是形参,没有具体值
    public static void test(int x, int y) {
        System.out.println(x);
        System.out.println(y);
    }
}
