package hm_day6.hm_09_成员变量和局部变量区别;
/*
shift + 回车: 另起一行
在类中的位置不同  重点
    成员变量：类中，方法外
    局部变量：方法中或者方法声明上(形式参数)

作用范围不一样  重点
    成员变量：类中
    局部变量：方法中

初始化值的不同  重点
    成员变量：有默认值
    局部变量：没有默认值。必须先定义，赋值，最后使用

在内存中的位置不同  了解
    成员变量：堆内存
    局部变量：栈内存

生命周期不同  了解
    成员变量：随着对象的创建而存在，随着对象的消失而消失
    局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
 */
public class demo {
    public int num;//成员变量
    public void run(int x) {

        int speed = 10; //局部变量
        System.out.println(speed);
        System.out.println(num);
        show();
    }
    public void show(){
        // System.out.println(speed); // 局部变量只能在本方法中使用
        System.out.println(num);
    }

}
