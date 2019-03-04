package hm_day9.Test4;

public class Test4 {
    public static void main(String[] args) {
        Manage m = new Manage("李小强",9000);
        Coder c = new Coder("李小亮",5000);
        Company company = new Company(1000000);
        company.paySalary(m);
        company.paySalary(c);
    }
}
