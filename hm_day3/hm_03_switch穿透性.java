package hm_day3;

import java.util.Scanner;

public class hm_03_switch穿透性 {

	/**
	 	注意：
			 没有break语句，程序会一直向后走，不会在判断case，
		直接往下运行，直到遇到break结束当前分支。
	*/
	 
	public static void main(String[] args) {
		// 1.创建一个Scanner类的对象用于接收键盘的输入。
		Scanner sc = new Scanner(System.in);
		// 2.根据用户选择对应的信息.
		System.out.print("请选择模式:");
		int tian = sc.nextInt();
		switch(tian){
			case 1:
			case 2:
				System.out.println("air");
				break;
			case 3:
				System.out.println("clannd");
				break;
			case 4:
			case 5:
				System.out.println("sola");
				break;
			case 6:
			case 7:
			default: 
				System.out.println("输入错误，程序结束!"); 
				break; 
		
		}

	}
}
