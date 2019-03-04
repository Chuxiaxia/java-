package hm_day8.hm_11_接口多实现静态方法;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        Swimmable.test();
        Smokeable.test();
    }
}
