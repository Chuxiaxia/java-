package hm_day8.hm_01_抽象类;

public class Manager extends Emplogee{

    public Manager() {
    }

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("经理管理其他人！");
    }
}
