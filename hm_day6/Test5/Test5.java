package hm_day6.Test5;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Circle a = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        a.r = sc.nextDouble();
        a.showArea(a.r);
        a.showPerimeter(a.r);
    }
}
