package tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class E58 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
			
		String word;
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("Type a word: ");
			word = scanner.nextLine();
			
			if (words.contains(word)) {
			System.out.println("The word " +word +" is twice");
			break;
			}
			words.add(word);				
		}		
			}
}
	
			