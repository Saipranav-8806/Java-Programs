public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(Factorial1(4));
		

	}
	
	public static int Factorial1(int a) {
		
		for(int i = a-1 ;i>0;i--) {
			a = a*i;
		}
			
		return a;
		
	}

}
