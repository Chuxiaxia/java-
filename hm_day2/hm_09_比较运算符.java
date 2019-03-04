package hm_day2;

public class hm_09_比较运算符 {

	/**
	   比较运算符：比大小，都是数字，结果true/false
	   ==:比较是否相等
	   >：
	   <
	   >=
	   <=
	   !=
	 */
	public static void main(String[] args) {
		
		System.out.println(5 == 5); //true
		System.out.println(6 == 5); //false
		System.out.println(6 > 5);  //true
		System.out.println(6 < 5);  //false
		System.out.println(6 >= 5); //true
		System.out.println(6 <= 5); //false
		System.out.println(5 != 5); //false
		System.out.println(6 != 5); //true
		
		//注意：
		int a = 10;
		int b = 20;
		System.out.println(a = b);
		//b赋值给a数值20.
		System.out.println(a == b);
	}

}
