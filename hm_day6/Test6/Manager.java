package hm_day6.Test6;
/*
    属性：
        姓名，工号，薪资， 奖金
    构造器：
        无参构造器，满参构造器
    成员方法：
        intro方法：打印姓名，工号信息
        showSalary方法：打印薪资和奖金信息
        work方法：打印"正在努力的做着管理工作,分配任务,检查员工提交上来的代码....."
 */
public class Manager {
    public String name;
    public int number;
    public int salary;
    public int bonus;
    public Manager(){

    }
    public Manager(String name1, int number1, int salary1, int bonus1){
        name = name1;
        number = number1;
        salary = salary1;
        bonus = bonus1;
    }
    public void intro(){
        System.out.println("老板姓名：" + name + "\n工号：" + number);
    }
    public void showSalary(int salary,int bonus){
        System.out.println("基本工资：" + salary + ";奖金：" + bonus);
    }
    public void work(){
        System.out.println("天选之人，能力出众... ");
    }
}
