package hm_day3;

public class hm_04_for循环练习2 {

	/**
	 	循环练习：使用循环，计算1-100之间的偶数和。

	 */
	public static void main(String[] args) {
	  
		// 定义一个变量用于存放最终求和的结果
		int count = 0;
	  /*
		方法一：
		// 1.输出一个1-100的数
		for(int i = 1; i<=100; i++){
			
			if(i % 2 == 0){
				count += i;
			}
		}
	  */
		for(int i = 2; i <=100; i+=2){
			// 迭代条件每次是 i+=2,所以i依次等于 2 4 6 8 ...
			count += i;
		}
		
		System.out.println("1-100偶数和是："+ count);

	}

}
