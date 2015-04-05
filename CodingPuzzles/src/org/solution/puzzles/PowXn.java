package org.solution.puzzles;

public class PowXn {

	public static void main(String[] args) {		
		System.out.println(pow(-2, 5));
		System.out.println(pow(-2, 4));
		System.out.println(pow(2, -4));
		System.out.println(pow(2, 0));
	}
	
	/**
	 * 
	 * @param x; base
	 * @param y; power
	 * @return result
	 */
	public static double pow(int x, int y) {
		
		boolean isMinus = false;
		if(y < 0) {
			isMinus = true;
			y *= -1;
		}		
		
		int result = 1;
		while(y > 0) {
			result *= x;
			y--;
		}
		
		return isMinus ? 1 / (double)result : result;
	}
}
