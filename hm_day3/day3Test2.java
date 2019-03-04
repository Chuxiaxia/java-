package hm_day3;

public class day3Test2 {

	/**
	 	1-100既是3的倍数又是5的倍数数字之和
	 	编写步骤： 
	 		1. 定义一个变量sum,用于累加求和 
	 		2. 使用for循环遍历1到100之间的每个数字 
	 		3. 在循环中判断该数字是否既是3的倍数又是5的倍数 
	 		4. 如果满足条件,对该数字进行累加求和,并打印这个数字 
	 		5. 循环结束后,打印求和变量sum 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i <= 100; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("1-100既是3的倍数又是5的倍数数字之和:" + sum);
	}

}
