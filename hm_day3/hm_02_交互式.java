package hm_day3;

import java.util.Scanner;

public class hm_02_交互式 {

	/**
	 	使用Scanner类接收键盘输入，选择对应的信息输出，实现与程序交互.
	 */
	public static void main(String[] args) {
		// 1.创建一个Scanner类的对象用于接收键盘的输入。
		Scanner sc = new Scanner(System.in);
		// 2.根据用户选择对应的信息.
		System.out.print("请选择模式(输入1/2/3):");
		int tian = sc.nextInt();
		switch(tian){
			case 1:
				System.out.println("air");
				break;
			case 2:
				System.out.println("clannd");
				break;
			case 3:
				System.out.println("sola");
				break;
			default: 
				System.out.println("输入错误，程序结束!"); 
				break; 
		}
	}

}
