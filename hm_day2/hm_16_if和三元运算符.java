package hm_day2;

/**
	三元运算符的格式:
		数据类型 变量名 = 布尔表达式 ? 结果1 : 结果2;

	在某些简单的应用中，if...else语句是可以和三元运算符互换使用的。例如获取2个数的最大值

	三元运算符的优点:
		代码简洁

	三元运算符的缺点:
		1.三元运算符的结果中只能放一个语句
		2.三元运算符的结果中不能放输出语句

	目标: 了解if语句和三元运算符互换
		  if...else可以和三元运算符互换
*/
public class hm_16_if和三元运算符 {

	public static void main(String[] args) {
			int a = 10;
			int b = 20;
			// 获取2个数的最大值
			// 使用三元运算符
			int max = a > b ? a : b;
			System.out.println("max: " + max);//20
	
			// 使用if...else
			int max2;
			if (a > b) {
				max2 = a;

			} else {
				max2 = b;
			}
			System.out.println("max2: " + max2);//20
	}
}


