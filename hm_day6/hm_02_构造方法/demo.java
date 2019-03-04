package hm_day6.hm_02_构造方法;
/*
    目标:能够理解构造方法的作用

    构造方法作用得到一个对象,并初始化对象的内容
    构造方法的格式:
        修饰符 类名() {
        }

    创建对象的格式:
        数据类型 变量名 = 初始化值;
        类名 对象名 = new 类名();

        Student s1 = new Student();
        new:表示在堆中申请一块空间,创建一个对象
        Student(); 执行构造方法

    小结:
        构造方法作用得到一个对象,并初始化对象的内容

        构造方法的格式:
            修饰符 类名() {
            }

        构造方法执行就会给成员变量设置默认值,默认初始化
 */
public class demo {
    public static void main(String[] args) {
        //类名 对象名 = new 类名();
        Student s1 = new Student();
        System.out.println(s1);
        s1.eat();
    }

}
