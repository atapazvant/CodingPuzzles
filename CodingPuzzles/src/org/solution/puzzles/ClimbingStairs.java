package org.solution.puzzles;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 9;
		System.out.println(solve(n));
	}

	private static int solve(int n) {
		
		int f1 = 1;
		int f2 = 1;
		
		if(n < 3)
			return f1;
		
		int fn = 0;
		for (int i = 3; i <= n; i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		
		return fn;
	}

}
