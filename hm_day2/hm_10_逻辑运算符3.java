package hm_day2;

public class hm_10_逻辑运算符3 {

	/**
	 	 &:与
		 !:非
		 ^:异或
		 |:或
		 &&:双与 （并且）
		 ||:或者
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(true & true); //true
		System.out.println(false & true);//false
		
		System.out.println(!true); //false
		System.out.println(!false);//true
		
		System.out.println(false ^ true); //true 
		System.out.println(true ^ true);  //false
		
		System.out.println(true | true); //true
		System.out.println(false | true);//true
		
		System.out.println(true && true); //true
		System.out.println(false && true);//false
		
		System.out.println(true || true); //true
		System.out.println(false || true);//true
	}

}
