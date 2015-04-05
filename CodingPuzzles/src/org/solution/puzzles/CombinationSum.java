package org.solution.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class CombinationSum {
	
	static ArrayList<Stack<Integer>> lstOfLists = new ArrayList<Stack<Integer>>();
	
	public static void main(String[] args) {
				
		int[] ss = {10, 1, 2, 7, 6, 1, 5};
		ArrayList<Stack<Integer>> lstIntegers = solve(ss, 7);	
			
		for (Stack<Integer> stack : lstIntegers) {
			for (Integer integer : stack) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
	}	
	
	public static ArrayList<Stack<Integer>> solve(int[] values, int target) {
		
		Arrays.sort(values);			
		Stack<Integer> lstOfInteger = new Stack<Integer>();
		getCombinations(values, target, 0, 0, lstOfInteger);			
				
		return lstOfLists;
	}
		
	@SuppressWarnings("unchecked")
	public static void getCombinations(int[] values, int target, int index, int sum, Stack<Integer> lstOfInteger) {
		
		if(sum > target)
			return;
		
		if(sum == target) {
			lstOfLists.add((Stack<Integer>) lstOfInteger.clone());
			return;
		}
				
		for (int i = index; i < values.length; i++) {			
			lstOfInteger.add(values[i]);
			sum += values[i];			
			
			//getCombinations(values, target, i, sum, lstOfInteger);
			
			// each value in values is used only once -> (i + 1)
			getCombinations(values, target, i + 1, sum, lstOfInteger);
			
			lstOfInteger.pop();
			sum -= values[i];
			
			// pass duplicates
			while (i < values.length - 1 && values[i] == values[i + 1]) {
				i++;
			}
		}		
	}
}
