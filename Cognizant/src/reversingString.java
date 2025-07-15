
public class reversingString {

	public static void main(String[] args) {
//		revStr("Saai");
		
		split("saipranav");

	}
	
	public static void revStr(String a) {
//		System.out.println(a.length());
		for(int i =a.length()-1 ; i>=0 ;i--) {
			System.out.print(a.charAt(i));			
		}
	}
	
	
	public static void split(String a) {
		
		String[] a1 = a.split("");
		String res = "";
		for(String i : a1) {
			res = i +res;
		}
		System.out.println(res);
	}
}