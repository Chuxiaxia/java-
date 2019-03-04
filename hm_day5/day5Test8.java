package hm_day5;

public class day5Test8 {
    public static void main(String[] args) {
        char [] xc = {'D','C','B','A','D'};
        char [] xz = {'A','D','B','C','D'};
        char [] xb = {'A','D','B','C','A'};
        char [] xk = {'A','B','C','D','D'};
        cj("小传",xc);
        cj("小智",xz);
        cj("小博",xb);
        cj("小客",xk);
    }
    public static void cj(String name, char[] arr){
        char [] da = {'A','D','B','C','D'};
        int count = 0;
        // 在xcc方法中遍历arr1数组,判断da和xc的每个元素是否相等.
        for (int i = 0; i < arr.length; i++){
            //取出第i个正确答案
            //取出第i个学生答案
            if (arr[i] == da[i]){
                //第i题答对了
                count += 2;
            }
        }
        System.out.println("满分10分，" + name + ";得分：" + count);

    }
}
