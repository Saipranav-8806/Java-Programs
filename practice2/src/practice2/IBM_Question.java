package practice2;

import java.util.ArrayList;
import java.util.List;

//c = new employes arrive	if available takes or purchase new 
//r = employes leaves meeting room frees the chair
//u = new employes arrive	if available takes or purchase new
//l = employes leaves meeting room frees the chair

public class IBM_Question {

	public static void main(String[] args) {
		int availableChairs = 0;
		int purchasedChairs = 0;
		List<String> list=new ArrayList<String>();
		list.add("CCRUCL");
		for (String a : list) {
			for(char i : a.toCharArray()) {
				switch (i) {
					case 'C':
					case 'U':
						if (availableChairs >0) {
							availableChairs--;
						}
						else purchasedChairs++;
						break;
					
					case 'R':
					case 'L':
						availableChairs++;
						break;					
				}
				
						
				
			}
			System.out.println(purchasedChairs);
		}
	}

}
