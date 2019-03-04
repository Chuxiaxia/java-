package hm_day7.hm_07_继承后特点_成员方法;
/*
    小结:
        就近原则:先找自己,子类没有找父类
 */
public class Demo {
    public static void main(String[] args) {
        Zi1 z1 = new Zi1();
        z1.test02(); //Zi1 test02
        z1.test01(); //Fu1 test03

        Zi2 z2 = new Zi2();
        z2.test03(); //Zi2 test03
    }
}

// ------------------成员方法重名(很少数)------------------
// 就近原则:先找自己,子类没有找父类
class Fu2{
    public void test03(){
        System.out.println("Fu2 test03");
    }
}

class Zi2 extends Fu2{
    public void test03(){
        System.out.println("Zi2 test03");
    }
}

// ------------------成员方法不重名(绝大部分)------------------
// 就近原则:先找自己,子类没有找父类
class Fu1{
    public void test01(){
        System.out.println("Fu1 teat01");
    }
}

class Zi1 extends Fu1{
    public void test02(){
        System.out.println("Zi1 test02");
    }
}
