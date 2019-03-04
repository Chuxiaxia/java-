package hm_day3;

public class day3Test6 {

	/**	
	 	打印1-60的所有偶数，并且5个一行
	 	编写步骤： 
	 		1. 定义变量count记录打印的数量 
	 		2. for循环获取到1-60的偶数 
	 		3. 在for循环内打印偶数不换行 
	 		4. 打印的数量+1 
	 		5. 当打印的数量满足了5个就换行 
	 */
	public static void main(String[] args) {
		
		int count = 0;
		// 控制外循环
		for(int j = 2; j <= 60; j+=2){
			System.out.print(j + "\t");
			count++;
			if(count % 5 == 0){
				System.out.println();
			}
		}
		System.out.println("偶数个数：" + count);
				
	}

}
