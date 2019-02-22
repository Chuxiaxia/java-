package hm_day2;

public class hm_11_三元运算符3 {

	/**
	 	三元运算符格式：
	 		数据类型  变量名 = 布尔表达式 ？ 结果1 ： 结果2
	 	执行流程:
			 1.布尔类型表达式结果是true，三元运算符整体结果为结果1，赋值给变量。
			 2.布尔类型表达式结果是false，三元运算符整体结果为结果2，赋值给变量。
	 */
	public static void main(String[] args) {
		// 压岁钱，年龄大于等于18的10块钱，小于18的100块钱
		int age = 13;
		int money = age >= 18 ? 10 : 100;
		System.out.println(money);
		
	}

}
