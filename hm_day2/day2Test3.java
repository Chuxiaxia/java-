package hm_day2;

public class day2Test3 {

	/**
		 编写步骤： 
			 1. 定义类 Test3 
			 2. 定义 main方法 
			 3. 定义 int类型变量i1 和 long类型变量l1 
			 4. 定义变量add,保存i1和l1的和,并输出.
			 5. 定义 long类型变量l2 和 ﬂoat类型变量f2 
			 6. 定义变量add2,保存l2和f2的和,并输出. 
			 7. 定义 int类型变量i3 和 double类型变量d3 
			 8. 定义变量add3,保存i3和d3的和,并输出. 

	 */
	public static void main(String[] args) {
		
		int i1 = 100 ;
		long l1 = 200;
		long add = i1 + l1;
		System.out.println("add的值："+add);
		
		long l2 = 500000;
		float f2 = 500000.44f;
		float add2 = l2 + f2;
		System.out.println("add2的值："+add2);
		
		int l3 = 500000;
		double d3 = 500000.45;
		double add3 = l3 + d3;
		System.out.println("add3的值："+add3);
			
	}

}
