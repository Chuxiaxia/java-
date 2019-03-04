package hm_day5;

public class hm_07_数组遍历 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        //重复代码可以用for循环解决
        //最常见用法
        //i < arr.length; 说明i最大只能渠道arr.length - 1
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        /*
            foreach遍历格式：
                for(被遍历集合或者数组中元素的类型 变量 : 被遍历集合或者数组){
                        System.out.println(变量);
                  }
         */
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
