package hm_day3;

public class hm_05_while循环练习2 {

	/**
	 	循环练习：使用循环，计算1-100之间的总数和。

	 */
	public static void main(String[] args) {
		// 定义一个变量求和
		int count = 0;
		int i = 1;
		// 方法一：
		while(i <= 100){
			
			count += i;
			i++;
		}

		// 方法二：
		while(i <= 100){
			
			// 循环体语句
			count += i;
			i += 1;
		}

		System.out.println("1-100总和是："+ count);

	}

}
