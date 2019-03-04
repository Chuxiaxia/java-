package hm_day5;

import java.util.Scanner;

public class day5Test10 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        // 1.创建一个Scanner类的对象用于接收键盘的输入。
        Scanner sc = new Scanner(System.in);
        // 2.根据用户选择对应的信息.
        for (int i = 0; i < arr.length; i++){
            System.out.print("请输入" + (i+1) + "个分数:");
            int tian = sc.nextInt();
            arr[i] = tian;
        }
        cj(arr);
    }

    public static void cj(int [] arr){
        //1.定义变量保存最大值,和最小值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        //2.循环遍历数组,找到最大值, 最小值
        for (int i=0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }else if (arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("去掉一个最高分：" + max + "\n去掉一个最低分：" + min + "\n最后总得分：" + avg);
    }
}
