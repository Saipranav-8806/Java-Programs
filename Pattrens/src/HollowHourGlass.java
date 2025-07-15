/*

* * * * * * 
 *       * 
  *     * 
   *   * 
    * * 
     * 
    * * 
   *   * 
  *     * 
 *       * 
* * * * * * 

 */
import java.util.Scanner;

public class HollowHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUmber:");
		int num = sc.nextInt();
//		int num =6;
		for(int i = num;i>1;i--) {
			if(i!=num ) {
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
			if(i==num) {
				for(int j =1;j<=num;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
//		Down
		for(int i =1;i<=num;i++) {
			if(i!=num) {
				for(int j =i;j<num;j++) {
					System.out.print(" "); 
				}
				for(int j = 1;j<=2*i-1;j++) {
					if(j==1||j==2*i-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				System.out.println();
			}
			else {
				for(int j =1;j<=num;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
				
		}
		
		// TODO Auto-generated method stub



}

}
