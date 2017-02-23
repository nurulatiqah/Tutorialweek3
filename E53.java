package mooc.fiw3;
//first part
import java.util.Scanner;
public class E53 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type a word: ");
		String word = scanner.nextLine();
		System.out.print("Length of the first part: ");
		int len = scanner.nextInt();
		
			System.out.println("Result: " +word.substring(0,len)); //prints

		}
	}

