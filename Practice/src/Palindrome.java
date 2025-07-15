import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int Temp = num;
		int Temp1 = 0;
		int res = 0;
		while(Temp>0) {
			Temp1 = Temp %10;
			res = res *10 + Temp1;
			Temp = Temp/10;
				
		}
		System.out.println("Reverse of input= "+res);
		
		String ans = res == num ? "Palindrome Number" : "Not a Palindrome Number";
		System.out.println(ans);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
