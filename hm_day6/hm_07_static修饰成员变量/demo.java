package hm_day6.hm_07_static修饰成员变量;
/*
目标:理解static的作用

static的作用:表示成员变量和成员方法属于类的

学生类:校名,班级名称,教室,饮水机,空调,音响,老师

static修饰成员变量:
    修饰符 static 数据类型 变量名;
    静态修饰的变量称为静态变量或类变量

    静态修饰的变量可以使用类名调用,也可以使用对象名调用,建议使用类名
    static修饰的成员变量在静态区,只有一份,可以节省空间

总结:
    非静态的是属于对象的.
    静态修饰的是属于类的.
    静态修饰的变量可以使用类名调用,也可以使用对象名调用,建议使用类名
 */
public class demo {
    public static void main(String[] args) {
        // 普通的成员变量使用对象名调用
        // 静态成员变量使用类名直接调用
        Student.schoolName = "我爱";
        Student s1 = new Student();
        s1.name = "Xey";
        s1.age = 14;

        System.out.println(Student.schoolName);
        System.out.print(s1.schoolName);
        System.out.println(s1.name + "; " + s1.age);

    }
}
