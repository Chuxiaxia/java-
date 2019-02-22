package hm_day1;

public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		System.out.println("  *");
		System.out.println(" * *");
		System.out.println("*   *");
		System.out.println(" * *");
		System.out.println("  *");
		*/
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 5; j++){
				if(i + j == 4 || i + j == 8){
					System.out.print("*");
				}else if((i==2&&j==4)||(i==4&&j==2)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
