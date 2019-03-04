package hm_day2;

public class hm_16_if第三种格式 {

	/**
	 	执行流程：
	 		1.判断关系式1看其结果是true还是false
	 		2.(1)如果是true，就执行语句体1.
	 		  (2)如果是false，就执行判断关系式2看其结果是true还是false.
	 		 	…
	 		  (n)如果没有任何关系表达式为true，就执行语句体n+1
	 	格式:
	 		if (关系表达式1) {    
	 			执行语句1; 
	 		} else if (关系表达式2) {    
	 			执行语句2; 
	 		} else if (关系表达式n) {
	 		       执行语句n; 
	 		} else {
	 		       执行语句n+1; 
	 		}

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("我爱你!");
		int age = 14;
		if(age >= 18){
			System.out.println("我成年了，嘻嘻");
		}else if(14 <= age && age < 18){
			System.out.println("我是合法萝莉!!!");
		}else if(age < 14 ){
			System.out.println("我还是幼女,三年起步哦。");
		}else{
			System.out.println("嘿嘿嘿");
		}
		System.out.println("我也爱你!");
	}

}
