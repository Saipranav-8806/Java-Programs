package java_app1;

import java.util.Scanner;

public class Type_casting_1 {

	public static void main(String[] args) {
		byte  b;
		char  c;
		float d;
		// TODO Auto-generated method
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter an Integer Value: ");
		int   a = s1.nextInt();
		
		b = (byte)a;
		c = (char)a;
		d = (float)a;
		System.out.println("Int:"+ a + "\nByte: "+ b + "\nChar:"+ c + "\nFloat:"+ d);
		
		 
	}
}