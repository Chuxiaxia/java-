package hm_day7.hm_03_封装优化_构造方法;
/*
    构造方法是给成员变量赋值
    setXxx也是给成员变量赋值,有什么区别?
        执行时机:
            构造方法是在创建对象的时候就赋值一次
            setXxx是对象创建完毕通过对象调用的,多次调用
 */
public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Ajl");
        p1.setAge(21);
        System.out.println(p1.getName()+";"+p1.getAge());

        Person p2 = new Person("Xey",14);
        p2.setAge(15);
        System.out.println(p2.getName()+";"+p2.getAge());
    }
}
