package org.solution.puzzles;

public class LinkedListCycle {	
	
	public boolean hasCycle(LinkedListNode node)
	{
		if(node == null)
			return false;
		
		LinkedListNode p1 = node;
		LinkedListNode p2 = node.next;
		
		while(p1 != p2) {
			if(p1 == null || p2 == null)
				return false;
			
			p1 = p1.next;
			p2 = p2.next; 
			
			if(p2 == null)
				return false;
			
			p2 = p2.next;
			
			if(p1 == p2)
				return true;
		}			
		return false;
	}
}

class LinkedListNode
{
	LinkedListNode next;
	int data;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
}
