package com.algorithms;

import java.util.HashMap;
import java.util.HashSet;

class NodeClass{
	int data;
	NodeClass next;
	NodeClass(int data){
		this.data = data;
	}
	
	
}

public class RemoveLoopLinkedList {

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
        // code here
        // remove the loop without losing any nodes
    	HashSet<NodeClass> set = new HashSet<NodeClass>();
    	NodeClass temp = head;
    	NodeClass previous = null;
    	while(temp!=null) {
    		
    		if(set.contains(temp)) {
    			//This means that this node is already present. So break the link.
    			//Make the next of the previous node point to null
    			previous.next = null;System.out.println("Loop removed!");break;
    		}
    		set.add(temp);
    		previous = temp;
    		temp = temp.next;
    	}
    	
    }
    

}
