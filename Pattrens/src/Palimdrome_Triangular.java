/*
    1
   212
  32123
 */

public class Palimdrome_Triangular{
	public static void pattern (int num) {
//		Outer Loop
		for(int i =1;i<=num;i++) {
//			Inner Loop for Spaces
			for(int j=i;j<=num;j++) {
				System.out.print("  ");
			}
//			Left Side
			for (int j =i;j>0;j--) {
				System.out.print(j +" ");
			}
//			Right Side
			
			for(int k =2;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		pattern(5);
	}
}