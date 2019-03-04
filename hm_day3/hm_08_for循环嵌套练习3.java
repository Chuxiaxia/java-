package hm_day3;

public class hm_08_for循环嵌套练习3 {
	
	public static void main(String[] args) {
		
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
