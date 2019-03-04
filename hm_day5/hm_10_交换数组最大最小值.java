package hm_day5;
/*
    分析:
        1.找到最大值和最小值的位置
        2.交换

    实现步骤:
        1.定义变量保存最大值,和最小值
        2.定义变量保存最大值的位置,和最小值的位置
        3.循环遍历数组,找到最大值/最大值的位置, 最小值/最小值的位置
        4.交换最大值和最小值的位置
 */
public class hm_10_交换数组最大最小值 {
    public static void main(String[] args) {

        int [] arr = {20, 10, 150, 520, 25};
        //1.定义变量保存最大值,和最小值
        int max = arr[0];
        int min = arr[0];
        //2.定义变量保存最大值的位置,和最小值的位置
        int maxIndex = 0;
        int minIndex = 0;
        //3.循环遍历数组,找到最大值/最大值的位置, 最小值/最小值的位置
        for (int i=0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }else if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("较大值：" + max + "，索引：" + maxIndex);
        System.out.println("较小值：" + min + "，索引：" + minIndex);
        //4.交换最大值和最小值的位置
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        for (int num : arr){
            System.out.print(num + " ");
        }
    }

}
