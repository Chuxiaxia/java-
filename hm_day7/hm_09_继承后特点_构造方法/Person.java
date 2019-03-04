package hm_day7.hm_09_继承后特点_构造方法;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("父类无参构造");
    }

    public Person(String name, int age) {
        System.out.println("父类有参构造");
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name + age + "吃饭饭");
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
