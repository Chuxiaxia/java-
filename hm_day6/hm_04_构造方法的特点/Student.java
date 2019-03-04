package hm_day6.hm_04_构造方法的特点;
//定义类
public class Student {
    public String name;
    public int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public Student(){
        // 构造方法里面会对成员变量赋值称为构造方法初始化
    }
    public Student(String n, int a){
        name = n;
        age = a;
    }

}
