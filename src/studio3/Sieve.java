package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("give an integer: ");
		int n=in.nextInt();
		boolean[] sieve= new boolean[n+1];
		
		sieve[1]=false;
		
		for (int i=2; i<=n; i++)
		{
			int t=0;
			for (int j=2; j <= Math.sqrt(i); j++)
			{
				if (i%j==0)
				{
					t=1;
				}	
			}
			
			if (t==1)
			{
				sieve[i] = false;
			}
			else if (t==0)
			{
				sieve[i] = true;
			}
		}
		
		for (int i=1; i<=n; i++)
		{
			if (sieve[i]==true)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
