package com.algorithms;

public class SearchMatrix {

	public static void main(String[] args) {
		
		int mat[][] = { { 10, 20, 30 }, 
                { 15, 25, 35 }, 
                { 27, 29, 37 }, 
                { 32, 33, 39 } }; 

		
		System.out.println("The matrix is: ");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		//Check if you can get only 3 30 38
		System.out.println(matSearch(mat,4,3,1)? "Found" : "Not Found");
		
		
	}
	
	static boolean matSearch(int mat[][],int N,int M,int x) {
		
		//Take the top right index
		int i = 0,j=M-1;
		boolean found = false;
		while(i<N && j>=0) {
			if(mat[i][j]==x) {
				found =  true; break;
			}
			
			else if(mat[i][j]>x) {
				//move leftwards by decrementing j
				j--;
			}
			else {
				//move downwards
				i++;
			}
		}
		return found;
		
	}

}
