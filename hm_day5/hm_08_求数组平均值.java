package hm_day5;

/*
    分析:
        平均值 = 总和 / 人数;

    实现步骤:
        1.定义数组,保存数据
        2.定义求和变量
        3.遍历数组,拿到每个分数,求和
        4.计算平均值:平均值 = 总和 / 人数;
 */
public class hm_08_求数组平均值 {
    public static void main(String[] args) {
        //1.定义数组,保存数据
        double[] scorse = {8,8.5,7,9,10,7};
        //2.定义求和变量
        double sum = 0;
        //3.遍历数组,拿到每个分数,求和
        for (double x : scorse){
            sum += x;
        }
        //4.计算平均值:平均值 = 总和 / 人数;
        double avg = sum / scorse.length;
        System.out.println(avg);
    }

}
