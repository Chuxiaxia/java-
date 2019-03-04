package hm_day2;

public class hm_05_运算符 {

	/**
	 	运算符：常量或变量进行运算的符号。
	 	+ - * / %（取模，取余数）
	 	++:自增   a++后自增1. ++a先自增1
	 	--:自减   a--后自减1. --a先自减1
	 	组合使用
	 		a++; 先做其他操作，再自增
	 		++a; 先自增，再做其他操作
	 */
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		System.out.println(a + b); //8
		System.out.println(a - b); //2
		System.out.println(a * b); //15
		System.out.println(a / b); //1
		//java中 整数相除结果取整数. 要想结果小数，必须要有小数参与运算
		
		System.out.println(a % b);
		//两个数相除 获取余数打印出来。 5%3=1……2
		System.out.println(-5 % 3); //-2
		System.out.println(5 % -3); //2
		System.out.println(-5 % -3);//-2
		//取余数的符号和左边数的符号相同。
		
		//单独使用
		a++;
		System.out.println(a);//6
		++a;
		System.out.println(a);//7
		
		//组合使用
		
		//先将b赋值给j，j=3,b才自增1 b=4
		int j = b++;
		System.out.println(b);//4
		System.out.println(j);//3
		
		//m先自增 m=4,然后赋值给m,n
		int m = 3;
		int n = ++m;
		System.out.println(m);//4
		System.out.println(n);//4
		

	}

}
