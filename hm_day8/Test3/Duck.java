package hm_day8.Test3;

public class Duck extends Animal{
    public Duck() {
    }

    public Duck(String name, int age, String color) {
        super(name, age, color);
    }

    public void eat() {
        System.out.println(age + "岁的" + color + name + "在吃饭饭！");
    }
    public void swimming(){
        System.out.println(age + "岁的" + color + name + "在游泳泳！");
    }
}
