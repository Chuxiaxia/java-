package hm_day2;

public class hm_10_逻辑运算符2 {

	/**	
		 &:与
		 !:非
		 ^:异或
		 |:或
		 &&:双与 （并且）
		 ||:或者
	 */
	public static void main(String[] args) {
		//&：与。必须满足所有条件。
		System.out.println(true & false); //false
		System.out.println(true & true);   //true
		//|:满足一个条件就行1
		System.out.println(true | false); //true
		System.out.println(false | true);   //true
		//!:取反
		System.out.println(!true); //false
		System.out.println(!false);//true
		//^:异或  相同为false 不同为true
		System.out.println(true ^ false); //true
		System.out.println(true ^ true);   //false
		//&&:双与 （并且） 必须满足所有条件（效率更快，左边不满足条件，后边就不在执行）
		System.out.println(false && true); //false
		System.out.println(true && true);   //true
		//||:或者 满足一个条件就行。（效率更快，左边条件满足，后边不在执行）
		System.out.println(true || false); //true
		System.out.println(false || true); //true

	}

}
