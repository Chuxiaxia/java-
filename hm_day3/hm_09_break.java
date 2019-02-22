package hm_day3;

public class hm_09_break {

	/**
	 	break: 打断(结束当前循环)
		break作用: 提前结束循环也可以结束switch
		break场景: 放在switch或循环中
	 */
	public static void main(String[] args) {
		// break; // 15: 错误: 在 switch 或 loop 外部中断
		
		for (int i = 0; i < 10; i++) {

			// 当i等于2时,结束循环
			if (i == 2) {
				break; // 当执行break时,for循环就结束了.
			}
			System.out.println("i = " + i); // i = 0, 1
		}

	}

}
