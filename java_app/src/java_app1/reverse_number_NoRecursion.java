package java_app1;

import java.util.Scanner;

public class reverse_number_NoRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		int num = 123;
		System.out.println();
		while(num>0) {
			int res = num%10;
			num = num/10;
			System.out.print(res);
		}
	}

}
