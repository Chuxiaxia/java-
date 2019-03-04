package hm_day7.Test10;

public class Chef extends Employee{
    public Chef(String number, String name, double salary) {
        super(number, name, salary);
    }
    public void work(){

        System.out.println("工号：" + getNumber() + ",姓名：" + getName() + ",工资：" + getSalary() + ",的厨师在做饭。");
    }

    public void eat(){

        System.out.println("工号：" + getNumber() + ",姓名：" + getName() + ",工资：" + getSalary() + ",的厨师在吃草。");
    }
}
