package org.solution.puzzles;

public class BinaryTreeMaximumPathSum {

	static int max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(-2);
		root.right = new Node(7);
		//root.left.left = new Node(18);
		root.left.right = new Node(9);		

		System.out.println(maxSum(root));
		//System.out.println(max);
		
		System.out.println("**************");
		
		System.out.println(maxSum2(root, max));
		//System.out.println("Result : " +  max);			
	}
	
	public static int maxSum(Node head) {
		
		if(head != null)
			System.out.println("Called : " + head.data);
		
		if(head == null)
			return 0;
		
		int maxleft = Math.max(maxSum(head.left), 0);		
		int maxright = Math.max(maxSum(head.right), 0);
		
		max = Math.max(maxleft + maxright + head.data, max);
		
		return head.data + Math.max(maxleft, maxright);
	}
	
	public static int maxSum2(Node root, int max) {
		if (root == null)
			return 0;
	 
		int left = maxSum2(root.left, max);
		int right = maxSum2(root.right, max);
	 
		int current = Math.max(root.data, Math.max(root.data + left, root.data + right));
	 
		max = Math.max(max, Math.max(current, left + root.data + right));
	 
		return current;
	}
}

