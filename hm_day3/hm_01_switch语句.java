package hm_day3;

import java.util.Scanner;

public class hm_01_switch语句 {

	/**
	 	switch 翻译过来叫 开关 , switch 也是用于选择一个分支来执行的。
	 	格式：
	 	 	switch(表达式) {
	 	 	  case 常量值1:    
	 	 	 	语句体1;    
	 	 	 	break;
	 	 	  case 常量值2:    
		 	 	语句体2;    
		 	    break;
		 	     ...  
		 	  default:
		 	    语句体n+1;
		 	    break; 
		 	}
		 注意：
		 	switch语句中，表达式的数据类型，可以是byte，short，int，char，enum（枚举）， 
		 JDK7后可以接收字符串。 
		 好处：
		 	 做表达式值匹配的情况下建议使用switch分支来实现，性能好，代码更加优雅。

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请选择模式(输入1/2):");
		int tian = sc.nextInt();
		switch(tian){
			case 1:
				System.out.println("进入舔🐕模式!");
				break;
			case 2:
				System.out.println("进入喷子模式!");
				break;
			default: 
				System.out.println("输入错误，程序结束!"); 
				break; 
		}

	}

}
