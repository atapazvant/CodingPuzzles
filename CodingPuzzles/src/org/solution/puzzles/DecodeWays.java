package org.solution.puzzles;

public class DecodeWays {

	static final int upperLimit  = 26;
	static final int maxHeadSize = ("" + upperLimit).length();
	
	public static void main(String[] args) {
		System.out.println(numDecodings("21"));
	}
	
	public static void decode(String text) {
		
	}
	
	static int numDecodings(String encodedText) {
	    // check base case for the recursion
	    if (encodedText.length() == 0) {
	        return 1;
	    }

	    // sum all tails
	    int sum = 0;
	    for (int headSize = 1; headSize <= maxHeadSize && headSize <= encodedText.length(); headSize++) {
	        String head = encodedText.substring(0, headSize);
	        String tail = encodedText.substring(headSize);
	        if (Integer.parseInt(head) > upperLimit) {
	            break;
	        }
	        sum += numDecodings(tail);
	    }

	    return sum;
	}
	
}
