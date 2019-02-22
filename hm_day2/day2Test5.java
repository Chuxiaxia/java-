package hm_day2;

import java.util.Scanner;

public class day2Test5 {

	/**
	 	编写步骤： 
	 	1. 定义一个学生的考试成绩,类型为int,变量名为score 
	 	2. 使用if语句的第三种格式判断考试成绩属于哪个范围 
	 	3. 如果score小于0 或者 score大于100,输出"成绩有误" 
	 	4. 如果score大于等于90并且小于等于100,输出"优秀" 
	 	5. 如果score大于等于80并且小于90,输出"好" 
	 	6. 如果score大于等于70并且小于80,输出"良" 
	 	7. 如果score大于等于60并且小于70,输出"及格" 
	 	8. 如果score小于60,输出"不及格"

	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		int score = sc.nextInt();
		if(score < 0 && score > 100){
			System.out.println("成绩有误！"); 
		}else if(90<=score&&score<=100){
			System.out.println("成绩优秀！");
		}else if(80<=score&&score<=90){
			System.out.println("成绩好！");
		}else if(70<=score&&score<=80){
			System.out.println("成绩良！");
		}else if(60<=score&&score<=70){
			System.out.println("成绩及格！");
		}else{
			System.out.println("成绩不及格！");
		}
		
	}

}
