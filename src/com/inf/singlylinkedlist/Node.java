package com.inf.singlylinkedlist;

public class Node {
	public int data = Integer.MAX_VALUE;
	public Node next = null;
	
	public void displayNode(){
		System.out.println(" {" + data + "} ");
	}
}
