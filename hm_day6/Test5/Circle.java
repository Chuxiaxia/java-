package hm_day6.Test5;
/*
    属性：
        r：半径
    构造器：
        无参构造器
        有参构造器
    成员方法：
        showArea方法：打印圆形面积
        showPerimeter方法：打印圆形周长
 */
public class Circle {
    public double r;

    public Circle(){

    }
    public Circle(double r){
        r = r;
    }
    public void showArea(double r){
        double s = 3.14 * r * r;
        System.out.println("半径:" + r + ",面积:" + s );
    }
    public void showPerimeter(double r){
        double c = 2 * 3.14 * r;
        System.out.println("半径:" + r + ",周长:" + c );
    }
}
