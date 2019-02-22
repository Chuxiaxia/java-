package hm_day3;

public class hm_08_for循环嵌套练习2 {

	/**   
		列数变化    
		第一行：1列    j=0,j<=0,j++    i=0
		第二行：2列    j=0,j<=1,j++    i=1
		第三行：3列    j=0,j<=2,j++    i=2
		第四行：4列    j=0,j<=3,j++    i=3
		第五行：5列    j=0,j<=4,j++    i=4
		j <= i 
	 */
	public static void main(String[] args) {
			// 外部循环控制输出行数
			for(int i = 0; i < 5; i++){
				//内部循环控制输出一行个数
				for(int j = 0; j <= i; j++){
					System.out.print("*"); //不换行
				}
				System.out.println();  //换行
			}
		
	}

}
