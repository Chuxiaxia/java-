package hm_day3;

public class day3Test4 {

	/**
	 	编写步骤：
	 	 	1. 使用for循环,初始化变量为i=1 
	 	 	2. for循环条件为:i<=15进入循环 
	 	 	3. for循环步进表达式为i++ 
	 	 	4. 在for循环里面,如果i是3的倍数,使用continue跳过 
	 	 	5. 在for循环里面,如果i不是3的倍数,打印i 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 15; i++){
			if(i % 3 ==0){
				continue;
			}else{
				System.out.println("i：" + i);
			}
		}
	}

}
