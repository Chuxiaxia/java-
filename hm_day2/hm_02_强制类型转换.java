package hm_day2;

public class hm_02_强制类型转换 {

	//强制类型转换：将取值范围大的 强制 转换成取值范围小的
	//注意：强制转换可能会丢失数据。
	public static void main(String[] args) {
		
		//目标类型 变量名 = （目标类型）值
		
		int i = (int) 3.14;
		System.out.println(i);//double转换成int会舍弃小数
		
		byte b = 3;
		short s = 5;
		byte x = (byte) (b + s);
		System.out.println(x);
		
		double d = 5.21;
		System.out.println((int)d);
	}

}
