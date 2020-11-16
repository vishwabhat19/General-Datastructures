package com.algorithms;

import java.util.Iterator;
import java.util.Stack;

public class MyQueue {
	
	Stack<Integer> stack = new Stack<>();
	
	 /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	stack.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	int size = stack.size();
    	Stack<Integer> tempStack = new Stack<Integer>();
    	while(size>1) {
    		tempStack.push(stack.pop());
    		size--;
    	}
    	
    	int popValue = stack.pop();
    	
    	while(!tempStack.isEmpty()) {
    		stack.push(tempStack.pop());
    	}
    	
    	
    	return popValue;
    	
    	
    
    	
    }
    
    /** Get the front element. */
    public int peek() {
    	
    	int size = stack.size();
    	Stack<Integer> tempStack = new Stack<Integer>();
    	while(size>1) {
    		tempStack.push(stack.pop());
    		size--;
    	}
    	
    	int popValue = stack.pop();//This will be returned
    	stack.push(popValue);
    	while(!tempStack.isEmpty()) {
    		stack.push(tempStack.pop());
    	}
    	
    	
    	return popValue;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return stack.isEmpty();
    	}
    
    

	public static void main(String[] args) {
		MyQueue obj = new MyQueue();
		 obj.push(10);
		 obj.push(20);
		 obj.push(30);
		 int param_2 = obj.pop();
		 int param_3 = obj.peek();
		 boolean param_4 = obj.empty();
		 System.out.println(param_2+" "+param_3+" "+param_4);
	}

}
