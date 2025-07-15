import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class Sorting_List {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<=5;i++) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			list.add(a);
		}
			
//		9,8,4,5,7,45
		
		
		
		int t = 0; 
		while(t<=list.size()) {
			for(int i1=0;i1<list.size()-1;i1++) {
				int temp = list.get(i1);
				int temp1 =list.get(i1+1);
				int temp2 =0;
				
				if(temp>temp1) {
					temp2 =temp1;
					temp1 = temp;
					
					list.set(i1, temp2);
					list.set(i1+1, temp1);
				}
				
			}
			t++;
		}
		System.out.println(list);
//		System.out.println(System.currentTimeMillis());/
		
		
		
		
	}
	
}

