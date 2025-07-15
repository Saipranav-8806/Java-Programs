package java_app1;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		String revNum = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int temp =num;
		while(temp>0) {
			int digit = temp%10;
			revNum = revNum +  digit ;
			temp = temp/10;
		}
		
		System.out.println("Reversed Number is : " + Integer.parseInt(revNum));
		
	}

}
