package hm_day4;

public class day4Test6 {
    public static void main(String[] args) {
        printX(10);
    }

    public static void printX(int m){
        for(int a = 0; a < m; a++){
            // 外循环控制行
            for(int b = 0; b < m; b++){
                // 内循环控制列

                if(a == b || a + b == m-1){
                    System.out.print("O");
                }else{
                    System.out.print("*");
                }

            }
            // 再换行
            System.out.println();
        }
    }
}
