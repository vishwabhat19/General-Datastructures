package com.algorithms;

import java.util.HashSet;


public class RemoveLoopUsingFloydCycleFindingAlgorithm {

	public static void main(String[] args) {
		NodeClass n1 = new NodeClass(1);
		NodeClass n2 = new NodeClass(3);
		NodeClass n3 = new NodeClass(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n2;
		
		NodeClass temp = n1;
		/*while(null!=temp) {
			System.out.println(temp.data);
			temp = temp.next;
		}*/
		
		removeLoop(n1);
		
		temp = n1;
		while(null!=temp) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
		
	}
	
	public static void removeLoop(NodeClass head){
		
		if(null==head || head.next==null) {
			System.out.println("No Loop Carry On");return;
		}
		
		NodeClass slow = head;
		NodeClass fast = head;
		
		while(fast!=null && fast.next!=null) {
			
			if(slow==fast) break;
			
			else {
				fast = fast.next.next;
				slow = slow.next;
			}
		}
		
		if(slow==fast) {
			//This means that loop exists
			slow = head;
			while(slow.next!=fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			fast.next = null;
		}
		
		
	}
	
	
}
