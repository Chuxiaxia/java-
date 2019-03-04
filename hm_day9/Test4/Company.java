package hm_day9.Test4;

public class Company implements Money{
    private double totalMoney;
    @Override
    public void paySalary(Employee emp) {
        totalMoney -= emp.getSalary();
        System.out.println("给" + emp.getName() + "发工资 " + emp.getSalary() + " 元,公司剩余: " + totalMoney + " 元");
    }

    public Company() {
    }

    public Company(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
