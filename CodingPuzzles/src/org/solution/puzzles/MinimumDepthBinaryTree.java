package org.solution.puzzles;

public class MinimumDepthBinaryTree {

	public static void main(String[] args) {
		Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        
        System.out.println(minDepth(tree));
	}
	
	public static int minDepth(Node root) {
        if(root == null)
            return 0;
        
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        
    }

}
