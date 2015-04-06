package org.solution.puzzles;

public class PascalsTriangle {

	public static void main(String[] args) {		
		System.out.println(new PascalsTriangle().solution_one(4));
	}
	
	public int[] solution_one(int number) {		
		if(number <= 0)
			return null;
		
		int[] solution = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			solution[i] = calculate(number, i);
		}
		
		return solution;
	}
	
	
	public int calculate(int num, int i) {				
		return factorial(num)/ (factorial(i) * factorial(num - i));
	}
	
	public int factorial(int num) {
		int result = 1;
	    for (int i = 1; i <= num; i++) {
	           result = result * i;
	    }
	    return result;
	}	
}
