package java_app1;

import java.util.Scanner;

public class Divisibleby5_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		String res = a%5==0 ? "Yes...The number is Divisible by 5" : "No... The number is not Divisible by 5";
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
