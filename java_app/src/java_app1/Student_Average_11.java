package java_app1;

import java.util.Scanner;

public class Student_Average_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Subject wise Student Marks");
		System.out.println("Marks scored in Maths:");
		int Maths  = sc.nextInt();
		System.out.println("Marks scored in Physics:");
		int Physics = sc.nextInt();
		System.out.println("Marks scored in Chemistry:");
		int Chemistry = sc.nextInt();
		int Total = Maths + Physics + Chemistry;
		System.out.println("Total Marks Scored By Student: "+ Total);
		float Avg = Total/3;
		System.out.println("Average: "+ Avg);
		
		
		
		// TODO Auto-generated method stub

	}

}
