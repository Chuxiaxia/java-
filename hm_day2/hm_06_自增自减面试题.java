package hm_day2;

public class hm_06_自增自减面试题 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		int c = 10;
		a = b++;
		//a=10,b=11,c=10
		c = --a;
		//a=9,b=11,c=9
		b = ++a;
		//a=10,b=10,c=9
		a = c--;
		//a=9,b=10,c=8
		System.out.println(a); //9
		System.out.println(b); //10
		System.out.println(c); //8
		
		int k = 5;
		int z = k++ + ++k + k*3;   
		//z = 5  +7 + 21
		System.out.println(z);
	}

}
