package hm_day5;
/*
    有一组双色球号码{1, 8, 10, 12, 18, 28, 12},定义printBall方法，打印双色球号码信息
 */
public class day5Test4 {
    public static void main(String[] args) {
        //1. 在main方法中定义int[] arr保存一组双色球号码{1, 8, 10, 12, 18, 28, 12}
        int[] arr = {1, 8, 10, 12, 18, 28, 12};
        //5. 在main方法中调用printBall方法,参数为arr
        printBall(arr);
    }
    //2. 定义printBall方法,参数为int[] array,返回值为void
    public static void printBall(int[] array){
        //3. 在printBall方法中输出:"您的双色球号码为:"
        System.out.println("您的双色球号码为:");
        //4. 在printBall方法中遍历array数组,不换行打印每个元素
        for (int i : array){
            System.out.print(i + " ");
        }
    }



}
