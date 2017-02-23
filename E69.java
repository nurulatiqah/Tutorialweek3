package tutorial;

import java.util.Scanner;

public class E69 {
	public static boolean palindrome(String text) {
		boolean palind = true;
		String rev="";
	
	    for(int i=text.length()-1;i>=0;i--){  
	    	rev = rev + text.charAt(i);  
	    
	    		 if(text.charAt(i) == text.charAt(text.length()-1))
	    		    	palind= true;
	    		    else {
	    		    	palind= false;
	    		    	}
			}   	
	return palind;	
	}

	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	    System.out.println("Type a text: ");
	    String text = reader.nextLine();
	    if (palindrome(text)) {
	       System.out.println("The text is a palindrome!");
	    } else {
	       System.out.println("The text is not a palindrome!");
	    }
	}
	    
}
