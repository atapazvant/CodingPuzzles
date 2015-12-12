package org.solution.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	public static void main(String[] args) {
		
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat"};
		
		ArrayList<ArrayList<String>> aStrs = findAnagrams(words);
		
		System.out.println(aStrs.size());
	}
	
	public static ArrayList<ArrayList<String>> findAnagrams(String[] words) {
		
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		if(words == null || words.length == 0)
			return null;
		
		HashMap<String, ArrayList<String>> hMap = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			Arrays.sort(ch);
			String str = String.valueOf(ch);
			
			if(hMap.get(str) == null) {
				ArrayList<String> aList = new ArrayList<String>();
				aList.add(words[i]);
				hMap.put(str, aList);
			}
			else {
				hMap.get(str).add(words[i]);
			}
		}
		
		for (Map.Entry<String, ArrayList<String>> entry : hMap.entrySet()) {
			ArrayList<String> alist = new ArrayList<String>();			
			for (String string : entry.getValue()) {
				alist.add(string);				
			}
			result.add(alist);
		}
		
		return result;
	}
}
