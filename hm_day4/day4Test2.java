package hm_day4;

/*
    编写步骤：
        1. 定义getSum方法,参数为(int n),返回值为int类型
        2. 在getSum方法内定义求和变量sum
        3. 在getSum方法内使用for循环遍历获取1-n之间的所有整数,包括n
        4. 在for循环内将该数字与sum求和
        5. 在for循环结束后返回sum
        6. 在main方法中调用getSum方法,参数传入100,并使用变量a保存getSum方法的返回值
        7. 输出a的值
 */
public class day4Test2 {
    public static void main(String[] args) {
        int a = getSum(100);
        System.out.println("总和为：" + a);
    }

    public static int getSum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;

    }
}
