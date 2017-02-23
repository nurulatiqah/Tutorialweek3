package tutorial;

import java.util.ArrayList;

public class E67 {
	public static double variance(ArrayList<Integer> list) {
		double sum=0;
		double avg,preV,preV2,allPreV2 = 0,variance = 0;
		for (int number : list) {
			sum+=number;
			avg =  sum/4;
			preV = number-avg;
			preV2 = Math.pow(preV, 2);
			allPreV2 += preV2;
			variance = allPreV2/4;
			
		}
		return variance;
	    // write your code here
	}

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The variance is: " + variance(list));
	}
}
