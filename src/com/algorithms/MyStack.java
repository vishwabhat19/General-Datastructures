package com.algorithms;

import java.util.Queue;

class MyStack{
	
	class Node{
		int data;
		Node next;
		
		
	}
	
	Node root; //This is the first root node
	

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(null==root) {
        	//There are no elements in the stack
        	root = new Node();
        	root.data = x;
        	root.next = null;
        }
        else {
        	//There are elements in the stack. So make this the root node.
        	Node temp = root;
        	root = new Node();
        	root.data = x;
        	root.next = temp;
        	
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        //remove and return the root element
    	Node temp = root;
    	root = root.next;
    	return temp.data;
    }
    
    /** Get the top element. */
    public int top() {
        //return the top element
    	Node temp = root;
    	return temp.data;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(null==root) return true;
        else return false;
    }
    
    public static void main(String args[]) {
    	// Your MyStack object will be instantiated and called as such:
    	  MyStack obj = new MyStack();
    	  obj.push(20);
    	  obj.push(10);
    	  int param_2 = obj.pop();
    	  int param_3 = obj.top();
    	  boolean param_4 = obj.empty();
    	 System.out.println(param_2);
    	 System.out.println(param_3);
    	 System.out.println(param_4);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */