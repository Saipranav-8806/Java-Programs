package java_app1;

import java.util.Scanner;

public class Greater_Less_Equal_19 {

	public static void main(String[] args) {
		int a ,b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		b = sc.nextInt();
		
		String res = a>b? "A=" + a + " is Greater":b>a?"B=" + b + " is Greater" : "Both Are Equal";
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
