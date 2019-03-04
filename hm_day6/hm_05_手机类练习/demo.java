package hm_day6.hm_05_手机类练习;
/*
    目标:
    定义手机类并使用：
        属性:品牌,价格,颜色
        行为:打电话,发短信

    面向对象使用步骤:
        1.定义类
        2.创建对象
        3.使用对象
 */
public class demo {
    public static void main(String[] args) {
        Iphone p = new Iphone();
        p.name = "高贵iphone1000";
        p.price = 1;
        p.color = "骚气粉色";
        System.out.println(p.name);
        System.out.println(p.price);
        System.out.println(p.color);
        //使用成员方法
        p.call("Xey");
        p.sendMessage();
    }
}
