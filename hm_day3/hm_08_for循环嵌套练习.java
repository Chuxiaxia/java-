package hm_day3;

public class hm_08_for循环嵌套练习 {

	/**
	 	使用嵌套循环，控制打印3行5列星星

	 */
	public static void main(String[] args) {
		// 外部循环控制输出行数
		for(int i = 0; i < 3; i++){
			//内部循环控制输出一行个数
			for(int j = 0; j < 5; j++){
				System.out.print("*"); //不换行
			}
			System.out.println();  //换行
		}
	}

}
