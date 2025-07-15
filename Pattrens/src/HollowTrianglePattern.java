/*
1234*		4,0---71	 
123*5*6  	3,1---2 
12*456*7		2,3---3	  
1*34567*8	1,5---4  
* * * * *9    0

*/

import java.util.Scanner;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
//		
		for(int i = 1;i<=num;i++) {
			if(i==num) {
				for(int p =1;p<=num;p++) {
					System.out.print("* ");
				}
			}
			else {

				for(int j =i;j<num;j++) {
					System.out.print(" ");
				}
				
				for(int k =1;k<=(num*2-1);k++) {
					if(k==1 || k==i*2-1 ) {
						System.out.print("*");						
					}
					else if(i!=num) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			
		}
	}
}
// TODO Auto-generated method stub
