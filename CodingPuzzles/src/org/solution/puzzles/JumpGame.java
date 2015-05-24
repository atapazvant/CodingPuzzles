package org.solution.puzzles;

public class JumpGame {
	public static void main(String[] args) {
		System.out.println(canJump(new int[] {3,0,0,1,4}));
		System.out.println(canJump(new int[] {3,2,2,0,4,9,11}));
	}
	
	public static boolean canJump(int[] A) {
		if (A == null || A.length == 0) {
            return false;
        }
        
        if (A.length == 1) {
            return true;
        }
        
        // record max length one can reach
        int[] record = new int[A.length];        
        record[0] = A[0];
        
        for (int i = 1; i < record.length; i++){
            
            if (i <= record[i-1]){
                record[i] = Math.max(A[i] + i, record[i-1]);
                if (record[i] >= A.length-1) {
                    return true;
                }
            }
            else{
                // if current i can not be reach by previous jump then return false
                return false;
            }            
        }
        
        return true;
	}
}
