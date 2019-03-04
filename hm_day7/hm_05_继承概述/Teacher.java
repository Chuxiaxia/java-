package hm_day7.hm_05_继承概述;

public class Teacher extends Person{
    double salary;
    public void teach(){
        System.out.println(name + "上课");
    }
}
