package mooc.fiw3;

public class E44 {
	public static int least(int number1, int number2) {
	    
		if(number1<number2 || number1==number2){
			return number1;
		}else 
			return number2;
} 
	

	public static void main(String[] args) {
	    int answer =  least(1, 3);
	    System.out.println("Least: " + answer);
	}
	    
}
