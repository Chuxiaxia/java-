package hm_day7.hm_01_封装;

/*
目标:能够掌握类的封装

讲解:
    面向对象三大特性:封装,继承,多态

    1.介绍没有封装时的问题
    2.如何进行封装
    3.封装的好处

    人的属性:姓名,年龄,身高,性别,三维,银行密码,钱包
            人有很多属性,但是有些属性是隐私的,暴露出来不安全

    封装的原则:
        合理隐藏,合理暴露

    封装的2个步骤:
        1.将成员变量私有(private)
        2.提供getXxx/setXxx
            getXxx: 用于获取成员变量
            setXxx: 用于设置成员变量

    private使用格式:
        private 数据类型 变量名;

        private可以修饰成员变量和成员方法
        private表示只有本类能够访问

    封装的好处:
        提高代码的安全性

    通常类中的成员变量都会私有

小结:
    封装的2个步骤:
         1.将成员变量私有(private)
         2.提供getXxx/setXxx
            getXxx: 用于获取成员变量
            setXxx: 用于设置成员变量

    封装的好处:
        提高代码的安全性
 */
public class demo {
    public static void main(String[] args) {
        //创建对象
        Person p1 = new Person();
        p1.setName( "Xey");
        p1.setAge(14);
        System.out.println(p1.getName() + p1.getAge());
        p1.getAAA(11);
    }
}
