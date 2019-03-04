package hm_day8.hm_13_接口练习;

public class Student extends Person implements Smokeable{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void smoking(){
        System.out.println(getName() + "学生在厕所,瑟瑟发抖的抽烟！");
    }
    public void study(){
        System.out.println(getName() + "学生在厕所，边抽烟边学习！");
    }
}
