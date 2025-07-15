package java_app1;

import java.util.Scanner;

public class Burger_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of burger");
		System.out.println(">1 - Mini ");
		System.out.println(">2 - Normal ");
		System.out.println(">3 - Large ");
		int size = sc.nextInt();
		if (size == 1 || size ==2 || size ==3) {
			System.out.println("Mushroom Needed \n>1 - Yes \n>2 - No" );
			int mushroom = sc.nextInt();
			System.out.println("Extra Cheese Needed \n>1 - Yes \n>2 - No" );
			int cheese = sc.nextInt();
					
			int price = 0;
			if (size == 1)
				price = 5;
			else if(size == 2)
				price = 8;
			else if(size == 3)
				price = 10;
			
			
			
			if (cheese==1)
				price = price +1;
			
			if (mushroom ==1) {
				if( size==1 ||size ==2)
					price = price +1;
				else
					price = price +2;
				
			System.out.println("Price of your order: "+price);
			}else {
				price = price+ 0 ;
				System.out.println("price of your order: "+price);
			}
		}
		else
			System.out.println("Enter valid input");
		
		
			// TODO Auto-generated method stub

	}

}
