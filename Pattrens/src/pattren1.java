import java.util.Scanner;

public class pattren1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ennter no: ");
		int num = sc.nextInt();
		for (int i = 0 ; i <=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();		
			
		}
		
		// TODO Auto-generated method stub

	}

}
