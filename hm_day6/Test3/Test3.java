package hm_day6.Test3;

public class Test3 {
    public static void main(String[] args) {
        Teacher t =new Teacher();
        t.name = "张老师";
        t.age = 30;
        t.content = "java面向对象";
        System.out.print("年龄为" + t.age + "的" + t.name + "正在");
        t.eat();
        System.out.print("年龄为" + t.age + "的" + t.name + "正");
        Teacher.study();
        t.teach();
    }
}
