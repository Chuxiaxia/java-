package hm_day7.Test5;

public class Person {
    String name;
    int age;

    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name + "吃饭饭！");
    }

    public void sleep(){
        System.out.println(name + "睡觉觉!");
    }

}
