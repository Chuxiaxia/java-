package hm_day4;

/*
    方法重载：同一个类中存在多个名称相同的方法。

    方法重载的要求必须满足：2同1不同。
        1.同一个类中。
        2.方法名称必须相同。
        3.形参列表必须不同（形参列表不同指的是参数个数和参数类型或者参数顺序不同，不管参数名称的）

    方法重载的好处:
        只需要记住一个方法名,使用简单

    方法重载时会根据方法传入的参数来确定执行哪个方法.

    总结:是否时重载方法看2点:1.方法名相同,参数列表不同
 */
public class hm_06_方法重载 {
    public static void main(String[] args) {
        sendDD();
        sendDD("韩国");
        sendDD("越南");
        sendDD("美国", 100);
        sendDD(10.1,"德国");
        sendDD("m",1.1);
    }

    // 需求引入：假如我们现在需要开发一个军用系统的后台逻辑，我们需要设计一个发送导弹的功能.我们可以这样设计
    public static void sendDD() {
        System.out.println("发射1枚导弹给日本");
    }

    // 我们在定义一个发射导弹的功能,但是需要可以指定目的地
    public static void sendDD(String address) {
        System.out.println("发射1枚导弹给" + address);
    }

    // 我们在定义一个发射导弹的功能,但是还需要指定发射数量
    // 参数个数不同
    public static void sendDD(String address, int count) {
        System.out.println("发射" + count + "枚导弹给" + address);
    }
    // 参数类型不同
    public static void sendDD(String address, double count) {
        System.out.println("发射" + count + "枚导弹给" + address);
    }
    // 参数顺序不同
    public static void sendDD(double count, String address) {
        System.out.println("发射" + count + "枚导弹给" + address);
    }

    // 只看类型,不看变量名
    /*public static void sendDD(String abc) {
        System.out.println("发射1枚导弹给" + abc);
    }*/
}
