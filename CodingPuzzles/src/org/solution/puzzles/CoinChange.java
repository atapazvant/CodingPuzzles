package org.solution.puzzles;

public class CoinChange {

	public static void main(String[] args) {
		int target = 8;
		int[] values = {1, 2, 3};
		System.out.println(fewestCoinSolve(values, target));
	}

	private static int fewestCoinSolve(int[] values, int target) {
		
		int[] dp = new int[target + 1];
		
		for(int j = 1; j < dp.length; j++)
			dp[j] = Integer.MAX_VALUE;
		
		for (int i = 1; i <= target; i++) {
			for (int j = 0; j < values.length; j++) {
				if(i >= values[j]) {
					if (dp[i - values[j]] != Integer.MAX_VALUE)
						dp[i] = Math.min(dp[i], dp[i - values[j]] + 1);
				}
			}
		}
		
		return dp[target];
	}

}
