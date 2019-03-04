package hm_day8.Test5;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }

    public void work() {

    }
}

class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println("工号：" + getId() + "的维护专员" + getName() + "在解决不能共享屏幕问题！");
    }
}

class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    public void work() {
        System.out.println("工号：" + getId() + "的采购专员" + getName() + "在采购音响设备！");
    }
}