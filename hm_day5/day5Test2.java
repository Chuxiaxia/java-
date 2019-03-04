package hm_day5;
/*
    静态初始化int[] arr = {11, 22, 33, 44, 55}, 遍历arr数组

 */
public class day5Test2 {
    public static void main(String[] args) {
        //1. 使用静态初始化int类型数组arr,内容为{11, 22, 33, 44, 55}
        int [] arr = {11, 22, 33, 44, 55};
        //2. 使用for循环遍历arr数组
        for (int i : arr){
            //3. 在for循环中打印每个元素
            System.out.println(i);
        }
    }
}
