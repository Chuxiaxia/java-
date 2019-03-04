package hm_day9.hm_05_代码块;
/*
    什么是代码块：{}
    静态代码块：使用static修饰的{}
        static{
        }
    构造代码块/实例代码块：{}
    静态代码块，构造代码块都是放在类中方法外
    静态代码块只会运行一次，最早运行（类加载的时候
    构造代码块每次构造方法前执行一次
    构造代码块本质：
        将构造代码块的内容复制到每个构造方法的第一行
 */
public class Demo {
    public static void main(String[] args) {
        GameRoom gr1 = new GameRoom();
        GameRoom gr2 = new GameRoom();
        // 反编译工具
        // .java文件 -> 编译 -> .class文件
        // .class文件 -> 反编译 -> .java文件
    }
}
