package mooc.fiw3;

import java.util.Scanner;

public class E48 {
	public static void main(String[] args){
			firstCharacter(null);	
	}
	
	public static char firstCharacter(String word){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type your name: ");
		word = scanner.nextLine();
		
		char character = word.charAt(0);//start with 0
		System.out.println("Number of FIRST character " + character); 
		return character;
	}
}
