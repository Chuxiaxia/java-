package hm_day6.hm_06_对象内存;

import hm_day6.hm_05_手机类练习.Iphone;

/*
    不同包里面的类需要导包,就是告诉Java去哪里找这个类

    目标:理解两个对象内存图

 */
public class Demo1 {
    public static void main(String[] args) {
        Iphone p1 = new Iphone();
        p1.name = "小米8";
        p1.price = 2 ;
        p1.color = "全息幻彩骚粉";
        System.out.println(p1.name);
        System.out.println(p1.price);
        System.out.println(p1.color);
        p1.call("Xey");
        p1.sendMessage();
    }

}
