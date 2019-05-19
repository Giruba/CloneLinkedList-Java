package Application;

import LinkedList.LinkedListCustomized;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Clone LinkedList with next and arbitrary pointers");
		System.out.println("-------------------------------------------------");
		
		LinkedListCustomized linkedList = InputProcessor.GetLinkedListFromInput();
		System.out.println();
		System.out.println("Printing the cloned list");
		InputProcessor.CloneLinkedList(linkedList.GetLinkedListHead());
	}
}
