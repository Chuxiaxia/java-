package hm_day3;

public class hm_04_for循环练习4 {

	/**
	 	循环练习：使用循环，计算1-100之间的偶数和。

	 */
	public static void main(String[] args) {
	  
		// 定义一个变量用于存放最终求和的结果
		int count1 = 0;
		
		// 方法一
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				System.out.print(" " + i);
				count1 += i;
			}
		}
		
		//方法二
		int count2 = 0;
		for(int j = 1; j <= 100; j +=2){
			count2 += j;
		}
		
		System.out.println("\n1-100偶数总和1:" + count1 + "\n1-100偶数总和2:" + count2);
	}

}