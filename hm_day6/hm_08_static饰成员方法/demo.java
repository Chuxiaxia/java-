package hm_day6.hm_08_static饰成员方法;
/*
目标:理解static修饰方法

static修饰方法格式:
    修饰符 static 返回值类型 方法名(参数列表) {
        方法体
        return 结果;
    }

    静态方法可以使用类名调用,也可以使用对象调用,推荐使用类名调用

    没有使用static修饰的方法称为对象方法
    使用static修饰的方法称为类
 */
public class demo {
    public static void main(String[] args) {
        show();
        //创建对象
        Student s1 = new Student();
        s1.eat();//普通方法使用对象调用

        //静态方法使用类.静态方法名();
        Student.daka();
        s1.daka();
    }
    public static void show(){

    }
}
