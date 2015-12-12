package org.solution.puzzles;

public class BuyAndSell {
	public static void main(String[] args) {
		int[] v = {3, 2, 6, 4, 1};
		System.out.println(maxProfit(v));
	}
	
	public static int maxProfit(int[] values) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		int sell = 0;
		
		for (int i = 0; i < values.length; i++) {
			if(values[i] < min)
				min = values[i];
			
			sell = values[i];
			if((sell - min) > max)
				max = sell - min;
		}
		
		return max;
	}
}
