package org.solution.puzzles;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] sln = solutionOne(new int[] {2, 4, 5, 9}, 14);
		System.out.println(sln[0]);
		System.out.println(sln[1]);
		
		int[] sln2 = solutionTwo(new int[] {2, 4, 5, 9}, 14);
		System.out.println(sln2[0]);
		System.out.println(sln2[1]);
		
	}
	
	/**
	 * Complexity is O(n*n).
	 * 
	 * @param numbers
	 * @param target
	 * @return index array
	 */
	public static int[] solutionOne(int[] numbers, int target)
	{
		int[] indexes = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == target)
				{
					indexes[0] = i + 1;
					indexes[1] = j + 1;
					break;
				}
			}
		}
		
		return indexes;
	}
	
	/**
	 * Complexity is O(n).
	 * @param numbers
	 * @param target
	 * @return index array
	 */
	public static int[] solutionTwo(int[] numbers, int target)
	{
		int[] indexes = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], i);			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			int number = target - numbers[i];
			if(map.containsKey(number)) {
				indexes[0] = i + 1;
				indexes[1] = map.get(number) + 1;
				break;
			}
		}
				
		return indexes;
	}
}
