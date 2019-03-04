package hm_day6.hm_02_构造方法;
/*
    学生类:
        属性(名吃):姓名,年龄,身高
        行为(动词):吃饭,睡觉,学习
 */
public class Student {
    public String name;
    public int age;
    public double height;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
