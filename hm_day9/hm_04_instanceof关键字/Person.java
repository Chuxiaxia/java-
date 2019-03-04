package hm_day9.hm_04_instanceof关键字;

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
class Teacher extends Person{
    @Override
    public void eat() {
        System.out.println("老师努力吃饭");
    }
    public void teach(){
        System.out.println("老师努力教学");
    }
}

