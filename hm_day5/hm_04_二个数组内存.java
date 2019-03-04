package hm_day5;

public class hm_04_二个数组内存 {
    public static void main(String[] args) {
        int[] arr1 = new int[2];
        int[] arr2 = new int[3];

        System.out.println(arr1); // 地址
        System.out.println(arr2); // 地址
        System.out.println(arr1[0]); // 0
        System.out.println(arr1[1]); // 0
        System.out.println(arr2[0]); // 0
        System.out.println(arr2[1]); // 0
        System.out.println(arr2[2]); // 0

        arr1[1] = 1000;
        arr2[1] = 2000;
        System.out.println(arr1[0]); // 0
        System.out.println(arr1[1]); // 1000
        System.out.println(arr2[0]); // 0
        System.out.println(arr2[1]); // 2000
        System.out.println(arr2[2]); // 0
    }
}
