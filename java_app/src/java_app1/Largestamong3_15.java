package java_app1;

import java.util.Scanner;

public class Largestamong3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Value: ");
		int a = sc.nextInt();
		System.out.print("Enter 2st Value: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd  st Value: ");
		int c = sc.nextInt();
		if(a>b && a>c)
			System.out.println("A is grater" + a);
		else if (b>a&&b>c)
			System.out.println("B is greater "+b);
		else
			System.out.println("C is greater "+c +"\n\n");
		
		
		System.out.print("Enter 1st Value: ");
		int a1 = sc.nextInt();
		System.out.print("Enter 2st Value: ");
		int b1 = sc.nextInt();
		System.out.print("Enter 3rd  st Value: ");
		int c1 = sc.nextInt();
		int res = (a1>b1 && a1>c1)? a1 : (b1>a1 && b1>a1)?b1:c1;
		System.out.println(res);
		
		// TODO Auto-generated method stub

	}

}
