package hm_day4;

public class hm_01_调用方法 {
    public static void main(String[] args){
        sum();

    }

    /**  
        方法的修饰符是：public static   
        返回值类型是 void   
        方法名称是：sum  
        方法是无参数的  
        方法因为申明的是无返回值类型void ,所以方法体中不能写return语句。
     */
    private static void sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
}
