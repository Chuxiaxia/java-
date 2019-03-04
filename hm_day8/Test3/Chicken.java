package hm_day8.Test3;

public class Chicken extends Animal{
    public Chicken() {
    }

    public Chicken(String name, int age, String color) {
        super(name, age, color);
    }

    public void eat() {
        System.out.println(age + "岁的" + color + name + "在啄米米！");
    }
    public void jiao(){
        System.out.println(age + "岁的" + color + name + "在打鸣鸣！");
    }
}
