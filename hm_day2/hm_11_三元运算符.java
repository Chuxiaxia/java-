package hm_day2;

public class hm_11_三元运算符 {

	/**
	 三元运算符格式：
	 	数据类型 变量名 = 布尔表达式 ？ 结果1 ： 结果2；
	 执行流程:
		 1.布尔类型表达式结果是true，三元运算符整体结果为结果1，赋值给变量。
		 2.布尔类型表达式结果是false，三元运算符整体结果为结果2，赋值给变量。
	 */
	public static void main(String[] args) {
		
		int age = 16;
		
		int money = age <= 18 ? 200:10;
		System.out.println(money); //200
		
		String msg = age >= 18 ? "成年" : "未成年";
		System.out.println(msg);  //未成年
		
		//获取最大值
		int a = 10;
		int b = 20;
		int max = a > b ? a : b;
		System.out.println(max);  //20
	}

}
