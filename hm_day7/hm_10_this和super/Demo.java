package hm_day7.hm_10_this和super;
/*

    this.成员变量       找本类的成员变量
    super.成员变量      找父类的成员变量

    this.方法名();     找本类的成员方法
    super.方法名();    找父类的成员方法

    super();            找父类的构造方法
    this();             找本类其他构造方法(不多)

    注意:
        super()只能放在构造方法第一行
        this()只能放在构造方法第一行

    构造方法第一行到底放什么?
        默认放的是super();
        保证子类的构造方法能够直接或间接调用父类的构造方法即可
小结:
    this代表本类
    super代表父类
 */
public class Demo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.test();
    }
}
