/*
 1 2 3 4
  2 3 4
   3 4
    4
 */

import java.util.Scanner;

public class ReverseNumberTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=num;k++ ) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	

}
