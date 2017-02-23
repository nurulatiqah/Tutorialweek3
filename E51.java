package mooc.fiw3;

import java.util.Scanner;

public class E51 {
	public static void main(String[] args){
		separatingCharacter();	
}

public static void separatingCharacter(){
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Type your name: ");
	String separate = scanner.nextLine();
	
	for(int i=0; i<=separate.length()-1;i++){
	char character = separate.charAt(i);//start with 0
	System.out.println("Character: " +character); 
	character++;
	}
}
}
