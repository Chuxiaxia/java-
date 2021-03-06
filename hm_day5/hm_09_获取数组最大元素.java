package hm_day5;

/*
      获取数组最大值步骤:
            1.定义一个变量用于记录较大值
            2.较大值的默认设置为数组的0索引的数据
            3.遍历数组拿到每个数据
            4.将遍历出的数据和较大值进行比较
            5.如果取出的数据比较大值还大,将取出的数据设置为较大值
            6.遍历完成,最大值就出来了
 */
public class hm_09_获取数组最大元素 {
    public static void main(String[] args) {

        int[] arr = {5, 10, 50, 20, 15};
        //1.定义一个变量用于记录较大值
        //2.较大值的默认设置为数组的0索引的数据
        int max = arr[0];
        //3.遍历数组拿到每个数据
        for (int i : arr){
            //4.将遍历出的数据和较大值进行比较
            if (i > max){
                //5.如果取出的数据比较大值还大,将取出的数据设置为较大值
                max = i;
            }
        }
        //6.遍历完成,最大值就出来了
        System.out.println(max);
    }

}
