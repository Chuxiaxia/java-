package hm_day3;

public class hm_05_while循环练习3 {
	/**
 	格式：
 		while(循环条件) {
 		    循环体语句；
 		       迭代语句； 
 		}

	 */
	public static void main(String[] args){
		
		int count = 0;
		int i = 1;
		while( i<= 100){
			count += i;
			i++;
		}
		System.out.print("1-100总和：" + count);
	}
}
