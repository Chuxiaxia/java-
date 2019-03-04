package hm_day9.Test4;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manage extends Employee{
    public Manage(String name, double salary) {
        super(name, salary);
    }
}
class Coder extends Employee{
    public Coder(String name, double salary) {
        super(name, salary);
    }
}