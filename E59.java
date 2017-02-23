package mooc.fiw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E59 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		while(true){
		System.out.print("Give a words: ");
		String wordE = scanner.nextLine();
		words.add(wordE);
		
		if(wordE.isEmpty()){
		System.out.println("You type the following words: " );
		Collections.reverse(words);
		 for (String word : words) {
		        System.out.println(word);
		    }
		 break;
		}
	}
}
}