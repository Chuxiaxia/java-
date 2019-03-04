package hm_day8.Test8;

public interface AA {

    void showA();
    private void show10(String str){
        for (int i = 0; i < 10; i++){
            System.out.print(str + " ");
        }
    }
    default void showB10(){
        show10("BBBB");
    }

    default void showC10(){
        show10("CCCC");
    }
}
