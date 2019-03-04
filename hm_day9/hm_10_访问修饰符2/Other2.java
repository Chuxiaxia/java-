package hm_day9.hm_10_访问修饰符2;

import hm_day9.hm_10_访问修饰符.Fu;

public class Other2 {
    public void test05(){
        Fu f = new Fu();
        f.methodPublic();
        //f.methodProtected();
        //f.methodDefault();
        //f.methodPrivate();
    }
}
