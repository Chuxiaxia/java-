package hm_day7.hm_01_封装;

public class Person {
    private String name;
    //1.成员变量私有(private)
    private int age;

    //2.提供getXxx/setXxx
    //setXxx:用于设置成员变量
    public void setAge(int a ){
        if (a < 0 ){
            System.out.println("输入年龄有误！");
        }else {
            age = a;
        }
    }
    //getXxx:用于获取成员变量
    public int getAge(){
        return age;
    }
    //setXxx:用于设置成员变量
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    //注意:不能get/set放一起
    public int getAAA(int a){
        age = a;
        return age;
    }


}
