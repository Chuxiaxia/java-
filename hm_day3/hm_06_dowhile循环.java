package hm_day3;

public class hm_06_dowhile循环 {

	/**
	 	格式：
	 		do{
	 			循环体语句;
	 			迭代语句;
	 		}while(循环条件);
	 	特点：无条件执行一次循环体，即使我们将循环条件直接写成false，也依然会循 环一次。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do{
			System.out.println("你看那人好像一条🐕诶!"+i);
			i++;
		}while(i<=5);
	}

}
