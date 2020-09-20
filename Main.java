package algorithm;

public class Main {
	public static void main(String[] args) {
		ArrayStack arrStack = new ArrayStack(5);
		
		arrStack.push('e');
		arrStack.push('e');
		arrStack.push('q');
		arrStack.pop();
		arrStack.push('e');
		arrStack.push('e');
		arrStack.push('e');
	}
	
}
