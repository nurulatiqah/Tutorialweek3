package mooc.fiw3;
import java.util.Scanner;
public class E47 {
	public static void main(String[] args){
	
		E47 e = new E47();
		int test = e.calculateCharacters("hai");
		System.out.println(test);		
	}
		public static int calculateCharacters(String text){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type your name: ");
		String word = scanner.nextLine();
		
		return word.length();
		
	}
}