package hm_day8.hm_08_接口默认方法;

public interface Swimmable {
    //默认方法
    default void swimming(){
        System.out.println("接口的裸泳");
    }
}
