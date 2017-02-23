package mooc.fiw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E60 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.print("Type a word ");
			String wordE = scanner.nextLine();
			words.add(wordE);
			
			if(wordE.isEmpty()){
			System.out.println("You type the following words: " );
			Collections.sort(words);
			 for (String word : words) {
			        System.out.println(word);
			    }
			 break;
			}
		
	}
}
}