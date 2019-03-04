package hm_day2;

public class hm_03_ASCII {

	/**
	 ASCII ：让生活中的文字字符对应十进制的数字
	  ★      'a'-> 97  'b'-> 98
		 'A'-> 65  'B'-> 66
		 '0'-> 48  '1'-> 49
	 int和char互相转换，都会取ASCII码表中查找
	 */
	public static void main(String[] args) {
		
		char c1 = 'A';
		System.out.println(c1);
		
		//int转换成char时，去ASCCII码表中，拿65找到对应字母'A'，将'A'赋值给c2。
		char c2 = 65;
		System.out.println(c2);
		
		//char转换成int时，去ASCCII码表中，拿'B'找到对应数字66，将66赋值给i。
		int i = 'B';
		System.out.println(i);
		
		// char + int => int + int => int
		int x = 'C' + 2; 
		//char -> int, 去ASCII码表中对照相应数字。
		System.out.println(x);
		
		//char和int相互转换时，关键看打印出来的类型是什么。

	}

}
