package algorithm;

public class ArrayStack implements Stack{
	private int top;
	private int size;
	private char[] stackArr;
	
	public ArrayStack(int size) {
		top = -1;
		this.size = size;
		stackArr = new char[this.size];
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}
	
	@Override
	public boolean isFull() {
		return (top == this.size-1);
	}
	
	@Override
	public void push(char data) {
		if (isFull()) System.out.println("Stack is Full!!!!");
		else {
			stackArr[++top] = data;
			System.out.println("Added Item : " + stackArr[top]);
		}
	}
	
	@Override
	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!!!!");
			return 0;
		}
		else {
			System.out.println("Deleted Item : " + stackArr[top]);
			return stackArr[top--];
		}
	}
	
	public void printStack() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!!!!");
		}
		else {
			for (int i = 0; i < size; i++) {
				System.out.println("Stack element : " + stackArr[i] + " ");
			}
		}
	}
	
}
