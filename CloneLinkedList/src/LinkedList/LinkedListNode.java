package LinkedList;

public class LinkedListNode {
	private int data;
	private LinkedListNode nextNode;
	private LinkedListNode random;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeData(int data) {
		this.data = data;
	}
	
	public int GetLinkedListNodeData() {
		return data;
	}
	
	public LinkedListNode GetLinkedListNodeNext() {
		return this.nextNode;
	}
	
	public void SetLinkedNodeNext(LinkedListNode next) {
		this.nextNode = next;
	}
	
	public LinkedListNode GetLinkedListNodeRandom() {
		return random;
	}
	
	public void SetLinkedListNodeRandom(LinkedListNode node) {
		this.random = node;
	}
}
