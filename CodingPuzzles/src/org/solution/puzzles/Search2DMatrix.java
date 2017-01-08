package org.solution.puzzles;

public class Search2DMatrix {

	public static void main(String[] args) {
		int n = 10;
		int[][] mtx = { {1, 5, 10}, {20, 25, 27}, {35, 45, 60}};
		System.out.println(solve(mtx, n));
	}

	private static int solve(int[][] mtx, int n) {
		
		int row = -1;
		for (int j = 1; j < mtx.length; j++) {
			if(mtx[j][0] > n) {
				row = j - 1;
				break;
			}
		}
		
		if(row == -1)
			row = mtx.length - 1;
		
		for (int j = 0; j < mtx[0].length; j++) {
			if(mtx[row][j] == n) {
				return 1;
			}
		}
		
		return -1;
	}

}
