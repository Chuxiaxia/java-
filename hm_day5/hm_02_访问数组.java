package hm_day5;

public class hm_02_访问数组 {

    public static void main(String[] args) {
        int a = 10;
            a = 20;
        System.out.println(a);
        /*
            [I@50cbc42f:内存地址
            [:表示一个数组
            50cbc42f：表示int类型的数组
            @：没有实际意义，仅分割使用
            1c53fd30：内存地址（相当于家庭住址）
         */
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr);
        /*
            对数组访问：
                获取数据：数组名[索引]
                索引从0开始编号。0.1.2.3.。。。
         */
        //获取arr数组第2+1个数据
        System.out.println(arr[2]);
        //修改arr数组数据第1+1个数据 赋值为6
        arr[1]=6;
        System.out.println(arr[1]);
        /*
            数组的长度属性
                数组名.length
            数组最大索引：
                数组最大索引 = 数组长度 - 1;
                数组最大索引 = 数组名.length - 1;
         */
        System.out.println(arr.length);
        // 使用动态初始化数组
        /*
            数组的元素有默认值
                byte[],short[], int[], long[]     元素默认值是0
                float[], double[]                 元素的默认值0.0
                boolean[]                         元素的默认值false
                char[]                            元素默认值'\u0000', 什么都看不到
          */
        int[] arr2 = new int[3]; // {0, 0, 0}
        System.out.println(arr2[0]);

        byte[] arr3 = new byte[3];
        // arr3[0] = 10;
        System.out.println(arr3[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        boolean[] b = new boolean[3];
        System.out.println(b[0]);

        char[] c = new char[3];
        System.out.println(c[0]);

    }
}
