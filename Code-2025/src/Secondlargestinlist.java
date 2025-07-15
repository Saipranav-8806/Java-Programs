import java.util.ArrayList;

public class Secondlargestinlist {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(15);
		a.add(14);
		a.add(13);
		a.add(12);
		a.add(11);
		System.out.println(a);
		System.out.println(function(a));
	}
	
	
	
	public static int function(ArrayList<Integer> b) {
		int sec = 0;
		int now = 0;
		int fir = b.get(0);
		for(int i =0; i<b.size();i++) {
			now = b.get(i);
			if(now>fir) {
				sec= fir;
				fir = now;
				
			}	
			else if (now < fir && now > sec ) {
				sec = now;
			}
//			System.out.println(fir);
//			System.out.println(sec);
		}
//		ArrayList<Integer> a1 = new ArrayList<>();
//		a1=b;
//		a1.remove(sec);
//		if(b.size()==4) {
//			System.out.println("Second largest number:"+fir);
//		}
//		else {
//			function(a1);
//		}
		return sec;	
	}	
}