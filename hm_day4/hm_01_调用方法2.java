package hm_day4;

public class hm_01_调用方法2 {
    public static void main(String[] args) {
        sum(10,30);

        int i = 1;
        int j = 2;
        sum(i,j);
    }

    /**  方法的修饰符是：public static   
          返回值类型是 void   
          方法名称是：sum  
          方法的形参列表是：int a , int b 代表接收两个数据来求和  
          方法因为申明的是无返回值类型void ,所以方法体中不能写return语句。 */

    public static void sum(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }
}
