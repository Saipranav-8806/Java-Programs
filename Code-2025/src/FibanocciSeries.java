import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int inp = sc.nextInt();
		sc.close();
		String res = " ";

		int num1 = 0;
		int num2 = 1;
		System.out.print("{");
		for (int i = 0; i < inp; i++) {
			res = num1+"";
			System.out.print(res);

			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}
		System.out.println("}");

	}
}
