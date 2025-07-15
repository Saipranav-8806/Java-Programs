package java_app1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade_as_input {

	public static void main(String[] args) throws IOException {
		char a;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Students Grade: ");
		a = (char)bf.read();
		
		if (a == 'A' || a == 'a')
			System.out.println("Student Scored between 80 and 100 ");
		else if (a == 'B' || a == 'b') 
			System.out.println("Student Scored between 60 and 79 ");
		else if (a == 'C' || a == 'c')
			System.out.println("Student Scored between 40 and 59 ");
		else
			System.out.println("Faied");
		


								
		
		
		// TODO Auto-generated method stub

	}

}
