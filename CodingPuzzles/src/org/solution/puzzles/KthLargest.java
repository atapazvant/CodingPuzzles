package org.solution.puzzles;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class KthLargest implements Comparator<Integer> {

	public static void main(String[] args) {
		Integer[] values = {1, 4, 2, 88, 45, 32, 44, 22 };
		System.out.println(solve(values, 3));
		System.out.println(solve(values, 2));
		System.out.println(solve(values, 5));
	}

	private static int solve(Integer[] values, int k) {
		
		int left = 0;
		int right = values.length - 1;
		Random rnd = new Random();
		
		List<Integer> v = Arrays.asList(values);
		
		while (left <= right) {
			int pivot = rnd.nextInt(right + 1);
			int median = partitionBasedOnPivot(left, right, pivot, v);
			
			if(median == k - 1)
				return v.get(median);
			else if(median > k - 1)
				right = median - 1;
			else
				left = median + 1;
		}
		
		return -1;
	}

	private static int partitionBasedOnPivot(int left, int right, int pivotIdx, List<Integer> values) {
		
		int pivotValue = values.get(pivotIdx);
		int l_index = left;
		
		Collections.swap(values, pivotIdx, right);
		
		for (int i = left; i < right; i++) {
			if(values.get(i).compareTo(pivotValue) > 0) {
				Collections.swap(values, i, l_index++);
			}
		}
		
		Collections.swap(values, right, l_index);
		return l_index;
	}

	@Override
	public int compare(Integer i, Integer j) {
		if(i > j)
			return -1;
		else if(i < j)
			return 1;
		else 
			return 0;
	}

}

