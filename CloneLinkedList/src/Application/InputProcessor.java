package Application;

import LinkedList.LinkedListCustomized;
import LinkedList.LinkedListNode;

import java.util.HashMap;
import java.util.Scanner;

public class InputProcessor {

	public static LinkedListCustomized GetLinkedListFromInput() {
		LinkedListCustomized linkedList = new LinkedListCustomized(null);
		
		System.out.println("Enter the number of elements in the linked list");
		try {
			Scanner scanner = new Scanner(System.in);
			int numberOfElements = scanner.nextInt();
			for(int index = 0; index < numberOfElements; index++) {
				System.out.println("Enter the element");
				linkedList.SetLinkedListHead(
						linkedList.InsertAtEnd(linkedList.GetLinkedListHead(), 
								scanner.nextInt()));
				}
			System.out.println("The constructed linked list is -----------");
			PrintList(linkedList.GetLinkedListHead());			
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
		return linkedList;
	}
	
	public static void PrintList(LinkedListNode linkedList) {
		if(linkedList == null) {
			System.out.println("Linked list is empty!");
			return;
		}
		while(linkedList != null) {
			System.out.print(linkedList.GetLinkedListNodeData()+" ");
			linkedList = linkedList.GetLinkedListNodeNext();
		}
	}
	
	public static void CloneLinkedList(LinkedListNode incomingListNode) {
		
		HashMap<LinkedListNode, LinkedListNode> map = new HashMap<LinkedListNode, LinkedListNode>();
		LinkedListNode resultList = null;
		
		LinkedListNode head = incomingListNode;
		while(incomingListNode != null) {
			map.put(incomingListNode, new LinkedListNode(incomingListNode.GetLinkedListNodeData()));
			incomingListNode = incomingListNode.GetLinkedListNodeNext();
		}
		
		incomingListNode = head;
		LinkedListNode finalResult = null;
		while(incomingListNode != null) {
			resultList = map.get(incomingListNode);
			resultList.SetLinkedNodeNext(incomingListNode.GetLinkedListNodeNext());
			resultList.SetLinkedListNodeRandom(incomingListNode.GetLinkedListNodeRandom());
			if(finalResult == null) {
				finalResult = resultList;
			}
			incomingListNode = incomingListNode.GetLinkedListNodeNext();
			resultList = resultList.GetLinkedListNodeNext();
		}
		
		PrintList(finalResult);
	}
}
