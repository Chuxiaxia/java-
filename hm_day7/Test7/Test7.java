package hm_day7.Test7;

public class Test7 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("王小平");
        t.setSubject("Java课");
        System.out.println(t.getName() + "老师," + "讲授" + t.getSubject());
        Student s = new Student();
        s.setName("李小乐");
        s.setScore(90);
        System.out.println(s.getName() + "同学" + ",考试得了" + s.getScore() + "分");
    }
}
