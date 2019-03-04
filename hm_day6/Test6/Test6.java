package hm_day6.Test6;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Manager boss = new Manager();
        Scanner sc = new Scanner(System.in);
        boss.name = "初夏";
        boss.number = 2019227;
        boss.intro();
        System.out.println("请输入发放工资:");
        boss.salary = sc.nextInt();
        System.out.println("请输入发放奖金:");
        boss.bonus = sc.nextInt();
        boss.showSalary(boss.salary,boss.bonus);
        System.out.println("获得总工资：" + (boss.salary + boss.bonus));
        boss.work();

        System.out.println("==============");
        Coder coder = new Coder();
        coder.name1 = "蚊子";
        coder.number1 = 222222;
        coder.intro1();
        System.out.println("请输入发放工资:");
        coder.salary1 = sc.nextDouble();
        coder.showSalary1(coder.salary1);
        coder.work1();
    }
}
