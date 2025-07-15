package java_app1;

import java.util.Scanner;

public class pre_post_increment_8 {

	public static void main(String[] args) {
		int b,c,d,e,f,g,h,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a = s.nextInt();
		b = a++;
		c = ++a;
		d = a--;
		e = --a;
		System.out.println("pre and post increment and decrement  "+ b + c + d +e);
		
		
		
	}

}
