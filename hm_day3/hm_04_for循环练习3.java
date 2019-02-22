package hm_day3;

public class hm_04_for循环练习3 {

	/**
	 	循环练习：使用循环，计算1-100之间的偶数和。

	 */
	public static void main(String[] args) {
	  
		// 定义一个变量用于存放最终求和的结果
		int count = 0;
	  
		// 1.输出一个1-100的数
		for(int i = 1; i<=100; i++){
			
			if(i % 2 == 0){
				count += i;
			}
		}
		
		System.out.println("1-100偶数和是："+ count);

	}

}
