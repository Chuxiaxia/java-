package hm_day2;

public class hm_11_三元运算符2 {

	/**
	 	三元运算符格式：
	 		数据类型  变量名 = 布尔表达式 ？ 结果1 ： 结果2
	 	执行流程:
			 1.布尔类型表达式结果是true，三元运算符整体结果为结果1，赋值给变量。
			 2.布尔类型表达式结果是false，三元运算符整体结果为结果2，赋值给变量。
	 */
	public static void main(String[] args) {
		
		//判断身份 ，类型大于等于1是访客，类型小于1是主人
		int a = 1;
		String x = a >= 1  ? "访客" : "主人" ;
		System.out.println(x);
		
		//获取最小值
		int c = 7;
		int d = 6;
		int min = c < d ? c:d;
		System.out.println(min);
		
	}

}
