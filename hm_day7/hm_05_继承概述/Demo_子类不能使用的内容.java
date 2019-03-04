package hm_day7.hm_05_继承概述;
/*

小结:
    1.子类不能继承父类的构造方法
    2.子类会保存父类私有的变量或方法,但是子类不能使用

 */
public class Demo_子类不能使用的内容 {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z.num2);
       // System.out.println(z.num1); // 子类不能使用父类私有的变量
        z.setNum1(200);
        System.out.println(z.getNum1());
        z.test01();
        //z.test02(); 子类不能使用父类私有的方法
    }
}

class Fu{
    public Fu(){
    }
    private int num1;
    public int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void test01(){
        System.out.println("test01");
    }
    public void test02(){
        System.out.println("test02");
    }
}
class Zi extends Fu{
    // 1.子类不能继承父类的构造方法
    // 构造方法名字和类名一样,而子类和父类的名字是不一样的,父类的构造方法拿到子类就不行
//    public Fu() {
//    }
}

