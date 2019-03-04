package hm_day8.Test5;

public class Teacher extends Employee {

    public void work() {

    }

    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }


}

class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    public void work() {
        System.out.println("工号：" + getId() + "的讲师" + getName() + "在讲课！");
    }

}

class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }
    public void work(){
        System.out.println("工号：" + getId() + "的助教" + getName() + "在帮助学生解决问题");
    }
}
