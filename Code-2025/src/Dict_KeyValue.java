import java.util.ArrayList;
import java.util.Arrays;

public class Dict_KeyValue {
	public static void main(String[] args) {
		//list = [1,3,2,5,8,10,7]
		//output = [1,2], [2,3], [7,8]
		
		
		Integer[] a = {1,3,2,5,8,10,7};
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(a));
		
		ArrayList<Integer> a2 = sorting(a1);
		
		 ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		for(int i =0;i<a2.size()-1;i++) {
			if(a2.get(i) +1 == a2.get(i+1)) {
				ArrayList<Integer> res = new ArrayList<>();
				res.add(a1.get(i));
				res.add(a2.get(i+1));
				result.add(res);
				}
		}
		System.out.println(result);
	
	
		
	}
	public static ArrayList<Integer> sorting(ArrayList<Integer> a1) {
		int t = 0; 
		while(t<=a1.size()) {
			for(int i1=0;i1<a1.size()-1;i1++) {
				int temp = a1.get(i1);
				int temp1 =a1.get(i1+1);
				int temp2 =0;
				
				if(temp>temp1) {
					temp2 =temp1;
					temp1 = temp;
					
					a1.set(i1, temp2);
					a1.set(i1+1, temp1);
				}
				
			}
			t++;
		}
		
		return a1;
	}
}


	

