package algorithm;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.insertNode("a");
		linkedList.insertNode("b");
		linkedList.insertNode("c");
		linkedList.insertNode("d");
		
		linkedList.deleteNode("b");
		linkedList.deleteNode("d");
		
		linkedList.printList();
	}
	
}
