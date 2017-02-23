package mooc.fiw3;

import java.util.Scanner;

public class E52 {
	public static void main(String[] args) {
		reversingChar();
	}
	
	public static void reversingChar(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type your name: ");
		String reverse = scanner.nextLine();
		
		for(int i=reverse.length()-1; i>=0;i--){
		char character = reverse.charAt(i);//start with 0
		System.out.println("reverse: " +character); 
		character++;
		}
	}
}
