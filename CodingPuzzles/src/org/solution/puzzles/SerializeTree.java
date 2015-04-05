package org.solution.puzzles;

public class SerializeTree {

	public static void main(String[] args) {
		
		TreeNode n1 = new TreeNode(1);
		n1.left = new TreeNode(2);
		n1.left.left = new TreeNode(5);
		
		n1.right = new TreeNode(30);
		n1.right.right = new TreeNode(65);
		n1.right.left = new TreeNode(55);
		
		StringBuffer sb = new StringBuffer();
		serializeTree(n1, sb);
		
		System.out.println(sb.toString());
	}
	
	public static void serializeTree(TreeNode node, StringBuffer sb) {
		if(node == null) {
			sb.append(" $ ");
			return;
		}
		
		sb.append(" " + node.data);
		serializeTree(node.left, sb);
		serializeTree(node.right, sb);
	}

}

class TreeNode
{
	int data;
	TreeNode right;
	TreeNode left;
	
	public TreeNode(int data) {
		this.data = data;
	}
}
