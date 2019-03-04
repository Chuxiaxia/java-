package hm_day6.Test6;
/*
    属性：
        姓名，工号，薪资
    构造器：
        无参构造器，有参构造器
    成员方法：
        intro方法：打印姓名，工号信息
        showSalary方法：打印薪资信息
        work方法：打印"正在努力写代码...."
 */
public class Coder {
    public String name1;
    public int number1;
    public double salary1;
    public Coder(){

    }
    public Coder(String name2,int number2,double salary2){
        name1 = name2;
        number1 = number2;
        salary1 = salary2;
    }
    public void intro1(){
        System.out.println("经理姓名：" + name1 + "\n工号：" + number1);
    }
    public void showSalary1(double salary1){
        System.out.println("基本工资：" + salary1 + ";奖金：无" );
    }
    public void work1(){
        System.out.println("努力为夏夏打工是我的荣幸..... ");
    }
}
