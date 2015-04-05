package org.solution.puzzles;

import java.util.ArrayList;

public class WordBreak {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("programcree");
		words.add("prog");
		words.add("ram");
		words.add("c");
		words.add("reek");
		
		String word = "programcreek";
		
		System.out.println(solve(word, words));
	}
	
	public static boolean solve(String word, ArrayList<String> dictOfStrings) {
		
		int length = word.length() + 1;
		boolean[] result = new boolean[length];
		
		result[0] = true;
		
		for (int i = 1; i < length; i++) {			
			for (int k = 0; k < i; k++) {				
				boolean found = dictOfStrings.contains(word.substring(k, i));				
				
				result[i] = result[k] && found;
				
				if(result[i])
					break;
			}			
		}
		
		return result[length - 1];
	}
}
