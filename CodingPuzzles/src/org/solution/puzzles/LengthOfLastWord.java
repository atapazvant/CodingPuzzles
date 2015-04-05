package org.solution.puzzles;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthLastWord("xxhsa, sss, xsfr "));
	}
	
	public static int lengthLastWord(String words) {
		
		int count = 0;
		int len = words.length();		
		
		for (int i = len - 1; i >= 0; i--) {			
			if(words.charAt(i) == ' ') {			
				if(count == 0)
					continue;
				else
					return count;
			}
			count++;			
		}
		
		return count;
	}
}
