package org.solution.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		List<ArrayList<Integer>> subsets = solve(nums);
		for (ArrayList<Integer> arrayList : subsets) {
			for (Integer integer : arrayList) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
	}

	private static ArrayList<ArrayList<Integer>> solve(int[] nums) {
		if (nums == null)
			return null;
	 
		Arrays.sort(nums);
	 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		for (int i = 0; i < nums.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
	 
			//get sets that are already in result
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
	 
			//add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(nums[i]);
			}
	 
			//add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(nums[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		//add empty set
		result.add(new ArrayList<Integer>());
	 
		return result;
	}

}
