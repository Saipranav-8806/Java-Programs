
public class fibonacci {

	public static void main(String[] args) {
		fibonacci1(6);
		

	}
	
	
	public static void fibonacci1(int a) {
		int fd = 0;
		int sd = 1;
		System.out.print(0 + " ");
		System.out.print(1+ " ");
//		011235
		for(int i =0;i<a-1 ;i++) {
			int td = fd +sd;
			fd = sd;
			sd = td;
			
			System.out.print(sd);
			System.out.print(" ");
			
		}
		return;
	}

}
