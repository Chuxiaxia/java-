package hm_day2;

public class hm_10_逻辑运算符 {

	/**
		 &:与
		 !:非
		 ^:异或
		 |:或
		 &&:双与 （并且）
		 ||:或者
	 */
	public static void main(String[] args) {
		
		//&:与  必须条件全部满足。
		System.out.println(true & true); //true
		System.out.println(true & false);//false
		
		//|:或者  满足一个条件就行
		System.out.println(true | true); //true
		System.out.println(true | false);//true
		
		//!:非  取反
		System.out.println(!true ); //false
		System.out.println(!false); //true
		
		//^:异或  相同为false,不同为true.
		System.out.println(true ^ true ); //false
		System.out.println(true ^ false); //true
		
		//&&:并且  必须条件全部满足。(可以提高效率，左边条件不满足，后边条件不再执行)
		System.out.println(true && true); //true
		System.out.println(false && true);//false
		
		//||:或者  满足一个条件就行。(可以提高效率，左边条件满足，后边条件不再执行)
		System.out.println(true || true); //true
		System.out.println(false || true);//true

	}

}
