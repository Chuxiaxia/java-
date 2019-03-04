package hm_day5;

public class hm_03_一个数组内存 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]); // 0
        System.out.println(arr[1]); // 0
        System.out.println(arr[2]); // 0

        arr[1] = 100;

        System.out.println(arr[0]); // 0
        System.out.println(arr[1]); // 100
        System.out.println(arr[2]); // 0
    }
}
