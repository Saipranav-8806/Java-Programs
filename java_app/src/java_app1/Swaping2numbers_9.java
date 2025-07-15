package java_app1;

import java.util.Scanner;

public class Swaping2numbers_9 {

	public static void main(String[] args) {
		
		// USING 3RD VARIABLE
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		System.out.println("Before Swapping: \na=" +a + "\nb="+b);
		int q = a;
		a=b;
		b=q;
		System.out.println("After Swapping: \na=" +a + "\nb="+b);
		
		
		// WITH OUT USING 3RD VARIABLE
		
		
		
		System.out.println("Enter the 1st number");
		int c = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int d = sc.nextInt();
		System.out.println("Before Swapping: \na=" +c + "\nb="+d);
		c = c+d;
		d = c-d;
		c= c-d;
		System.out.println("After Swapping: \na=" +c + "\nb="+d);	

	}

}
