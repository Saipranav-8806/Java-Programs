/*
 * * * *
  * * * *
   * * * *
    * * * *
      
     
     
 */

import java.util.Scanner;

public class Rhombus {
	public static void pattern(int num) {
//		Outer Loop
		for(int i=0; i<num;i++) {
//			Inner Loop For Spaces
			for(int j =1;j<=i;j++) {
				System.out.print(" ");			
			}
			for(int j =1;j<=4;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter the Number");		
		pattern(num);
		
	}

}
