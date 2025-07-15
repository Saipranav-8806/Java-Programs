package java_app1;

import java.util.Scanner;

public class positive_Negative_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		if (a>0)
			System.out.println("Positive");
		else if (a<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		
		// TODO Auto-generated method stub

	}

}
