package hm_day9.hm_06_代码块扩展;

public class Person {
    static {
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类构造代码块");
    }
    public  Person(){
        System.out.println("父类构造方法");
    }
}

class Student extends Person{
    static {
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类构造代码块");
    }
    public  Student(){
        System.out.println("子类构造方法");
    }
}
