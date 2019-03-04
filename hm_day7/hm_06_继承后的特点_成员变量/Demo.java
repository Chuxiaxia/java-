package hm_day7.hm_06_继承后的特点_成员变量;
/*
    小结:
        就近原则:先找自己,子类没有找父类
*/
public class Demo {
    public static void main(String[] args) {
        Zi1 z1 = new Zi1();
        System.out.println(z1.num2);
        System.out.println(z1.num1);

        Zi2 z2 = new Zi2();
        System.out.println(z2.num3);
    }
}

/*
    之前一个Java文件写一个类,其实一个Java文件可以写多个类,
        但是只有一个类是public的,而且public的类名要和文件名一样
    工作中不要这么干.
*/

//成员变量重名
//就近原则：先找自己，子类没有找父类
class Fu2{
    int num3 = 30;
}

class Zi2 extends Fu2{
    int num3 = 500;
}
//成员变量不重名
//就近原则：先找自己，子类没有找父类
class Fu1{
    int num1 = 10;
}

class Zi1 extends Fu1{
    int num2 = 20;
}
