package org.solution.puzzles;

public class PathSum {
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(8);
		root.right.right = new Node(4);
		root.right.right.right = new Node(1);
		root.left.left = new Node(11);
		root.left.left.right = new Node(2);
		root.left.left.left = new Node(7);
		
		System.out.println(pathExists(root, 17, 0));
		System.out.println(pathExistsLeaf(root, 17, 0));		
		System.out.println(pathExistsLeaf(root, 18, 0));	
				
	}
	
	/* Start from root to any node in a binary tree */
	public static boolean pathExists(Node head, int target, int sum) {
		
		if(head == null)
			return false;
		
		sum += head.data;
		
		if(sum == target)
			return true;
		
		if(pathExists(head.left, target, sum))
			return true;
		
		if(pathExists(head.right, target, sum))
			return true;
		
		return false;
	}
	
	/* Start from root to leaf node in a binary tree */
	public static boolean pathExistsLeaf(Node head, int target, int sum) {
		
		if(head == null)
			return false;
		
		sum += head.data;

		if(head.left == null && head.right == null) // leaf node
		{			
			if(sum == target)
				return true;
			else 
				return false;
		}
		
		return pathExistsLeaf(head.left, target, sum) || pathExistsLeaf(head.right, target, sum);
	}	
}

