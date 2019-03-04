package hm_day7.hm_02_封装优化1_this关键字;
/*
目标:能够理解this关键字的作用

讲解:
    当成员变量和局部变量重名了,会使用就近原则

    this关键字的作用: 用于区分局部变量和成员变量
        this.变量:代表成员变量

    this代表当前对象的引用
        谁调用方法,方法中的this就是谁

    this可以放的位置:
        成员方法,构造方法,不能放在静态方法

小结:
    this关键字作用?
        用于区分局部变量和成员变量
        this.变量:代表成员变量

 */
import hm_day7.hm_01_封装.Person;

public class demo {
    public static void main(String[] args) {
        //创建对象
        Person p1 = new Person();
        System.out.println("p1:" + p1);
        p1.setName( "Xey");
        p1.setAge(14);
        System.out.println(p1.getName() + p1.getAge());
    }
}
