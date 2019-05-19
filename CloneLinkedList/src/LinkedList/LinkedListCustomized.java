package LinkedList;

import java.util.Random;

public class LinkedListCustomized {

	private LinkedListNode head;
	
	public LinkedListCustomized(LinkedListNode linkedListNode) {
		head = linkedListNode;
	}
	
	public LinkedListNode GetLinkedListHead() {
		return head;
	}
	
	public void SetLinkedListHead(LinkedListNode linkedListNode) {
		head = linkedListNode;
	}
	
	public LinkedListNode InsertAtEnd(LinkedListNode linkedListNode, int data) {
		if(linkedListNode == null) {
			linkedListNode = new LinkedListNode(data);
			return linkedListNode;
		}
		LinkedListNode head = linkedListNode;
		while(linkedListNode != null && linkedListNode.GetLinkedListNodeNext() != null) {			
			linkedListNode = linkedListNode.GetLinkedListNodeNext();
		}
		linkedListNode.SetLinkedNodeNext(new LinkedListNode(data));
		linkedListNode.SetLinkedListNodeRandom(new LinkedListNode(new Random().nextInt()));
		return head;
	}
}
