package mooc.fiw3;

import java.util.ArrayList;

public class E66 {
	public static int greatest(ArrayList<Integer> list) {
		int max = 0; //Integer.MIN_VALUE
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)>max){
				max=list.get(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The greatest number is: " + greatest(list));
	}
}
