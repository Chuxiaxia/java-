package hm_day8.hm_03_抽象类的特点;


abstract class Fu{
    public abstract void test();
}
abstract class Fu2{

}
abstract class Fu3{
    public abstract void test1();
    public abstract void test2();
}
class Zi3 extends Fu3{

    public void test1() {
    }

    public void test2() {
    }
}

abstract class Zi4 extends Fu3{
    public void test1() {
    }
}

public class Demo {
}
