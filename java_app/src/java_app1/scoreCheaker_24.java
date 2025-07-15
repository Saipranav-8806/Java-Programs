 package java_app1;

import java.util.Scanner;

public class scoreCheaker_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Score: ");
		float num = sc.nextFloat();
		if (num>1)
			System.out.println("Input Exceeded the Range... Enter below 1.0");
		else {
			if (num>=0.9) System.out.println("Grade A");
			else if (num>=0.8) System.out.println("Grade B");
			else if (num>=0.8) System.out.println("Grade C");
			else if (num>=0.7) System.out.println("Grade D");
			else if (num>=0.6) System.out.println("Grade E");
			else if (num<=0.6) System.out.println("Grade F");
		}
		
		
		// TODO Auto-generated method stub

	}

}
