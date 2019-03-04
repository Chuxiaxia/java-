package hm_day2;

public class day2Test4 {

	/**
		 编写步骤： 
			 1. 定义类 Test4 
			 2. 定义 main方法 
			 3. 定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果 
			 4. 定义两个int类型变量b1和b2,分别赋值12,13,判断变量是否为奇数,拼接输出结果 
	 */
	public static void main(String[] args) {
		
		int a1 = 10;
		int a2 = 11;
		boolean a11 = a1%2==0 ? true : false;
		boolean a22 = a2%2==0 ? true : false;
		System.out.println(a1+"是偶数？"+a11);
		System.out.println(a2+"是偶数？"+a22);
		
		int b1 = 12;
		int b2 = 13;
		System.out.println(b1+"是奇数？"+(b1 % 2 == 1));
		System.out.println(b2+"是奇数？"+(b2 % 2 == 1));

	}

}
