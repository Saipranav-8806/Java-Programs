import java.util.Scanner;

public class perfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int ans = 0;
		for (int i = 1  ; i < num ; i++) {
			if (num%i==0) {
				ans = ans + i;
				System.out.println("Found a Factor: " + i);
			}
		}
		System.out.println("By adding all the Factors we get: " + ans);
		String res =  (ans == num) ? "Perfect Number" : "Not a Perfect Number";
		System.out.println(res);
	}

}
