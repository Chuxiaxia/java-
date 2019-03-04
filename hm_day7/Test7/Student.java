package hm_day7.Test7;

public class Student extends Person{
    private int score;

    public Student(){

    }
    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
