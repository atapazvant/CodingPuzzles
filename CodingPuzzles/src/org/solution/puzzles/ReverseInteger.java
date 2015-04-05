package org.solution.puzzles;

public class ReverseInteger {

	public static void main(String[] args) {		
		System.out.println(reverseInt(-234));
		System.out.println(reverseInt(100));
		System.out.println(reverseInt(53201));
		System.out.println(reverseInt(10040));
	}
	
	/**	 
	 * @param number
	 * @return
	 */
	public static int reverseInt(int number) {		
		int sum = 0;
		boolean isNegative = false;
		if(number < 0) {
			number *= -1;
			isNegative = true;
		}
		
		while(number > 0) {
			int rem = number % 10;
			sum = 10 * sum + rem ;
			number /= 10;
		}
		
		return isNegative ? -1 * sum : sum;
	}
}
