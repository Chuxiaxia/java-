package hm_day6.hm_04_构造方法的特点;
/*
构造方法的特点:
    1.构造方法没有返回值,连void都不能写
    2.构造方法名和类名一样的
    3.如果一个类不写构造方法,系统会默认赠送一个无参构造
    4.当我们写了构造方法后,就没有默认的构造方法
    5.构造方法可以重载
 */
public class demo {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Xey";
        s1.age = 14;
        System.out.println(s1.name);
        System.out.println(s1.age);
        // 使用有参构造创建对象
        Student s2 = new Student("Ajl",21);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
