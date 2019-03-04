package hm_day7.hm_11_继承的特点;

/*
目标:能够理解继承的特点

讲解: 和我们现实生活是一模一样
    1.Java中的类只能单继承(一个类只能有一个父类)
    2.一个类可以有多个子类
    3.可以多层继承(父类,子类,孙子)

    注意:
        子类和父类是相对的概念
        一个类不写父类,默认继承Object
 */
public class Demo {
    public static void main(String[] args) {

    }
}

//一个类不写父类，默认继承Object
class Fu1 extends Object{
}
//class Fu1{}
class Fu2{}

//1.Java中的类只能单继承（一个类只能有一个父类
class Fu3 extends Fu1{
}
//class Fu3 extends Fu1,Fu2{}

//2.一个类可以有多个子类
class Fu4 extends Fu1{}
class Fu5 extends Fu1{}

//3.可以多层继承（父类，子类，孙子
class Sun extends Fu3{}