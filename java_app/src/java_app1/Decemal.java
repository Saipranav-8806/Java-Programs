package java_app1;

import java.util.Scanner;

public class Decemal{
	public static void main(String[] args) {
		String x = "";
		System.out.println("Enter a Number: ");
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		while(a>0) {
			int b =  a%2;
			x = x +b;
			a = a/2;
		}
		System.out.println(x);
	}
}
