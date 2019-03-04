package hm_day9.hm_02_多态好处;

public class Person {
    public void eat(){
        System.out.println("人吃饭！");
    }
}

class Student extends Person{
    public void eat(){
        System.out.println("学生一边吃饭，一边学习");
    }
}

class Teacher extends Person{
    public void eat(){
        System.out.println("老师边吃饭边备课");
    }
}

class Worker extends Person{
    @Override
    public void eat() {
        System.out.println("工人边吃饭边抽烟");
    }
}