package hm_day2;

public class hm_14_if第一种格式 {

	/**
		执行流程：
			1.判断关系表达式看结果是true还是false
			2.(1)如果是true就执行语句体
			  (2)如果是false就不执行语句体
		格式：
			if(关系表达式){
				语句体;
			}
	 */
	public static void main(String[] args) {
		
		System.out.println("我爱你!");
		int age = 20;
		if(age >= 20){
			System.out.println("我到法定结婚年龄了");
		}
		System.out.println("我们结婚吧!");
	}

}
