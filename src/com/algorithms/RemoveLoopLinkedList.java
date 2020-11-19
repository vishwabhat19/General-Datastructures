package com.algorithms;

import java.util.HashMap;

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
		n3.next = null;
		
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
    	HashMap<NodeClass, Integer> map = new HashMap<>();
    	NodeClass temp = head;
    	NodeClass previous = null;
    	while(temp!=null) {
    		
    		if(map.containsKey(temp)) {
    			//This means that this node is already present. So break the link.
    			//Make the next of the previous node point to null
    			previous.next = null;System.out.println("Loop removed!");break;
    		}
    		map.put(temp, 1);
    		previous = temp;
    		temp = temp.next;
    	}
    	
    }
    

}
