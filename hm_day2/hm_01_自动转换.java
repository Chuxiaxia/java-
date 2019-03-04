package hm_day2;

public class hm_01_自动转换 {

	/*自动转换规律：
		byte, short, char -> int -> long -> float -> double
	    自动转换：自动将取值范围小的转换为大的。
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 1;
		int i = 2;
		// 自动转换：自动将取值范围小的转换为大的。
		int b2 = b + i;
		System.out.println(b2);
		
		double d = 3.1;
		int x = 2;
		//double + int => double +double => double
		double y = d + x ; 
		System.out.println(y);
		
		byte a1 = 2;
		short a2 = 3;
		//byte + short => int + int => int
		//小于int类型的 直接转换成int或者以上的类型
		int a = a1 + a2;
		System.out.println(a);
	}

}
