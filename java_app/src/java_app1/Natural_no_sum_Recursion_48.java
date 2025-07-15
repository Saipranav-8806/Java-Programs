package java_app1;

import java.util.Scanner;

public class Natural_no_sum_Recursion_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number");
		int num = sc.nextInt();
		sc.close();
		
		addRec(0, num);
	}
	static int addRec(int start,int num) {
		start++;
		if(start==num) return 0 ;
		else {
			int start1 = 0;
			start1 = start + start1;
			addRec(start, num);
			System.out.print(start1);
			return 0;
		}
	}
}