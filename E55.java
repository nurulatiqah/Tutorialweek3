package tutorial;

import java.util.Scanner;

public class E55 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Type the first word: ");
			String word = scanner.nextLine();
			
			System.out.println("Type the second word: ");
			String word2 = scanner.nextLine();
			
			int index = word.indexOf(word2); 
				
			if(index==word.indexOf(" ")){
			System.out.println("The word '" +word2 +"' is NOT in '" +word +"'");
			}	else if(index==word.indexOf(word2)){
				System.out.println("The word '" +word2 +"' is in '" +word +"'");
			}
		
		}
		}



