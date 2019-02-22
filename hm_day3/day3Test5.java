package hm_day3;

public class day3Test5 {

	/**
	 	获取三位数的水仙花数
	 	编写步骤： 
	 		1. 使用for循环获取100-999中的每个数字 
	 		2. 在for循环中获取这个数字的百位 
	 		3. 在for循环中获取这个数字的十位 
	 		4. 在for循环中获取这个数字的个位 
	 		5. 如果个位的立方 + 十位的立方 + 百位的立方等于这个数本身,则打印这个水仙花数字 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 100; i <=999; i++){
			//个位
			int ge = i % 10;
			//十位
			int shi = i / 10 % 10;
			//百位
			int bai = i / 100;
			if(i == ge*ge*ge + shi*shi*shi + bai*bai*bai){
				System.out.println("三位数的水仙花数：" + i);
			}
			
		}
	}

}
