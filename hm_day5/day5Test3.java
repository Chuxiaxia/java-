package hm_day5;
/*
    定义数组int[] nums = {5,10,15},创建一个新数组,新数组元素的值是nums数组元素的2倍
 */
public class day5Test3 {
    public static void main(String[] args) {
        //1. 定义数组int[] nums = {5,10,15}
        int[] nums = {5,10,15};
        //2. 创建一个int类型的新数组newArr，新数组的长度和nums数组长度相同
        int[] newArr =new int[nums.length];
        //3. 使用for循环遍历nums数组
        for (int i = 0; i < nums.length; i++){
            //4. 在for循环中取出nums数组中的索引为i的元素,将索引为i的元素*2再赋值到新数组newArr对应的索引位置
            newArr[i] = nums[i] * 2;
        }
        //5. 遍历输出nums数组中的元素
        System.out.println("nums数组:");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        //6. 遍历输出新数组newArr中的所有元素
        System.out.println("newArr新数组:");
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
