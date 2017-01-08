package org.solution.puzzles;

import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String[] args) {
		System.out.println(solve(new int[] { - 1, 2, 1, 4}, 18));
	}
	
	public static int solve(int[] values, int target) {
		
		Arrays.sort(values);
		
		int min = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			
			int second = i + 1;
			int third = values.length - 1;
			
			while (second < third) {
				
				int sum = values[i] + values[second] + values[third];
				
				if (sum == target)
					return target;
				
				if(sum < target)
				{
					if (target - sum < min) {
						min = target - sum;
						result = sum;
					}
					second++;
				}
				else
				{
					if(sum - target < min) {
						min = sum - target;
						result = sum;
					}
					third--;
				}				
			}
			
			while(i < values.length - 1 && values[i] == values[i + 1])
				i++;			
		}
		
		return result;
	}
}
