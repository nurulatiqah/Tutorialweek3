package mooc.fiw3;

public class E45 {
	public static int greatest(int number1, int number2, int number3) {
	    if(number1 >= (number2 & number3)){
	    	return number1;
	    }else if(number2>=( number1 & number3)){
	    	return number2;
	    }else if(number3>=( number1 & number2)){
	    	return number3;
	    }
	    return number1;
	}
	
//	if(number1>=number2 && number1>=number3){
//	return number1;
//}else if(number2>=number1 && number2>=number3){
//	return number2;
//}else 
//return number3;		
//}

	public static void main(String[] args) {
	    int answer =  greatest(10, 7, 7);
	    System.out.println("Greatest: " + answer);
	}
	    
}
