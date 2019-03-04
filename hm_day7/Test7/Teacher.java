package hm_day7.Test7;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
