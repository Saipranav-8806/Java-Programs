import java.util.ArrayList;

public class NehaYeddiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Primenumber(5);

	}

	public static void Primenumber(int num) {
		int count = 0;
		ArrayList<Integer> list1 = new ArrayList<>();

		for (int i = 1; i <= num; i++) {

			count = 0;
			for (int j = 2; j < i / 2; j++) {
				if ((i % j == 0) && (i != j)) {
//					System.out.println(i + "N");
					count = +1;
//					break;
				}
			}
			if (count == 0) {
				list1.add(i);
			}
		}
		System.out.println(list1);
		pattern(list1);

	}

	public static void pattern(ArrayList<Integer> list1) {

        int num  = list1.size();
        for(int i=1;i<=num;i++){
            for(int j =i ; j<num;j++){
                System.out.print(" ");
            }
            System.out.print(i);
            
            for(int k =1;k<i;k++){
                System.out.print("_"+i);
            }
            System.out.println();
        }
        
        
        
        for(int i=num-1;i>=1;i--){
            
            for(int j =i ; j<num;j++){
                System.out.print(" ");
            }
            System.out.print(i);
            
            for(int k =1;k<i;k++){
                System.out.print("_"+i);
            }
            System.out.println();
        }		
	}
}