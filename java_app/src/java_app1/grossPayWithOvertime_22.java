package java_app1;

import java.util.Scanner;

public class grossPayWithOvertime_22 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter no.of Hours Worked: ");
		 int hours = sc.nextInt();
		 System.out.println("Enter Rate: ");
		 int rate = sc.nextInt();
		 double Salary = 0;
		 int temp = hours - 40;
		 if (temp>0) {
			 Salary = (40 * rate)+(temp * (rate*1.5));
		}
		 else {
			 Salary = hours * rate; 	
		}
		 System.out.println("Salary par for hours worked = "+Salary);
		 
		 
	 }

}
