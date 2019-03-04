package hm_day7.hm_05_继承概述;
/*
目标:能够理解继承的作用

讲解:
    面向对象三大特性: 封装,继承,多态

    引入:没有继承时存在的问题

    继承的好处:
        提高代码的复用性

    extends关键字: 继承

    普通类的格式:
        class 类名 {
        }

    继承的格式:(重点)
        class 子类 extends 父类 {
        }

    和普通类相比多了: extends父类

小结:
    什么是Java中的继承:
        在现有的类基础定义新的类,现有类称为父类,新的类称为子类,子类会自动拥有父类的内容.
 */


public class Demo {
    public static void main(String[] args) {
        //创建Student
        Student s = new Student();
        s.name = "ajl";
        s.age = 21;
        s.eat();
        s.sleep();
        s.study();

        System.out.println("============");
        //创建Coder
        Coder c = new Coder();
        c.name = "mht";
        c.age = 45;
        c.salary = 1;
        c.eat();
        c.sleep();
        c.coding();

        System.out.println("============");
        //创建Teacher
        Teacher t = new Teacher();
        t.name = "my";
        t.age = 45;
        t.salary = 1;
        t.eat();
        t.sleep();
        t.teach();
    }

}
