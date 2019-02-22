package hm_day2;

public class hm_02_强制类型转换3 {

	/**
	 	强制类型转换：将取值范围大的 强制转换成 取值范围小的。
	 	格式：
	 		目标类型 变量名 = （目标类型）数值
	 */
	public static void main(String[] args) {

		byte b1=1;
		byte b2=2;
		byte b3=1 + 2;
		// 常量3在byte范围之类是可以自动转换的。  
		int b4 = b1 + b2;
		// 这里报错了，b1和b2会自动提升成int类型变量运行，结果是int类型 的。  
		System.out.println(b3);
		System.out.println(b4);
		

	}

}
