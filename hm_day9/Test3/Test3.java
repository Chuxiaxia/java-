package hm_day9.Test3;

public class Test3 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("马云",45);
        SportTeacher t2 = new SportTeacher("大姚",35);
        Student s1 = new Student("小王",20);
        SportStudent s2 = new SportStudent("王中王",21);
        //goToSport(t1);
        goToSport(t2);
        //goToSport(s1);
        goToSport(s2);

    }
    public static void goToSport(Sport s){
        s.playBasketball();
    }
}
