package java_app1;

import java.util.Scanner;

public class Sumofeachdigit_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int num =  sc.nextInt();
		int temp =num;
		int ans = 0;
		while(temp>0) {
			ans = ans + temp%10;
			temp = temp/10;
		}
		System.out.println("Sum of all individuals: " + ans);
		
		// TODO Auto-generated method stub

	}

}
