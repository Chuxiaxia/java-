package hm_day3;

public class day3Test8 {

	/**
	 	打印『X』对称图形
	 	开发提示： 
		 	平面图形涉及到有行有列，考虑到嵌套for循环 
		 	一个外循环控制行，一个内循环控制输出内容 
		 	在内循环中，根据变量的变化规律，判断输出"O"还是"*"
		 分析：
		 	1.有行有列.（嵌套for循环）
		 	2.外循环控制行;内循环控制列.
		 	3.全当*打印.
		 	4.有些地方需要打印0.
	 */
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++){
			// 外循环控制行
			for(int j = 0; j < 7; j++){
				// 内循环控制列
				
				if(i == j || i + j == 6){
					System.out.print("O");
				}else{
					System.out.print("*");
				}
				
			}
			// 再换行
			System.out.println();
		}

	}

}
