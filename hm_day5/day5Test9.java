package hm_day5;

public class day5Test9 {
    public static void main(String[] args) {
        // 1.定义数组存放四种花色         
        String[] hs = {"♠","♥","♣","♦"};
        // 2.定义数组存放点数
        String[] ds ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        // 3.外循环遍历花色数组
        for(int hsIndex = 0; hsIndex < hs.length; hsIndex++){
            // 4.内循环遍历点数数组
            for (int dsIndex = 0; dsIndex < ds.length; dsIndex++){
                // 5.拼接字符串,格式为:花色点数(黑桃5)
                System.out.print(hs[hsIndex] + ds[dsIndex] + " ");
            }
            System.out.println();
        }
    }
}
