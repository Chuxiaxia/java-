package hm_day4;

    /*
       定义方法,实现不定次数打印HelloWorld
       返回值类型: 不需要返回值,void
       参数列表: 打印次数不确定, (int count)
    */
public class hm_05_定义方法练习 {
        public static void main(String[] args) {
            HelloWord(5);
        }

        public static void HelloWord(int count){
            //次数
            for (int i = 0; i < count ; i++){
                System.out.println("Helloword!");
            }
        }
}
