/*

* * * * *(5)
 *     *8
  *   *7
   * *6
    *5
    
*/

package java_app1;

import java.util.Scanner;

public class HollowReverseTriangle {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i =num;i>0;i--) {
//			System.out.println(i);
			if(i==num) {
				for(int j = 1; j<=num;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {

				for(int j = i;j<num;j++) {
					System.out.print(" ");
				}
				if(i<num) {
					for(int j =1;j<=2*i-1;j++) {
						if(j==1||j==2*i-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					
					System.out.println();
				}
				
			}
		}
		
	}

}
