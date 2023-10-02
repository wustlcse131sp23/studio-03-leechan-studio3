package studio3;
import java.util.Scanner;

public class SievePractice {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Whats your n");
			int n = in.nextInt();
			
			boolean[] sieve = new boolean[n];
			
			for(int i = 0; i < n; i++) {
				while(sieve[i] = false) {
					for(int j = 2; j < n - 2; j++) {
						if(i % j == 0) sieve[i] = true;
					}
				}
				
			}
			
			for(int i=1; i<=n; i++) {
				if (sieve[i-1]=true) System.out.println(i + " ");
			}
		}
		
	}

}
