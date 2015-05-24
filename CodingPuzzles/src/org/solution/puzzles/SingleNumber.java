package org.solution.puzzles;

public class SingleNumber {

	public static void main(String[] args) {
		int[] numbers0 = { 1, 1, 2,2,3 };
		int[] numbers1 = { 1, 1, 2,2,3,3 };
		int[] numbers2 = { 0, 1,1, 2,2,3 };
		int[] numbers3 = { 11, 11, 6, 2,2,3, 3 };
		solve(numbers0);
		solve(numbers1);
		solve(numbers2);
		solve(numbers3);
	}

	private static void solve(int[] numbers) {
		int xor = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			xor = xor ^ numbers[i];
		}
		
		System.out.println(xor);
	}
}
