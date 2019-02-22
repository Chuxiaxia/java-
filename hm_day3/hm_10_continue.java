package hm_day3;

public class hm_10_continue {

	/**
	 	continue：立即结束循环的本次循环，继续循环的下一次的执行。
	 	注意：必须放在for循环或while循环中 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 1; i < 5; i++) {
			 if (i == 2) { 
				 continue;  // continue后面的代码不执行.继续下次循环 
			 }
			 System.out.println("HelloWorld" + i); 
		 }
	}

}
