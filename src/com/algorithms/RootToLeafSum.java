package com.algorithms;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    
    
} 
    


	
	
    class Tree{
    	
    	Node root; 
    	
    	
    	public boolean hasPathSum(Node node, int sum) {
    		
    		if(node == null) {
    			return (sum==0);
    		}
    		return hasPathSum(node.left, sum-node.data) || hasPathSum(node.right, sum-node.data);
    		
    	}
    }
    
public class RootToLeafSum {
	
	

	public static void main(String[] args) {
		Tree tree = new Tree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        
        int sum = 1;
        
        if (tree.hasPathSum(tree.root, sum))
            System.out.println(
                "There is a root to leaf path with sum "
                + sum);
        else
            System.out.println(
                "There is no root to leaf path with sum "
                + sum);

	}
	
	

}
