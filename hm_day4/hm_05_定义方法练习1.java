package hm_day4;

/*
       定义方法: 实现不定次数打印HelloWorld
       定义方法2个明确:
           1.返回值类型:结果的类型. 打印后没有结果,void(空的)
           2.参数列表:未知数据作为参数列表. 打印的次数不确定,作为参数列表
 */
public class hm_05_定义方法练习1 {
    public static void main(String[] args) {
        Love(2);
        Love(1);
    }
    public static void Love(int count){
        for (int i = 0; i < count; i++){
            System.out.println("我爱你！" + i);
        }
    }
}
