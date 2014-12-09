/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Calculator {

	public static void main(String[] args) {
		int three =0;
		int five = 0;
		int fifteen= 0;
		
		for(int i = 1; i <=333; i++){//multiples of 3
			
			three += (i*3);
		}
		for(int i = 1; i <= 199; i++){
			five += (i*5);
		}
		for(int i = 1; i <= 66; i++){
			fifteen += (i*15);
		}
		
		System.out.println("Sum: "+((three+five)-fifteen));

	}

}
