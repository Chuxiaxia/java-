package hm_day8.Test4;

public class Manager extends Person{
    public Manager() {
    }

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    public void eat() {
        System.out.println("工号：" + id + "，姓名：" + name + "，工资：" + salary + "，经理在吃🐟");
    }
    public void work() {
        System.out.println("工号：" + id + "，姓名：" + name + "，工资：" + salary + "，经理在工作，管理其他人。");
    }
}
