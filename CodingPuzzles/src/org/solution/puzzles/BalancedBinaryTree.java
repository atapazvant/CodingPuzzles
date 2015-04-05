package org.solution.puzzles;

public class BalancedBinaryTree {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		//root.right = new Node(3);
		//root.left.right = new Node(4);
		root.left.left = new Node(5);
		root.left.left.left = new Node(6);
		//root.left.left.left.left = new Node(7);
		
		if(isBalanced(root))
			System.out.println("balanced");
		else
			System.out.println("not balanced");
	}	
	
	/**
	 * 
	 * @param headNode
	 * @return true if binary tree is balanced; else false.
	 */
	public static boolean isBalanced(Node headNode)
	{
		if(headNode == null)
			return true;
		
		int value = getDepth(headNode);
		
		if(value == -1)
			return false;
		else
			return true;		
	}

	private static int getDepth(Node headNode) 
	{	
		if(headNode == null)
			return 0;
			
		int right = getDepth(headNode.right);				
		int left = getDepth(headNode.left);			
		
		if (left == -1 || right == -1)
			return -1;
 
		if (Math.abs(left - right) > 1) 
			return -1;	
				
		return Math.max(right, left) + 1;
	}	
}

