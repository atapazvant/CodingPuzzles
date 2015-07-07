package org.solution.puzzles;

public class MaximumDepthBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(-2);
		root.right = new Node(7);
		root.left.left = new Node(18);
		root.left.right = new Node(9);		
		//root.left.left = new Node(22);
		root.right.right = new Node(1);
		root.right.right.right = new Node(11);
		root.right.right.right.right = new Node(10);
		
		int result = solve(root);
		System.out.println(result);
	}

	private static int solve(Node root) {
		if(root == null)
			return 0;
		
		int a = solve(root.left);
		int b = solve(root.right);
		
		return Math.max(a+ b, b) + 1;
	}
}
