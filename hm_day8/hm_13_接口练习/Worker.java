package hm_day8.hm_13_接口练习;

public class Worker extends Person implements Smokeable {
    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    public void smoking(){
        System.out.println(getName() + "工人，边搬砖边抽烟！");
    }

    public void banZhuan(){
        System.out.println(getName() + "工人，老汉推车");
    }
}
