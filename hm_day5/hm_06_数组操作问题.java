package hm_day5;
/*
    ArrayIndexOutOfBoundsException: 10 (数组索引越界异常)
    NullPointerException: (空指针异常)
 */
public class hm_06_数组操作问题 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        System.out.println(arr[0]);
//        System.out.println(arr[10]); // ArrayIndexOutOfBoundsException: 10 (数组索引越界异常)

//        arr = null;
//        System.out.println(arr[0]); // NullPointerException: (空指针异常)

        // 注意: 数组的长度可以是0,但不能是负数
//        int[] arr2 = new int[0];
//        System.out.println(arr2);

        arr[0] = 10;
        // arr[0] = 1.01; // 数组只能存储指定的类型
    }
}
