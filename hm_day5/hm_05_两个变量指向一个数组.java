package hm_day5;

public class hm_05_两个变量指向一个数组 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        System.out.println(arr1);
        System.out.println(arr1[0]); // 0
        System.out.println(arr1[1]); // 0
        System.out.println(arr1[2]); // 0

        int[] arr2 = arr1; // 重点
        System.out.println(arr2);
        arr1[1] = 1000;


        System.out.println(arr1[0]); // 0
        System.out.println(arr1[1]); // 1000
        System.out.println(arr1[2]); // 0
        System.out.println(arr2[0]); // 0
        System.out.println(arr2[1]); // 1000
        System.out.println(arr2[2]); // 0
    }
}
