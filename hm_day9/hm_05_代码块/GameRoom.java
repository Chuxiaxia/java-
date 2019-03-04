package hm_day9.hm_05_代码块;

public class GameRoom {
    //静态代码块
    static {
        //用于执行一次的时候（数据库驱动的加载）
        System.out.println("静态代码块");
    }
    //构造代码块
    {
        //给对象做统一初始化
        System.out.println("构造代码块");
    }

    public GameRoom(){
        System.out.println("构造方法无参");
    }
}
