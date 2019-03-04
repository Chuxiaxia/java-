package hm_day5;
/*
    定义数组保存学生的考试成绩:[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。统计高于平均分的分数有多少个。
 */
public class day5Test5 {
    public static void main(String[] args) {
        //1. 在main方法中定义int类型数组arr,保存学生的考试成绩[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        //8. 在main方法中调用getAvg方法参数为arr数组,计算arr数组的平均分.定义int变量avg保存getAvg方法的返回值
        int avg = getAvg(arr);
        //9. 在main方法中定义计数器变量count
        int count = 0;
        //10. 在main方法中遍历arr数组
        for (int i : arr){
            //11. 如果arr数组的元素大于平均分,计数器count+1
            if (i > avg){
                count += 1 ;
            }
        }
        //12. 按格式要求输出count变量
        System.out.println("高于平均分:" + avg + "的有" + count + "个");
    }
    // 2. 定义getAvg方法,参数列表为(int[] arr),返回值类型为int. getAvg方法的功能是计算参数arr数组的平均值 并返回
    public static int getAvg(int[] arr){
        //3. 在getAvg方法中定义求和变量sum
        int sum = 0;
        //4. 在getAvg方法中使用for循环遍历arr数组
        for (int x : arr){
            //5. 将arr数组的元素值添加到sum中
            sum += x;
        }
        //6. 计算平均分, 平均分 = 总分 / 人数
        int avg = sum / arr.length;
        //7. 返回平均分
        return avg;
    }
}
