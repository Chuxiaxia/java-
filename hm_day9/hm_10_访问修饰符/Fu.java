package hm_day9.hm_10_访问修饰符;

public class Fu {
    public void methodPublic(){}
    protected void methodProtected(){}
    void methodDefault(){}
    private void methodPrivate(){}

    public void test01(){
        methodPublic();
        methodProtected();
        methodDefault();
        methodPrivate();
    }
}
