package hm_day3;

public class day3Test1 {

	/**
	 	1-100的奇数累加和
	 	编写步骤： 
	 		1. 定义一个变量sum,用来记录奇数的总和 
	 		2. 使用for循环得到1到100之间的每个数字 
	 		3. 在for循环里面,使用if判断这个数字是否为奇数 
	 		4. 如果为奇数,就将这个数字与sum相加 
	 		5. for循环结束后,打印sum的值 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i <= 100; i++){
			if(i % 2 ==1){
				sum += i;
			}
			
		}
		System.out.print("1-100奇数总和：" + sum);
	}

}
