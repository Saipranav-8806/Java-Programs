
public class SquareRoot {

	public static void main(String[] args) {
		int num = 4;
		int start = 1;
		int end= num/2;
		
		for(int i = start ; i<=end;i++) {
			if(i*i == num) {
				System.out.println("The SquareRoot of "+num+" is: " + i);
				break;
			}
		}
	}

}
