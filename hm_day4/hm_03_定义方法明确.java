package hm_day4;

public class hm_03_定义方法明确 {
    public static void main(String[] args) {
        int m = getMax(10, 30);
        System.out.println(m);
    }

    /*
        需求：定义方法,随便给你两个整数，请帮我返回这两个整数的较大值。
            明确方法的2个明确:
                返回值类型(就是结果的类型):结果是较大值(整数), int
                参数列表(未知数据): 这两个整数不确定, (int a, int b)
     */
    public static int getMax(int a, int b) {
        // 返回这两个整数的较大值
        int max = a > b ? a : b;
        return max;
    }
}
