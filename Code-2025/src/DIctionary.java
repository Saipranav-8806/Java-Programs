import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DIctionary {

	public static void main(String[] args) {
		
//		{'A': 67, 'B': 23, 'C': 45}
		Map<String, Integer> dictionary = new HashMap<>();
		Map<Integer,String > resultDictionary = new HashMap<>();

		dictionary.put("A", 67);
		dictionary.put("B", 23);
		dictionary.put("C", 45);
		System.out.println(dictionary);
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();
		
		
		Set<String> a3 = dictionary.keySet();
		
		a1.addAll(dictionary.values());
		a2.addAll(a3);
		
		for(int i=0;i<dictionary.size();i++) {
			resultDictionary.put(a1.get(i), a2.get(i));			
		}
		System.out.println(resultDictionary);
//		System.out.println("1:"+a1);
//		System.out.println("2:"+a2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println( dictionary);	
//		 for (Integer value : dictionary.values()) {
//			 for (String key : dictionary.keySet()) {
//				 resultDictionary.put(value,key );
//		     }
//		 }
//		 System.out.println(resultDictionary);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		
//		
////		for(int i =0;i<dictionary.size();i++) {
////			abc.add(null);
////		}
//		System.out.println(dictionary);
////		dictionary.get(67);
//		 
////		 Collection<Integer> valueA2 = dictionary.values();
////		 Collection<String> valueA1 = dictionary.keySet();
////		 
//		 
//////		System.out.println(dictionary.size());
////		for(int i =0;i<dictionary.size();i++) {
////			resultDictionary.put(valueA2,valueA1);
////		}
////		System.out.println(valueA1);
//		System.out.println(valueA2);
////        System.out.println(resultDictionary);
//	
		}


}