package org.solution.puzzles;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		PlusOne pOne = new PlusOne();
		pOne.solve(new int[] {9, 9});
		pOne.solve(new int[] {9, 9, 9});
		pOne.solve(new int[] {9, 2, 3});
	}
	
	public int[] solve(int[] values) {
		
		int len = values.length;
		int carry = 1;
		int[] rs = new int[len];
		int sum = 0;
		
		for (int i = len - 1; i >= 0; i--) {
			sum = carry + values[i];
			carry = sum / 10;
			rs[i] = sum % 10;
		}
		
		if(carry > 0) {
			rs = Arrays.copyOf(rs, len + 1);
			rs[0] = carry;
		}
		
		return rs;
	}
}
