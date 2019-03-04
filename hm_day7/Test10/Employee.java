package hm_day7.Test10;

public class Employee {
    private String number;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String number, String name, double salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }
    public void work(){
    }
    public void eat(){
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
