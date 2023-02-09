package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input higher end of range of numbers");
		int n = in.nextInt();
	

		boolean[] prime = new boolean[n+1];
		
		int i;
		for(i = 2; i < n+1; i++)
		{
			prime[i] = true;
		}
		
		for(i = 2; i < n + 1; i++)
		{
			for(int j = 2*i; j< n+1; j = j+i)
			{
					prime[j] = false;
			}
		}
		
		for(i = 2; i < n+1; i++)
		{
			if (prime[i] == true) {
				System.out.print(i + " ");
			}
		}
	}

}
