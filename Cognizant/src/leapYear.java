public class leapYear {
	public static void main(String[] args) {
		System.out.println(leap(100) );
	}

	public static String leap(int year) {
		if (year %4==0) {
			if(year%400 == 0) return "LeapYear";
			else if(year%100==0) return "Not A Leap Year";

			return "LeapYear";
		}
		else return "Not A Leap Year";

	}
}
