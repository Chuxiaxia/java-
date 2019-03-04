package hm_day8.hm_01_抽象类;

public class Demo {
    public static void main(String[] args) {
        //ctrl+q  看方法参数
        Manager m = new Manager("j1001","老王",9999);
        m.work();
        Cook c = new Cook("c1001","小王",1);
        c.work();
    }

}
