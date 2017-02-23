package mooc.fiw3;
import java.util.Scanner;
public class E50 {
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your name: ");
	String word = scanner.nextLine();
		
		if(word.length()<3){
		//System.out.println();
		}
		else if(word.length()>2)
		{
		for(int i=0;i<3;i++){
	char character = word.charAt(i);	
	System.out.println("Character " + character); 

		}
		}
	}
}