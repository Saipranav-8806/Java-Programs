package java_app1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelorDigit_25 {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Character: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char character = (char)bf.read();
		switch(character) {
		case 'a':
			System.out.println("Given Character" + character + "is Vowel");
			break;
		case 'e':
			System.out.println("Given Character" + character + "is Vowel");
			break;
		case 'i':
			System.out.println("Given Character" + character + "is Vowel");
			break;
		case 'o':
			System.out.println("Given Character" + character + "is Vowel");
			break;
		case 'u':
			System.out.println("Given Character" + character + "is Vowel");
			break;
		default:
			System.out.println("Given Character" + character + "is Consonant");
		}
		
			
	}

}
