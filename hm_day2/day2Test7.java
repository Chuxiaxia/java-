package hm_day2;

import java.util.Scanner;

public class day2Test7 {

	/**
	 	编写步骤： 
		 	1. 定义类 Test6 
		 	2. 定义 main方法 
		 	3. 定义int类型变量num,赋为任意整数值. 
		 	4. 定义String 类型变量str,通过三元运算符判断num为偶数,将"偶数"赋值给str,否则将"奇数"赋值给str 
		 	5. 输出拼接效果 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要判断奇偶的数值：");
		int num = sc.nextInt();
		String str = (num % 2 == 0) ? "偶数" : "奇数";
		System.out.println("num:" + num + "是" + str);

	}

}
