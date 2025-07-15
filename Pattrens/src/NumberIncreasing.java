import java.util.Scanner;
/*
 1
 1 2
 1 2 3
 1 2 3 4
 */

public class NumberIncreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
//		Outer Loop for Rows
		for(int  i=0;i<=num;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		// TODO Auto-generated method stub

	}

}
