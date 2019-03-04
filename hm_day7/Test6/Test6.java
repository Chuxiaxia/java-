package hm_day7.Test6;

public class Test6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.age = 2;
        dog.eat();
        dog.lookHome();
        System.out.println("==========");
        Cat cat = new Cat();
        cat.name = "波斯猫";
        cat.age = 2;
        cat.eat();
        cat.catchMouse();
    }
}
