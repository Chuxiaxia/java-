package hm_day8.hm_13_接口练习;

public class Driver extends Person implements Swimmable{
    public Driver() {
    }

    public Driver(String name, int age) {
        super(name, age);
    }

    public void swimming(){
        System.out.println(getName() + "司机，一边游泳一边开车");
    }
    public void driving(){
        System.out.println(getName() + "司机， 单手过弯");
    }
}
