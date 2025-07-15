/*

* * * *
* * * *
* * * *
* * * *

*/

import java.util.Scanner;

public class SquareFill {

	public static void pattren(int num) {
		for(int i =1;i<=num;i++) {
			for(int j =1;j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		pattren(num);
	}

}
