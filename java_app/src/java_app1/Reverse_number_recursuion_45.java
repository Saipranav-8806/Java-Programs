package java_app1;

public class Reverse_number_recursuion_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print(reverseNum(123));
		reverseNum(99909880);		
		
	}
	public static void reverseNum(int a) {
		int res = a%10;
		System.out.print(res);
		a = a/10;
		if(a>0) reverseNum(a);
		
	}
}

