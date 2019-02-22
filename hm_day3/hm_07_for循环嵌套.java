package hm_day3;

public class hm_07_for循环嵌套 {

	/**
	 	for(初始化语句; 循环条件; 迭代语句) {
	 	    ...// 其他语句    
	 	 	for(初始化语句; 循环条件; 迭代语句) {
	 	 	        循环体语句;    
	 	 	}
	 	 	    ...// 其他语句
	 	 }
	 	 
	 	 1.嵌套循环是外循环每次执行一次，内循环要完整执行完所有次。
		 2.总共的循环次数=外循环次数*内循环次数

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.println("我爱你"+ i + "---" + j);
			}
		}
	}

}
