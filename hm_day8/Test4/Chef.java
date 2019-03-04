package hm_day8.Test4;

public class Chef extends Person{
    public Chef() {
    }

    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }

    public void eat() {
        System.out.println("工号：" + id + "，姓名：" + name + "，工资：" + salary + "，厨师在吃🐖");
    }


    public void work() {
        System.out.println("工号：" + id + "，姓名：" + name + "，工资：" + salary + "，厨师在工作，炒菜");
    }
}
