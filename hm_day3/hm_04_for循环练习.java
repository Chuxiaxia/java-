package hm_day3;

public class hm_04_for循环练习 {

	/**：           
	  	循环练习：使用循环，计算1-5的和
	  	分析:           
	  		1.需要拿到1-5之间的这些数字           
	  		2.将这些数相加起来
	  	 实现步骤:           
	  	 	1.定义求和变量，初始化值是0      
	  	 	2.获取1-5之间的数据，用for循环实现           
	  	 	3.把每一次获取到的数据，累加起来           
	  	 	4.输出求和变量 
 
	 */
	public static void main(String[] args) {
		// 定义一个变量：定义一个瓶子。
		int count = 0;
		for (int i = 1 ; i <= 5; i++){
			System.out.print(i+" ");
			// 累加 count = count + i; 
			count += i;
		}
		System.out.println("和是："+ count);
	}

}
