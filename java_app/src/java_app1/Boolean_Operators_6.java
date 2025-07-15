package java_app1;

import java.util.Scanner;

public class Boolean_Operators_6 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter a boolean Value: ");
		boolean a = s.nextBoolean();
		System.out.println("Enter a boolean Value: ");
		boolean b = s.nextBoolean();
		boolean c = a&b;
		boolean d = a|b;
		boolean e = a^b;
		boolean f = !a;
		boolean g = !a&b;
		System.out.println("Given a = "+ a + " and b =" +b);
		System.out.println("a&b = " + c +"\na|b = " + b +"\na^b = " + e + "\n!a = " + f +"\n!a&b = " + g);
	}

}
