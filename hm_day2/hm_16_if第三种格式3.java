package hm_day2;

import java.util.Scanner;

public class hm_16_if第三种格式3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入1/2/3:");
		int tian = sc.nextInt();
		if(tian <= 0 || tian > 3 ){
			System.out.print("输入有误!");
		}else if(tian == 1){
			System.out.print("早");
		}else if(tian == 2){
			System.out.print("中");
		}else{
			System.out.print("晚");
		}
	}

}
