package pattern;

import java.util.Scanner;

public class Triangle_at_the_edge {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
//		int flag=0;
		for(int i=0;i<=n;i=i+1)
		{
			int n1=n/2;
			if(i<n1)
			{
				for(int j=i;j<n1;j=j+1)
				{
					System.out.print("*");
				}
				for(int j=0;j<i+1;j=j+1)
				{
					System.out.print("  ");
				}
				for(int j=i;j<n1;j=j+1)
				{
					System.out.print("*");
				}
			}
			else
			{
//				if(flag==0)
//				{
//					System.out.println();
//					flag=1;
//				}
				for(int j=n1;j<i;j=j+1)
				{
					System.out.print("*");
				}
				for(int j=i;j<n+1;j=j+1)
				{
					System.out.print("  ");
				}
				for(int j=n1;j<i;j=j+1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
