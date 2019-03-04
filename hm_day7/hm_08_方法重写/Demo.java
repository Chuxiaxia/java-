package hm_day7.hm_08_方法重写;
/*
    回顾方法重载(overload):
        同一个类中,方法名相同,参数列表不同

    什么是方法重写/覆写/覆盖(override):
        当子类中的方法和父类中的方法"一模一样"

    什么时候使用方法重写:
        当子类的方法名称和父类一样,但是功能更加强大,子类就重写这个方法

    @Override // 注解,帮助我们检测方法是否是重写方法

    方法重写注意事项: (理解)
        1.方法名要相同
        2.参数列表要相同
        3.返回值类型要相同
        4.子类的权限要大于等于父类的权限

    重写方法,就是方法声明相同

    Java中有四大权限: public > protected > 默认的 > private

    @Override: 帮助我们检测方法是否是重写方法
 */
public class Demo {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.call();
        np.callDisplay();
    }
}


