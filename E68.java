package tutorial;

import java.util.ArrayList;
import java.util.Scanner;

public class E68 {
	public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
		boolean moreOne = true;
		 for (int numb : list) {
		if (number==numb) {
			if(numb>=2)
		    moreOne= true;
		}else{
			moreOne= false;
		}}
		return moreOne;
	}

	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("Type a number: ");
	    int number = Integer.parseInt(reader.nextLine());
	    if (moreThanOnce(list, number)) {
	        System.out.println(number + " appears more than once.");
	    } else {
	        System.out.println(number + " does not appear more than once.");
	    }
	}
}