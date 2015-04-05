package org.solution.puzzles;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] values = new String[] { "atap", "ataz", "atzc" };
		System.out.println(longestCommonPrefix(values));
	}
	
	public static String longestCommonPrefix(String[] values) {
        if (values == null || values.length == 0) {
            return "";
        }
        
        if (values.length == 1) {
            return values[0];
        }
        
        String  str = values[0]; 
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            
            for (int j = 1; j < values.length; j++){
                
                if (values[j].length() == i || values[j].charAt(i) != c){
                    return str.substring(0, i);
                }                            
            }
        }
        
        return str;
    }
}
