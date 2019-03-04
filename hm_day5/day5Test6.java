package hm_day5;
/*
    判断数组中的元素是否对称.
 */
public class day5Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        boolean isMirror = true;
        for (int a = 0, b = arr.length - 1; a < b; a++, b--){
            if (arr[a] != arr[b]){
                isMirror = false;
                break;
            }
        }
        System.out.println("[1, 2, 3, 4, 3, 2, 1]是否对称:" + isMirror);
    }
}
