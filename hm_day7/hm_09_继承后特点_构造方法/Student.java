package hm_day7.hm_09_继承后特点_构造方法;

public class Student extends Person{
    private double score;
    // 子类无参调用父类无参构造
    public Student(){
        System.out.println("子类无参构造");
    }
    // 子类有参调用父类的有参构造,自己的成员变量自己赋值


    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
        System.out.println("子类有参构造");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
