package hm_day8.Test4;

public abstract class Person {
    String id;
    String name;
    double salary;

    public Person() {
    }

    public Person(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    abstract public void eat();
    abstract public void work();
}
