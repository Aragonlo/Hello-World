package com.inf.linkedlist;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
        nodeA.data=4;
        
        Node nodeB = new Node();
        nodeB.data=5;
        
        Node nodeC = new Node();
        nodeC.data=1;
        
        Node nodeD = new Node();
        nodeD.data=4;
        
        nodeD.next = nodeC;
        nodeC.next = nodeA;
        nodeA.next = nodeB;
       
        
        System.out.println("From NodeD - Lenght: " + linkedListLenght(nodeD));
        System.out.println("From NodeA - Lenght: " + linkedListLenght(nodeC));
        
	}
	
	public static int linkedListLenght(Node aNode){
		int lenght = 0;
		while(aNode != null){
			lenght++;
			aNode = aNode.next;
		}
		return lenght;
	}

}
