import java.util.Scanner;

public class SieveOfEratosthenes {
	
	/*
	 * Program to find all the prime numbers between 2 to the given number n
	 * using O(loglogn) time complexity
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		findPrimes(n);
		scanner.close();

	}
	
	static void findPrimes(int n) {
		
		boolean b[] = new boolean[n+1];
		
		for(int i=0;i<=n;i++) {
			b[i] = true;
		}
		
		//Start checking for each number from 2
		for(int p=2;(p*p)<=n;p++) {
			
			for(int i = p*p;i<=n;i=i+p) {
				if(b[i]==true) {
					b[i] = false;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(b[i]==true) {
				System.out.println(i);
			}
		}
	}

}
