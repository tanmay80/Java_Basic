package programs;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		boolean prime= true;
		for(int i=2;i*i<n;i=i+1)
		{
			if(n%i==0)
			{
				prime = false;
				break;
			}
		}
		if(prime==false)
		{
			System.out.println("NOT prime");
		}
		else
		{
			System.out.println("is prime");
		}
	}

}
