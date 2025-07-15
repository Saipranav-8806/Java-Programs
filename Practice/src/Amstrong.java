import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int  Temp =0 ;
		int count =0;
		while(Temp>0) {
			count++;
			Temp = Temp/10;
		}
		System.out.println("NO.of Digits= "+count);
		int temp = num;
		int digit = 0;
		while(temp>0) {
			digit = digit + (int)Math.pow(temp%10,count);
			temp = temp/10;			
		}
		System.out.println("After Processing the value is: "+digit);
		String ans = num == digit ? "It is a Amstrong Number":"Not a Amstrong Number";
		System.out.println(ans);
		
	}

}
