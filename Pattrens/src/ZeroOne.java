/*
 1
 0 1
 1 0 1
 0 1 0 1
 */
import java.util.Scanner;

public class ZeroOne {

	public static void Pattern (int num) {
		for (int i = 1 ;i <=num ;i++) {
			for (int j = 1; j<=i;j++) {
				if((j+i)%2==0) System.out.print(1+" ");
				else System.out.print(0+" ");
			}
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub



}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		Pattern(num);
		
	}

}
