package hm_day8.Test3;

public abstract class Animal {
    String name;
    int age;
    String color;
    abstract public void eat();

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
