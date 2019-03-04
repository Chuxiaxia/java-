package hm_day7.hm_02_封装优化1_this关键字;

public class Person {
    private String name;
    //1.成员变量私有(private)
    private int age;

    //2.提供getXxx/setXxx
    //setXxx:用于设置成员变量
    public void setAge(int age ){
        if (age < 0 ){
            System.out.println("输入年龄有误！");
        }else {
            this.age = age;
        }
    }
    //getXxx:用于获取成员变量
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
