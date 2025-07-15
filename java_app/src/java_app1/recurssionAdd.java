package java_app1;

import java.util.Scanner;

class recurssionAdd{
	static int sum = 0;
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recurssionAdd obj= new recurssionAdd();
		int a = obj.add(n);
		System.out.println("Sum is: " + a);
	}
	
	
	
	
	
	
	
	
	public static int add(int n){
		sum = n%10;
		if(n==0) {
			return 0;
		}
		else {
			return sum+add(n/10);
		}
		
		
	}
	
}
