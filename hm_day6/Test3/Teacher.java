package hm_day6.Test3;
/*
    属性：姓名name，年龄age，讲课内容content
    实例方法：吃饭eat方法，讲课teach方法
    静态方法：输出“在黑马上课学习”的study方法。
 */
public class Teacher {
    public String name;
    public int age;
    public String content;
    public void eat(){
        System.out.println("吃饭");
    }
    public void teach(){
        System.out.print("讲着" + content);
    }
    public static void study(){
        System.out.print("在黑马认真的");
    }
}
