package java_app1;

import java.util.Scanner;

public class ReverseSumDoWhile_44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		sc.close();
		int res = 0, resadd= 0;
		
		int temp = num ;
		do{
			int digit  = temp%10;
			res = res + digit;
			resadd = resadd + digit;
			temp = temp/10;
						
		}while(temp>0);
		System.out.println(res);
		System.out.println(resadd);
	}

}
