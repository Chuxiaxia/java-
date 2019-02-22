package hm_day2;

public class day2Test6 {

	/**
	 	编写步骤： 
		 	1. 定义类 Test5 
		 	2. 定义 main方法 
		 	3. 定义ﬂoat变量f1赋值12345.01 
		 	4. 定义ﬂoat变量f2赋值12345.00 
		 	5. 定义ﬂoat 变量 var1 , 使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,当f1小于f2赋值12456.02 
		 	6. 定义ﬂoat 变量 var2 , 保存var1 与1024的和. 7. 同时输出var1,var2的值. 
	 */
	public static void main(String[] args) {
		
			float f1 = 12345.01f;
			float f2 = 12345.00f;
			float var1 = (f1 >= f2) ? 12456 : 12456.02f;
			float var2 = var1 + 1024;
			System.out.println("var1的值为：" + var1 + "\nvar2的值为：" + var2);
	}

}
