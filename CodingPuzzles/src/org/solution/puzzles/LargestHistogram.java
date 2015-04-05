package org.solution.puzzles;

import java.util.Arrays;
import java.util.Stack;

public class LargestHistogram {
	public static void main(String[] args) {
		int[] heights = {2, 1, 5, 6, 2, 3};
		System.out.println( maxArea( heights));
	}
	
	/**
	 * complexity O(n*n)
	 * @param histogram
	 * @return
	 */
	public static int maxArea(int[] histogram) {
		
		int max = 0;
		for (int i = 0; i < histogram.length; i++) {
			
			int min = histogram[i];
			for (int j = i; j >= 0; j--) {
				
				min = Math.min(min, histogram[j]);
				int area = min * (i - j + 1);
				
				if(area > max)
					max = area;
			}
		}
		return max;
	}
	
	public int maxArea2(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int maxArea = 0;
        int[] h = new int[height.length + 1];
        
        h = Arrays.copyOf(height, height.length + 1);
        
        while(i < h.length) {
            if(stack.isEmpty() || h[stack.peek()] <= h[i]) {
                stack.push(i++);
            }
            else {
                int t = stack.pop();
                maxArea = Math.max(maxArea, h[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }
        return maxArea;
    }
}
