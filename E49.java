package mooc.fiw3;

import java.util.Scanner;

public class E49 {
	public static void main(String[] args){
		E49 e =new E49();
		e.lastCharacter("hai");	
}

public static char lastCharacter(String word){
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Type your name: ");
	word = scanner.nextLine();
	
	char character = word.charAt(word.length()-1);//start with 0
	System.out.println("Last character " + character); 
	return character;
}
}
