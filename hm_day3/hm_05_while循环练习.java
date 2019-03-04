package hm_day3;

public class hm_05_while循环练习 {

	/**
	 	循环练习：使用循环，计算1-100之间的奇数和。

	 */
	public static void main(String[] args) {
		// 定义一个变量求和
		int count = 0;
		int i = 1;
		/*
		 * 方法一：
		while(i <= 100){
			if(i % 2 == 1){
				count += i;
			}
			i++;
		}
		*/
		
		while(i <= 100){
			
			// 循环体语句
			count += i;
			// 迭代语句
			i += 2;
			// 迭代条件每次是 i+=2,所以i依次等于 1 3 5 7 9，... 99
		}

		System.out.println("1-100奇数和是："+ count);

	}

}
