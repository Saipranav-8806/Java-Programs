package java_app1;

import java.util.Scanner;

public class Long_Bytes_2 {
	public static void main(String[] args) {
	byte a;
	long b;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter an Long Value: ");
	b = s.nextLong();
	a = (byte)b;
	System.out.println(a);
	
	}



}
