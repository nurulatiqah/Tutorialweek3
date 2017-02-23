package tutorial;
import java.util.Scanner;
public class E56 {
	
	public static String reverse(String text) {
		String rev = "";
	
	    for(int i=text.length()-1;i>=0;i--){  
	    	rev = rev + text.charAt(i);
	    }    
		return rev;
	}

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
	    System.out.print("Type in your text: ");
	    String text = scanner.nextLine();
	    System.out.println("In reverse order: " + reverse(text));
	}
	    

}
