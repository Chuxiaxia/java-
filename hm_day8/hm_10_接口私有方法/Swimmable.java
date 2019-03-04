package hm_day8.hm_10_接口私有方法;

public interface Swimmable {
    private void show1(){
        System.out.println("接口私有方法show1");
    }
    public default void test01(){
        show1();
    }

    private static void show2(){
        System.out.println("接口私有方法show1");
    }

    public static void test02(){
        show2();
    }
}
