package hm_day8.Test7;

public interface A {
    void showA();
    default void showB(){
        System.out.println("BBBB");
    }
}
