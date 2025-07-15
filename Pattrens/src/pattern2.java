import java.util.Scanner;

public class pattern2 {
	public static void main(String[] aargs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No:");
		int num = sc.nextInt();
		for (int i = num;i>=1;i--) {
			
			for(int j = 1;j<i;j++){
				System.out.print(" ");
			}
			
			for(int j = 0;j<=num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
