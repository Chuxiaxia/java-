package hm_day6.hm_03_创建对象并使用;
/*
目标:掌握对象的使用

使用对象
    使用成员变量(你的姓名)
        对象名.变量名

    使用成员方法
        对象名.方法名();

小结:
    面向对象使用步骤:
        1.定义类
        2.创建对象
        3.使用对象
 */
public class demo {
    public static void main(String[] args) {
        // 2.创建对象: 类名 对象名 = new 类名();
        Student s1 = new Student();
        // 3.使用对象
        // 使用成员变量: 对象名.变量名
        s1.name = "Xey";
        s1.age = 14;
        s1.height = 1.60;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);

        // 使用成员方法
        s1.eat();
        s1.sleep();
        s1.study();
    }
}
