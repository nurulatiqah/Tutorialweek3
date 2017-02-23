package tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class E57 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
			
		String word;
		Scanner scanner = new Scanner(System.in);	
			
		while(true){
			System.out.print("Type a word: ");
			word = scanner.nextLine();
			words.add(word);
			
			if(word.isEmpty()){
				System.out.println("You type the following words: " );
				for (String wordE : words) {		        
			        System.out.println(wordE);
			    }
				break;
			}
			
		}
		
		
			}
	}

