package org.solution.puzzles;

public class GridSearch {

	public static void main(String[] args) {
		int[][] mtx = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, {0,9,8,7,6,5,4,3,2,1 }, { 1,1,1,1,1,1,1,1,1,1 }, 
						{ 1,1,1,1,1,1,1,1,1,1 }, {2, 2, 2, 2, 2, 2, 2,} };
		
		int[][] pattern = { {8, 7, 6, 5}, {1, 1, 1, 1}, {1, 1, 1, 1} };
		
		System.out.println(found(mtx, mtx.length, mtx[0].length, pattern, pattern.length, pattern[0].length));
	}

	private static boolean found(int[][] grid, int row, int column, int[][] pattern, int pY, int pX) {
	    row -= pY - 1;
	    column -= pX - 1;
	    for(int y = 0; y < row; ++y) {
	      for(int x = 0; x < column; ++x) {
	        for(int py = 0; py < pY;) {
	          int px;
	          for(px = 0; px < pX && grid[y + py][x + px] == pattern[py][px]; ++px) {
	          }
	          if(px < pX) {
	            break;
	          }
	          if(++py == pY) {
	            return true;
	          }
	        }
	      }
	    }
	    return false;
	  }
	

	@Override
	public String toString() {
		return "https://www.hackerrank.com/challenges/the-grid-search";
	}

}
