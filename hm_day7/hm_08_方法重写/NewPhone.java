package hm_day7.hm_08_方法重写;

public class NewPhone extends OldPhone{
    //子类使用父类打电话
    //子类来电显示比父类功能多
    //注解,帮助我们检测方法是否是重写方法
    @Override
    public void callDisplay(){
        super.callDisplay();
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }
}
