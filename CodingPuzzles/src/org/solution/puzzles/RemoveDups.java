package org.solution.puzzles;

import java.util.Arrays;

public class RemoveDups {
	public static void main(String[] args) {
		int[] values = new int[] { 1, 1, 1, 1, 2, 2, 2,  3 }; // sorted array
		System.out.println(removeDupsFromSortedArray(values));
	}
	
	/**
	 * 
	 * @param values
	 * @return
	 */
	public static int removeDupsFromSortedArray(int[] values) {
		int length = values.length;
		
		int index = 0;
		for (int i = 1; i < length; i++) {
			if(values[index] == values[i])
				continue;
			index++;
			values[index] = values[i];
		}
		
		values = Arrays.copyOf(values, index + 1);
		
		return index + 1;
	}
}
