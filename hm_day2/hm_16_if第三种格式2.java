package hm_day2;

import java.util.Scanner;

public class hm_16_if第三种格式2 {

	/**
		 指定考试成绩，判断学生等级
			90-100 优秀
			80-89 好
			70-79 良
			60-69 及格
			60以下 不及格
			
		分析:
			有5种情况要判断.使用if第三种格式
	 */
	public static void main(String[] args) {
		// 定义变量
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学生成绩:");
		int score = sc.nextInt();
		if(score < 0 || score > 100){
			System.out.print("输入的成绩有误!!!");
		}else if(90 <= score && score <= 100){
			System.out.print("优秀!");
		}else if(80 <= score && score < 90){
			System.out.print("好!");
		}else if(70 <= score && score < 80){
			System.out.print("良!");
		}else if(60 <= score && score < 70){
			System.out.print("及格!");
		}else{
			System.out.print("不及格!");
		}

	}

}
