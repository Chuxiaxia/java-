package hm_day6.hm_08_static饰成员方法;
/*
    没有使用static修饰的方法称为对象方法

 */
public class Student {
    public String name;
    public static String schoolName;
    // 没有使用static修饰的方法称为对象方法(来的晚)
    // 同一个类中直接调用, 非静态方法既能调用静态的,也能调用非静态的
    public void eat(){
        System.out.println(name);
        System.out.println(schoolName);
        test3();
        test4();
        System.out.println("吃饭");
    }
    // 使用static修饰的方法称为类(来的早)
    // 同一个类中直接调用,静态方法只能调用静态内容
    public static void daka(){
        // System.out.println(name); // 静态方法不能使用非静态内容
        System.out.println(schoolName);
         //test3();
        test4();
        System.out.println("学生打卡");
    }

    public void test3(){

    }
    public static void test4(){

    }
}
