package hm_day2;

public class hm_02_强制类型转换2 {

	/**
	 	强制类型转换：将取值范围大的 强制转换成 取值范围小的
	 	格式：
	 		目标类型  变量名 = （目标类型）数值
	 	注意：强制类型转换，可能会造成数据丢失
	 */
	public static void main(String[] args) {
		
		double d = (double)3;
		System.out.println(d);
		
		byte a = 1;
		short b = 2;
		double c = (double) (a + b) ;
		System.out.println((int)c);

	}

}
