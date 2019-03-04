package hm_day8.hm_13_接口练习;

public class Teacher extends Person implements Swimmable{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void swimming(){
        System.out.println(getName() + "老师,自由泳...");
    }

    public void teach(){
        System.out.println(getName() + "老师,瑟瑟发抖上课");
    }
}
