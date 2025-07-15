package java_app1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class UPPER_LOWER_CASE_18 {

	public static void main(String[] args) throws IOException {
		char a;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Alphabet: ");
		a = (char)bf.read();
		if (a>=97 && a<=123) {
			System.out.println("Lower Case");
		}else if (a>=65 && a<=90) {
			System.out.println("Upper Case");
		}
		else if (a>=48 && a<=57) {
			System.out.println("Digit");
		}
		else
			System.out.println("Not a Digit or Alphabet");
		
		
				
		// TODO Auto-generated method stub

	}

}
