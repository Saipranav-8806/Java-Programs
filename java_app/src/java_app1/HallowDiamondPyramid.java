


/*
     * 		5,*
1234*6*5	4*1*
123*567*4	3*3*
12*45678*3
 *       *2
*         *1
 *       *
  *     *
   *   *
    * *
     *
*/


package java_app1;

import java.util.Scanner;

public class HallowDiamondPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		for(int i =1;i<=num;i++) {
			for(int j =i;j<num;j++) {
				System.out.print(" ");
			}
			for(int j =1;j<=i*2-1;j++) {
				if(j==1 || j==2*i-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
				
			}
			System.out.println();
		}
		
//		DOWN
		
		for(int i =num-1;i>0;i--) {
			for(int j = i;j<num;j++) {
				System.out.print(" ");
			}
			for(int j =1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			
			
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}
}