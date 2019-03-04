package hm_day8.hm_12_方法优先级;

public class Demo {
    public static void main(String[] args) {

    }
}

class Person{
    public void eat(){
        System.out.println("父类eat方法");
    }
}

interface Live{

    public default void eat(){
        System.out.println("接口默认eat方法");
    }
}
class Student extends Person implements Live{

}