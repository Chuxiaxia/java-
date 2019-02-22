package hm_day3;

import java.util.Scanner;

public class day3Test7 {

	/**
	  开发提示： 1-12的规律数字，可以使用for循环处理 
	 		     根据不同的数字，匹配显示不同的文字，可以使用switch匹配
	 */
	public static void main(String[] args) {
		
		for(int i = 1; i <= 12; i++){
			System.out.print(i + ":");
			switch(i){
				case 1:
					System.out.println("水瓶座");
					break;
				case 2:
					System.out.println("双鱼座");
					break;
				case 3:
					System.out.println("白羊座");
					break;
				case 4:
					System.out.println("金牛座");
					break;
				case 5:
					System.out.println("双子座");
					break;
				case 6:
					System.out.println("巨蟹座");
					break;
				case 7:
					System.out.println("狮子座");
					break;
				case 8:
					System.out.println("处女座");
					break;
				case 9:
					System.out.println("天秤座");
					break;
				case 10:
					System.out.println("天蝎座");
					break;
				case 11:
					System.out.println("射手座");
					break;
				case 12:
					System.out.println("摩羯座");
					break;
				}
		}
	}

}
