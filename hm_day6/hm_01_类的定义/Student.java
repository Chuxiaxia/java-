package hm_day6.hm_01_类的定义;
/*
    类中方法外:称为成员位置

    学生类:
        属性:姓名,年龄,身高
        行为:吃饭,睡觉,学习
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
