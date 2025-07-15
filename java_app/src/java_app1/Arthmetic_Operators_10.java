package java_app1;

import java.util.Scanner;

public class Arthmetic_Operators_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value: ");
		int a = sc.nextInt();
		System.out.println("Enter B value");
		int b = sc.nextInt();
		int Add = a+b;
		int Sub = a-b;
		int Mul = a*b;
		int Div = a/b;
		int mod = a%b;
		System.out.println("ADD:" +Add+ "\nSUB: " +Sub+ "\nMUL: " +Mul+ "\nDIV:" +Div+ "\nMOD: "+mod);
		// TODO Auto-generated method stub

	}

}
