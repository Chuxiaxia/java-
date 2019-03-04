package hm_day7.hm_04_JavaBean;
/*
JavaBean规范:
    1.成员变量私有
    2.提供getter/setter方法
    3.无参构造(一定要有)
    4.有参构造(建议有)
    5.成员方法
 */
public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(){

    }
    public Dog(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(){
        System.out.println("🐕吃");
    }

}
