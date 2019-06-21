package com.inf.singlylinkedlist;

public class SinglyLinkedList {
	private static Node first;
	private Node last;
	
	public SinglyLinkedList(){}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	//used to insert data at the beginning of the list
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first; //can be null on a Node
		first = newNode;
		if(first.next == null){
			last = first;
		}
	}
	
	//used to remove a node
	public Node removeFirst(){
		System.out.println("Removing first...");
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	//print content of the list
	public void displayListOfElements(){
		System.out.println("List(first => last)");
		Node currentNode = first;
		while(currentNode != null){
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	
	//insert at the end
	public void insertLast(int data){
		// Better implementation at performance level
        Node currentNode = last;
        Node newNode = new Node();
     	newNode.data = data;
     	newNode.next = null;
     	currentNode.next = newNode;
        
////       This depends on the size of N could be so expensive.
////		Node currentNode = first;
////		while(currentNode.next != null){
////			currentNode = currentNode.next;
////		}
////		Node newNode = new Node();
////		newNode.data = data;
////		newNode.next = null;
////		currentNode.next = newNode;
	}
}
