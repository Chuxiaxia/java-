package hm_day7.Test10;

class Manager extends Employee{

    public Manager(String number, String name, double salary) {
        super(number, name, salary);
    }

    public void work(){

        System.out.println("工号：" + getNumber() + ",姓名：" + getName() + ",工资：" + getSalary() + ",的经理在管理其他人。");
    }

    public void eat(){

        System.out.println("工号：" + getNumber() + ",姓名：" + getName() + ",工资：" + getSalary() + ",的经理在吃鱼🐟。");
    }
}
