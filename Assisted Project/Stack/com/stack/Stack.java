package com.stack;

public class Stack 
{
	static final int MAX = 4;
	int top;
	int a[] = new int[MAX];

	Stack() {

		top = -1;

	}

	public boolean isEmpty() {

		return (top < 0);

	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	public static void main(String[] args) {

			Stack stack = new Stack();
			
			System.out.println("before "+stack.isEmpty());
			
			stack.pop();
			
		boolean isAdded =	 stack.push(50);
		System.out.println("Is added "+isAdded);
			stack.push(10);
			stack.push(15);
			stack.push(20);
			stack.push(25);
			
			//System.out.println("Deleted ");
			//System.out.println(stack.pop());
			
			System.out.println("after "+stack.isEmpty());
					
		

	}



}
