package org.solution.puzzles;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> slns = solution(new int[] { -2, 0, 0, 2, 2 , -6, 3, 4, 11});
		for (ArrayList<Integer> arrayList : slns) {
			System.out.println("Tuple");
			for (Integer integer : arrayList) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param values
	 * @return
	 */
	public static ArrayList<ArrayList<Integer>> solution(int[] values)
	{
		ArrayList<ArrayList<Integer>> tuples = new ArrayList<ArrayList<Integer>>();
		
		Arrays.sort(values);
		
		for (int i = 0; i < values.length; i++) {
			int target = 0 - values[i];
			
			int start = i + 1;
			int end = values.length - 1;
					
			while (start < end) {
				if (values[start] + values[end] == target) {
					ArrayList<Integer> lstOfIntegers = new ArrayList<Integer>();
					lstOfIntegers.add(0 - target);
					lstOfIntegers.add(values[start]);
					lstOfIntegers.add(values[end]);
					tuples.add(lstOfIntegers);
					
					start++;
					end--;
					while(start < end && values[start] == values[start - 1])
						start++;
					
					while(start < end && values[end] == values[end + 1])
						end--;
				}
				else if (values[start] + values[end] < target) {
					start++;
				}
				else {
					end--;
				}				
			}
			
			if (i < values.length - 2) {
				while (values[i] == values[i + 1]) {
					i++;
				}
			}
		}
		
		return tuples;
	}
}
