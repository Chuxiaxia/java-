package hm_day4;

public class hm_01_调用方法3 {
    public static void main(String[] args) {
        System.out.println(sum(10,30));
        int c = sum(2,3);
        System.out.println(c + 5);
    }

    /**  
         方法的修饰符是：public static   
         返回值类型是 int   
         方法名称是：sum  
         方法的形参列表是：int a , int b 代表接收两个数据来求和  
         方法因为申明了返回值类型int ,所以方法体中必须写return语句。
     */

    public static int sum(int a, int b) {
        int c = a + b;
        /**
            如果方法有返回值类型申明，那么方法体重就必须有return语句 ，
            将方法执行后的结果带 给调用者，方法执行到`return` ，整体方
            法运行结束，return 结果;
            这里的"结果"在开发中， 我们正确的叫法成为方法的返回值
         */
        return c;
    }
}
