package java_app1;

import java.util.Scanner;

public class ternary_greatestamong3 {
	public static void main(String[] args) {
		int a ,b ,c ,d ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		b = sc.nextInt();
		System.out.println("Enter 3rd number:");
		c = sc.nextInt();
		d  = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest number among given is "+d);
	}

}
