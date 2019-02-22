package hm_day3;

import java.util.Scanner;

public class hm_11_石头剪刀布 {

    public static void main(String[] args) {
        int count = 0;
        // 1.创建一个Scanner类的对象用于接收键盘的输入。
        Scanner sc = new Scanner(System.in);
        // 2.根据用户选择对应的信息.
        System.out.print("欢迎进入游戏系统!\n1.开始游戏.\n2.退出游戏.\n请选择：");
        int user = sc.nextInt();
        while (true) {
            switch (user) {
                case 1:
                    game();
                    count++;
                    System.out.println("当前对局总数："+count);
                    goon();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("输入错误，程序结束!");
                    System.exit(0);
            }
        }
    }

    private static void game() {

        System.out.println("------------");
        // 1.创建一个Scanner类的对象用于接收键盘的输入。
        Scanner sc = new Scanner(System.in);
        // 2.根据用户选择对应的信息.
        System.out.print("1.石头 2.剪刀 3.布\n选择你要出的类型：");
        int player = sc.nextInt();
        //电脑产生1-3随机数
        int computer = 1 + (int) (Math.random() * 3);
        System.out.println("玩家：" + player + " --- " + "电脑:" + computer);
        if (player == computer) {
            System.out.println("平局了！");

        } else if ((player == 1 && computer == 2) || (player == 2 && computer == 3) || (player == 3 && computer == 1)) {
            System.out.println("恭喜你！获胜了！");
        } else {
            System.out.println("很遗憾！电脑获胜！");
        }

    }

    private static void goon() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("是否继续游戏(y/n):");
        String user1 = sc1.nextLine();
        if (user1 == "y") {
            return;
        } else if (user1.equals("n")) {
            System.exit(0);
        }

    }
}
