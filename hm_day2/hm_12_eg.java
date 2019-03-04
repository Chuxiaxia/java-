package hm_day2;

public class hm_12_eg {

	/**
		 获取一个三位数个位，十位，百位 （678）
		 个位：8  678 % 10 = 8
		 十位：7  678 / 10 = 67  67 % 10 = 7
		 百位：8  678 / 100= 6
	 */
	public static void main(String[] args) {
		
		int num = 678;
		//个位
		int ge = num % 10;
		//十位
		int shi = num / 10 % 10;
		//百位
		int bai = num / 100;
		
		System.out.println(bai + ":" + shi + ":" + ge);
	}

}
