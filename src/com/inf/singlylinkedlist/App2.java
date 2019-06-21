package com.inf.singlylinkedlist;

public class App2 {

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.insertFirst(1);
		singlyLinkedList.insertFirst(2);
		singlyLinkedList.insertFirst(3);
		singlyLinkedList.insertFirst(4);
		singlyLinkedList.insertFirst(5);
		singlyLinkedList.displayListOfElements();
		singlyLinkedList.removeFirst();
		singlyLinkedList.displayListOfElements();
		singlyLinkedList.insertLast(100);
		singlyLinkedList.displayListOfElements();
	}

}
