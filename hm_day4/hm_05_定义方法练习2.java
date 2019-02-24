package hm_day4;

/*
        定义方法,计算1+2+3...+100的和,并返回求和的结果
            返回值类型: 1+2..+100结果是整数, int
            参数列表: 没有未知数据, ()
 */
public class hm_05_定义方法练习2 {

    public static int sum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        int s = sum();
        System.out.println(s);
    }
}
