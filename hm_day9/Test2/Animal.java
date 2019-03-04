package hm_day9.Test2;

public abstract class Animal {
    private String name;
    private String weight;
    public abstract void eat();

    public Animal() {
    }

    public Animal(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println(getName() + "吃🐟");
    }
    public void catchMouse(){
        System.out.println(getName() + "努力抓老鼠！");
    }

    public Cat() {
    }

    public Cat(String name, String weight) {
        super(name, weight);
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }
    public void lookHome(){
        System.out.println(getName() + "老实看家！");
    }

    public Dog() {
    }

    public Dog(String name, String weight) {
        super(name, weight);
    }
}