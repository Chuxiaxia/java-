package hm_day8.hm_13_接口练习;

public class Demo {
    public static void main(String[] args) {
        //创建学生
        Student s = new Student("ajl", 23);
        s.eat();
        s.smoking();
        s.study();
        System.out.println("--------");
        //创建老师
        Teacher t = new Teacher("c",33);
        t.eat();
        t.swimming();
        t.teach();
        System.out.println("--------");
        //创建工人
        Worker w = new Worker("狗蛋", 22);
        w.eat();
        w.smoking();
        w.banZhuan();
        System.out.println("--------");
        //创建司机
        Driver d = new Driver("ty" , 16);
        d.eat();
        d.swimming();
        d.driving();
    }
}
