package java_app1;

import java.util.Scanner;

public class leapYear_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		if (year%400==0||(year%4==0) && year %100!=0 )
			System.out.println("Is a Leap Year");
		else
			System.out.println("Is Not A Leap Year");

			
	}
}
