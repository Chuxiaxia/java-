package hm_day7.Test3;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {
    }

    public void eat(){
        System.out.println("吃饭饭..");
    }
    public void teach(){
        System.out.println("激情的讲着" + content);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
