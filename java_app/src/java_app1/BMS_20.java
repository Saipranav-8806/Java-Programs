package java_app1;

import java.util.Scanner;

public class BMS_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height: ");
		int height = sc.nextInt();
		System.out.println("Enter Weight: ");
		int weight = sc.nextInt();
		
		float BMS = weight % (height*height);
		System.out.println("Your BMS Value is: " + BMS);
		if(BMS<=18.5 ) {
			System.out.println("UnderWeight");
		}
		else if(BMS<=25 ) {
			System.out.println("Weight is Normal");
		}
		else if(BMS<=30 ) {
			System.out.println("OverWeight");
		}
		else if(BMS<=35 ) {
			System.out.println("Obese");
		}
		
		// TODO Auto-generated method stub

	}

}
