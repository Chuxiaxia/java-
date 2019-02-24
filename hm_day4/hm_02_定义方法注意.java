package hm_day4;

public class hm_02_定义方法注意 {
    /*
    定义方法的注意事项
        1.定义位置，类中方法外面。
        2.调用方法时写错方法名字。
        3.调用方法时写错了参数列表。
        4.返回值类型，必须要和 return 语句返回的类型相同，否则编译失败 。
        5.不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
     */

        public static void test02() {
            System.out.println("a");
        }
        public static void main(String[] args) {
            // 3.调用方法时写错了参数列表。
            // test01(10); 参数写少了
            // test01(10, 20, 30); 参数写多了
            // test01(10.1, 20.2); // 参数类型不对
            test01(10, 20);

            // tset02(); // 调用方法时写错方法名字
        }

        public static int test01(int x, int y) {
            System.out.println("a");
            // return 10.3;
            // return true;
            return 10; // 返回值类型，必须要和 return 语句返回的类型相同
            // System.out.println("aa"); // 不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
        }




}
