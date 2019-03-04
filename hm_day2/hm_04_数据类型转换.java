package hm_day2;

public class hm_04_数据类型转换 {

	/**
	 注意：布尔类型不能转换
	 */
	public static void main(String[] args) {
		
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte) (b1 + b2);
		//变量需要强制类型转换
		byte b4 = 1 + 2;
		//常量固定不变，会先算结果，再赋值给b4
		System.out.println(b3);
		System.out.println(b4);

	}

}
