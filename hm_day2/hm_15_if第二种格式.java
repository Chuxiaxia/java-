package hm_day2;

public class hm_15_if第二种格式 {

	/**
	 	执行流程：
	 		1.判断关系式看其结果是true还是false
	 		2.(1)如果是true，就执行语句体1.
	 		  (2)如果是false，就执行语句体2.
	 	格式：
	 		if(){
	 			语句体1;
	 		}else{
	 			语句体2;
	 		}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("我爱你!");
		int age = 14;
		if(age >= 20){
			System.out.println("我到法定结婚年龄了,结婚吧");
		}else{
			System.out.println("我们不能结婚吧!");
		}
		System.out.println("我也爱你!");
	}

}
