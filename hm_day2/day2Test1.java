package hm_day2;

public class day2Test1 {

	/**
	 编写步骤： 
	 	1. 定义类 Test1 
	 	2. 定义int类型变量保存长方形的长 
	 	3. 定义int类型变量保存长方形的宽 
	 	4. 定义int类型变量保存长方形的面积,面积=长*宽            S = a * b = 120
	 	5. 定义int类型变量保存长方形的周长,周长=(长+宽)*2   C = (a + b) * 2 = 52  a + b = 26
	 	6. 使用输出语句输出面积和周长 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 6;
		int S = a * b;
		int C = (a + b) * 2;
		System.out.println("长方形的面积为:"+ S + "\n周长为:" + C);
	}

}
