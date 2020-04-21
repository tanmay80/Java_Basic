package pattern;

import java.util.Scanner;

public class SIdeway_star {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int rows=2*n;
		for(int i=0;i<rows;i=i+1)
		{
			if(i<n)
			{
				for(int j=0;j<=i;j=j+1)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int j=0;j<rows-i-1;j=j+1)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
