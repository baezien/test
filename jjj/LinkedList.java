package algorithm;

class Node {
	private String data;
	public Node link;
	
	public String getData() {
		return this.data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}

public class LinkedList {
	private Node head;
	
	public void insertNode(String data) {
		if (head == null) {
			head = createNewNode(data);
			return;
		}
		
		Node tempNode = head.link;
		Node preNode = head;
		
		if (tempNode == null) preNode.link = createNewNode(data);
		else {	
			while(tempNode != null) {
				if (tempNode.link == null) {
					tempNode.link = createNewNode(data);
					return;
				}
				else {
					tempNode = tempNode.link;
				}
			}
		}
	}
	
	public void deleteNode(String data) {
		if (head == null) return;
		
		Node preNode = head;
		Node tempNode = head.link;
		
		if (tempNode == null) {
			head = null;
			return;
		}
		else {
			while (tempNode != null) {
				if (data.equals(tempNode.getData())) {
					preNode.link = tempNode.link;
					tempNode.link = null;
					break;
				}
				else {
					preNode = tempNode;
					tempNode = tempNode.link;
				}
			}
		}
	}
	
	private Node createNewNode(String data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		return newNode;
	}
	
	public void printList() {
		if (head == null) return;
		else System.out.println(head.getData()); 
		
		Node tempNode = head.link;
		
		while(tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.link;
		}
	}
}
