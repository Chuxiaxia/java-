package hm_day9.hm_02_多态好处;
/*
        使用多态: 父类 变量名 = new 子类();
        多态典型的应用场景:方法参数写父类,调用方法时可以传入任意子类
            提高代码的扩展性
        普通情况: 类名 对象名 = new 类名(); 只能接收一种类型.
        如果要接收多种类型,就需要写多个重载方法,代码冗余,扩展性差
*/
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        Worker w = new Worker();
        goEat(s);
        goEat(t);
        goEat(w);
    }

    public static void goEat(Person o){
        o.eat();
    }
}
