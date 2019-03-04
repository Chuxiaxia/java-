package hm_day7.Test3;

public class Test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.setContent("java面向对象知识..");
        System.out.print("年龄为" + t.getAge() + "的" + t.getName() + "正在");
        t.eat();
        System.out.print("年龄为" + t.getAge() + "的" + t.getName() + "正在");
        t.teach();
    }
}
