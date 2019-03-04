package hm_day2;

public class hm_08_赋值运算符 {

	/**
	  =: 将右边值赋值给左边的变量
	  +=：i+=1 => i=i+1
	  -=；i-=1 => i=i-1
	  *=：i*=1 => i=i*1
	  /=：i/=1 => i=i/1
	  %=：i%=1 => i=i%1
	 */
	public static void main(String[] args) {

		int a=1;
		a+=2;
		System.out.println(a); // 3
		
		int b=2;
		b-=2;
		System.out.println(b); // 0
		
		int c=3;
		c*=2;
		System.out.println(c); // 6
		
		int d=4;
		d/=2;
		System.out.println(d); //2
		
		int e=5;
		e%=3;
		System.out.println(e); //2

	}

}
