package hm_day9.Test3;

public abstract class Person {
    private String name;
    private int age;
    public abstract void eat();

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher extends Person {

    @Override
    public void eat() {

    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}

class SportTeacher extends Teacher implements Sport{

    @Override
    public void playBasketball() {
        System.out.println("年龄为" +getAge() + "岁的" + getName() + "打🏀");
    }

    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }
}

class Student extends Person{

    @Override
    public void eat() {

    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
class SportStudent extends Student implements Sport{

    @Override
    public void playBasketball() {
        System.out.println("年龄为" +getAge() + "岁的" + getName() + "打🏀");
    }

    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }
}