package hm_day8.hm_02_抽象类模板设计;

public abstract class Driver {
    public void Driving(){
        System.out.println("开门");
        System.out.println("点火");

        //新老司机方式不一样
        woFXP();

        System.out.println("刹车");
        System.out.println("熄火");
    }
    public abstract void woFXP();
}
