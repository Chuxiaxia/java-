package hm_day4;

 /*
        定义方法,比较两个整数是否相同，如何相等返回true,不相等返回false
            返回值类型: 结果可能是true/false, boolean
            参数列表: 哪两个整数比较不确定,(int a, int b)
  */

public class hm_05_定义方法练习3 {
    public static void main(String[] args) {
        boolean b = number(10,20);
        System.out.println(b);
    }

    public static boolean number(int a, int b){
        /*if (a == b) {
            return true;
        } else {
            return false;
        }*/
        // return a == b ? true : false;
        return a==b;
    }
}
