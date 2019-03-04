package hm_day8.hm_01_抽象类;

public class Cook extends Emplogee{
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "厨师炒菜多加盐！");
    }
}
