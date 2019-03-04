package hm_day9.hm_03_引用数据类型转换;

public class Person {
    public void eat(){
        System.out.println("人吃饭");
    }
}

class Student extends Person{
    @Override
    public void eat() {
        System.out.println("学生色色发抖的吃饭");
    }

    public void study(){
        System.out.println("学生色色发抖的学习");
    }
}
