package java_app1;

import java.util.Scanner;

public class Armstrong_40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int add = 0;
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		int num1 = num;
		while(num1>0) {
			int a = num1%10;
			add =  add + (int) Math.pow(a, 3);
			num1 = num1/10;
		}
		System.out.println(add );
		System.out.println(num);
		if(num==add) System.out.println("ArmStrong Number");
		else System.out.println("Not a ArmStrong Number ");
		
		// TODO Auto-generated method stub

	}

		
				
}