package hm_day4;

import java.util.Scanner;

public class day4Test9 {
    public static void main(String[] args) {
        // 1.创建一个Scanner类的对象用于接收键盘的输入。
        Scanner sc = new Scanner(System.in);
        // 2.根据用户选择对应的信息.
        System.out.println("欢迎进入算术系统!");
        System.out.println("----------------");
        System.out.println("1.查看九九乘法表. \n2.退出系统. \n请选择：");
        int look = sc.nextInt();
        switch (look){
            case 1:
                System.out.println("----------------");
                num(9);
            case 2:
                System.exit(0);
            default:
                System.out.println("输入错误，程序结束!");
                System.exit(0);
        }

    }

    public static void num(int n){
        for(int i = 1; i <=n; i++) {
            // 外循环控制行
            for (int j = 1; j <= i; j++) {
                // 内循环控制列
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            // 再换行
            System.out.println();
        }
    }
}
