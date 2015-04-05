package org.solution.puzzles;

public class JumpGame {
	public static void main(String[] args) {
		System.out.println(canJump(new int[] {3,0,0,1,4}));
		System.out.println(canJump(new int[] {3,2,1,0,4,9,11}));
	}
	
	public static boolean canJump(int[] values)
	{
		int length = values.length;		
		if(length == 0 || length == 1)
			return true;
		
		int m = 0;
        for (int i = 0; i < length; i++){
            if (i <= m){
             m = Math.max(m, values[i] + i);
             if (m >= length - 1)
            	 return true;
            }
            else 
            	break;
        }
        return false;
	}
}
