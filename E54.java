package mooc.fiw3;

import java.util.Scanner;

public class E54 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a word: ");
		String word = scanner.nextLine();
		System.out.print("Length of the last part: ");
		int len = scanner.nextInt();
			System.out.println(word.length());
			System.out.println("Result: " +word.substring(word.length()-len,word.length())); //prints
		}
		}
