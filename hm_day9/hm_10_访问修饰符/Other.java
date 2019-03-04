package hm_day9.hm_10_访问修饰符;

public class Other {
    public void test03(){
        //无关类需要创建对象
        Fu f = new Fu();
        f.methodPublic();
        f.methodProtected();
        f.methodDefault();
        //f.methodPrivate();
    }
}
