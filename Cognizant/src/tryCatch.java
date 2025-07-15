
public class tryCatch {

	public static void main(String[] args) {
		int num =5;
		
		for(int i = num ; i>=0;i--) {
			try{
				int k = num/i;
				System.out.println(i);
			}
			catch (ArithmeticException e){
				System.out.println(e.getMessage());
				
			}
		}
	}

}
