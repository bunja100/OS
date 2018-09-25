
public class MyStack {
	private int maxSize;
	private int top;
	private int[] stackArray;

	public MyStack(int size) {
		top = -1;
		maxSize = size;
		stackArray = new int[maxSize];
	}

	public void push(int value) {
		stackArray[++top] = value;
	}

	public int pop() {
		return stackArray[top--];
	}

	public int peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		MyStack myStack = new MyStack(10);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(100);

		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}
