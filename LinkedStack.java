package algorithm;

class StackNode {
	private char data;
	public StackNode next;
	
	public StackNode(char data) {
		this.data = data;
	}
	
	public char getData() {
		return this.data;
	}
	
	public void setData(char data) {
		this.data = data;
	}
}

public class LinkedStack implements Stack{
	private StackNode topNode;
	
	public LinkedStack() {
		topNode = null;
	}
	
	@Override
	public boolean isEmpty() {
		return (topNode == null);
	}

	@Override
	public void push(char data) {
		StackNode newNode = new StackNode(data);
		newNode.next = topNode;
		topNode = newNode;
	}

	@Override
	public char pop() {
		StackNode popNode = topNode;
		topNode = topNode.next;
		
		return popNode.getData();
	}
	
	public void printStack() {
		StackNode tempNode = topNode;
		while (tempNode != null) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.next;
		}
		
	}
}
