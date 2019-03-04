package hm_day8.hm_05_接口多实现;


public class Student implements Smoke,Swimming{
    public void smoking() {
        System.out.println("学生在厕所瑟瑟发抖的抽烟");
    }

    public void swimming() {
        System.out.println("学生在厕所游泳");
    }
}
