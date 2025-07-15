public class sumOfnnUsingRecurssion {

	public static void main(String[] args) {
		System.out.println(addRec(5));
		
	}
	
	public static int addRec(int givenNumber) {
		if(givenNumber ==0) {
			return 1;
		}
		return givenNumber * addRec(givenNumber-1);
	}

}
